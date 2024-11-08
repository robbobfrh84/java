package net.es.phonescreen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneScreen {
     /*
     - walk us through main()
     - what is the value of boolean result after the code runs
     - what is the console output, if any? 
     */

    public static void String main(String[] args) {
        List<NextHop> aNextHopsV6 = new ArrayList<>();
        aNextHopsV6.add(new NextHop("2620:114:e000::/44", "2001:db8:3333:4444:5555:6666:7777:5555"));
        aNextHopsV6.add(new NextHop("2001:400:b200::/48", "2001:db8:3333:4444:5555:6666:7777:5555"));
        Map<INET_FAMILY, List<NextHop>> aNHBF = new HashMap<>();
        aNHBF.put(INET_FAMILY.IPV6, aNextHopsV6);
        Network a = new Network("alpha", 3112, true, aNHBF);


        List<NextHop> bNextHopsV6 = new ArrayList<>();
        bNextHopsV6.add(new NextHop("2001:400:b200::/48", "2001:db8:3333:4444:5555:6666:7777:5555"));
        bNextHopsV6.add(new NextHop("2620:114:e000::/44", "2001:db8:3333:4444:5555:6666:7777:5555"));
        Map<INET_FAMILY, List<NextHop>> bNHBF = new HashMap<>();
        bNHBF.put(INET_FAMILY.IPV6, bNextHopsV6);
        Network b = new Network("alpha", 3112, true, bNHBF);

        boolean result = compare(a, b);
    }

    public boolean compare(Network a, Network b) {
        boolean fieldComparison = (a.sendRoute == b.sendRoute) && (a.filterNum == b.filterNum) && (a.device.equals(b.device));

        if (!fieldComparison) {
            System.out.println("field mismatch");
            return false;
        }

        for (INET_FAMILY inetFamily : INET_FAMILY.values()) {
            if (a.nextHopsByFamily.containsKey(inetFamily) && b.nextHopsByFamily.containsKey(inetFamily)) {
                List<NextHop> aNextHops = a.nextHopsByFamily.get(inetFamily);
                List<NextHop> bNextHops = b.nextHopsByFamily.get(inetFamily);

                if (!aNextHops.equals(bNextHops)) {
                    System.out.println("next hops mismatch");
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public enum INET_FAMILY {
        IPV4, IPV6
    }

    public static class Network {
        String device;
        int filterNum;
        boolean sendRoute;
        Map<INET_FAMILY, List<NextHop>> nextHopsByFamily;

        public Network(String device, int filterNum, boolean sendRoute, Map<INET_FAMILY, List<NextHop>> nextHopsByFamily) {
            this.device = device;
            this.filterNum = filterNum;
            this.sendRoute = sendRoute;
            this.nextHopsByFamily = nextHopsByFamily;
        }
    }

    public static class NextHop {
        String network;
        String nextHop;
        public NextHop(String network, String nextHop) {
            this.network = network;
            this.nextHop = nextHop;
        }
    }
}