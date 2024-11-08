
/* 🐌 TLDR; 🐌

 Terminal -> Can only execute if a file object with `public static void main`
 Class reference -> must be STATIC, dosn't need public because that only has to do with instances.
 Instance reference -> must be PUBLIC, static will work, but must be executed in a static way. 
   - So kinda like "Why" arn't you just accessing class direclty Tests, instead of test.
   - Can't do tests.aPrivateMethod.
 Private reference -> 
   - fields only availle within other functions in the class. So, can't be called directly from an instance, or class.

*/
// Example terminal command: `java Tinkering.java hi there`
// - You MUST include 2 params, or will error.

public class Scope {
  public static void main(String[] args) {
    System.out.println("\n----\n\nargs[0] args[1]:"+args[0]+" "+args[1]);

    // * At this level, must include 'static'
    System.out.println("\n"+Tests.class_variable);
    // System.out.println(Tests.instance_variable); // * ❌ this will fail because it dosn't have a static field

    Tests.myPublicStaticMethod(); 
    Tests.myStaticMethod(); 
    // Tests.publicMethod(); // * ❌ this will fail because not static, so undefined
    // Tests.myNoAccessModifierMethod(); // * ❌ this will fail because not static, so undefined
    // Tests.myPrivateMethod(); // * ❌ this will fail because it's not visible.


    // * At this level, must include 'static', 'public', or package-private(default) if no access modifyer is given.
    Tests tests = new Tests(args);
    System.out.println("\n"+tests.instance_variable); 
    // System.out.println(tests.private_instance_variable); // * ❌ this will fail because it's not visible.

    tests.myStaticMethod(); // * 👀 This has a warning but works, because doing this should be executed in a static way.
    tests.myPublicMethod();
    tests.myNoAccessModifierMethod();
    // tests.myPrivateMethod(); // * ❌ this will fail because it's not visible.
    
  }
}

class Tests {

  String greeting;

  static String class_variable = "static String class_variable";
  String instance_variable = "String instance_variable"; 
  private String private_instance_variable = "private String private_instance_variable"; 


  public Tests(String[] args) {
    myPrivateMethod();
  }

  public static void myPublicStaticMethod() {
    System.out.println("\nmyPublicStaticMethod()");
  }

  static void myStaticMethod() {
    System.out.println("\nmyStaticMethod()");
  }

  public void myPublicMethod() {
    System.out.println("\nmyPublicMethod()");
  }

  void myNoAccessModifierMethod() {
    System.out.println("\nmyNoAccessModifierMethod()");
  }

  private void myPrivateMethod() {
    System.out.println("\nmyPrivateMethod() ");
    System.out.println(private_instance_variable);

    String newString = returnPrivateString("something");
    System.out.println("newString: "+newString);
  }

  private String returnPrivateString(String argString) {
    return "You sent me "+argString;
  }

}


