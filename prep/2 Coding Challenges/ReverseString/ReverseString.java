package ReverseString;

// 🚨 How do we get the argument from the terminal?
public class ReverseString {

  public static void main(String[] args) {
    // 🚨 What is String[] args mean?
    String answer = reverse("Hello, world!");
    System.out.println("answer: " + answer);
    String undo = new StringBuilder(answer).reverse().toString();
    System.out.println("Undo with StringBuilder(): "+ undo);
  }

  public static String reverse(String input) {

    int stringLength = input.length();
  
    String reverse = "";

    for (int i = stringLength - 1; i >= 0; i--) {
      System.out.println("i# "+i);
      reverse += input.charAt(i);
    }

    return reverse;
  }



}
