import java.lang.reflect.Field;
import java.util.Arrays;

public class Variables {

  public static void main(String[] args) {

    VariablesExplore vars = new VariablesExplore(
      "Hello", 
      new int[]{6,7,8,9,0},
      new Person(40, "bob")
    );

    vars.printAll();
    System.out.println(vars.greeting);
    System.out.println(vars.luckyNumbers[0]);
    System.out.println(Arrays.toString(vars.luckyNumbers));
    System.out.println(vars.person.name);

    // ⭐️ BONUS 
    vars.printVar("greeting");
  }
}

class Person {
  int age;
  String name;

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }
}

class VariablesExplore {

  byte age = 40; // 8-bit signed integer (-128 to 127)
  short temperature = 300; // 16-bit signed integer (-32,768 to 32,767)
  int number = 5; // 32-bit signed integer (-2,147,483,648 to 2,147,483,647)
  long population = 7800000000L; // 64-bit signed integer(+/- 9+ quintillion)
  float pi = 3.14f; //  32-bit (7 decimal digits)
  double floatNum = 4.5; // 64-bit floating-point (15 decimal digits)
  boolean isOn = false; // Size: 1 bit (although size may vary by JVM)
  char grade = 'A'; // 16-bit Unicode character

  String greeting;
  int[] luckyNumbers;
  Person person; 

  public VariablesExplore(String string, int[] array, Person person) {
    greeting = string;
    this.luckyNumbers = array;
    this.person = person;
  }

  public void printAll() {
    System.out.println("age: "+age);
    System.out.println("temperature: "+temperature);
    System.out.println("number: "+number);
    System.out.println("population: "+population);
    System.out.println("pi : "+pi );
    System.out.println("floatNum: "+floatNum);
    System.out.println("isOn: "+isOn);
    System.out.println("grade: "+grade);
  }

  // ⭐️ BONUS 
  public void printVar(String var) {
    try {
      Field field = this.getClass().getDeclaredField(var);
      field.setAccessible(true);
      System.out.println(field.get(this));
    } catch (NoSuchFieldException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  
}

