package GuessingGame;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    Random random = new Random();
    int numberToGuess = random.nextInt(10) + 1; 
    int guess = 0; 

    int randomBound = 3;
    for (int i = 0; i < 20; i++) {
      int x = random.nextInt(randomBound) + 1;
      System.out.println("Testing random range ("+randomBound+") -i#" + i + " - " + x);
    }

    System.out.println("\n\nWelcome to the Number Guessing Game!");
    System.out.println("I'm thinking of a number between 1 and 10. Can you guess it?\n");

    while (guess != numberToGuess) {
      System.out.print("Enter your guess: ");
      guess = s.nextInt(); // Read user's guess

      if (guess < numberToGuess) {
          System.out.println("Too low! Try again.");
      } else if (guess > numberToGuess) {
          System.out.println("Too high! Try again.");
      } else {
          System.out.println("Congratulations! You guessed the number " + numberToGuess);
      }
    }

    s.close();
  }
}