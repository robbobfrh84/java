public class World {

  public static void main(String[] args) {
    Town town = new Town("Fire City", 23);
    Person person = new Person("Shareena", 38, "Chef");

    System.out.println("Welcome to " + town.name + " "+ person.name+"!");
  }

}
