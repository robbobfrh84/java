Here are a few common Java coding questions you might encounter in a live coding interview, along with suggested clarifying questions and solutions.

------

### Question 1: Reverse a String

**Problem**: Write a function that takes a string and returns the reverse of the string.

#### Clarifying Questions

- **What should I do if the input string is empty or null?** (Generally, you should return an empty string or handle null as an edge case.)
- **Is there a specific character encoding I should be aware of?** (Typically, you can assume standard UTF-8.)

#### Solution

Here’s a solution using a `StringBuilder`:

```java
public class StringReverser {
    public static String reverse(String input) {
        if (input == null) {
            return "";
        }
        return new StringBuilder(input).reverse().toString();
    }
    
    public static void main(String[] args) {
        System.out.println(reverse("hello")); // Output: "olleh"
    }
}
```

In this solution, we use `StringBuilder`'s `reverse()` method, which provides an efficient way to reverse a string.

------

### Question 2: Check if a Number is Prime

**Problem**: Write a function that checks if a given number is a prime number. A prime number is only divisible by 1 and itself.

#### Clarifying Questions

- **What should I return for negative numbers or zero?** (Usually, we return false for non-positive numbers.)
- **How large could the input number be?** (This helps in considering algorithm efficiency.)

#### Solution

This solution checks divisibility up to the square root of the number to improve efficiency.

```java
public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPrime(5)); // Output: true
        System.out.println(isPrime(4)); // Output: false
    }
}
```

------

### Question 3: Find the Missing Number in an Array

**Problem**: Given an array of integers from 1 to n with one missing number, find the missing number.

#### Clarifying Questions

- **Is the array sorted?** (It usually doesn't have to be, but ask to confirm.)
- **Is there always only one number missing?** (Usually, yes, but it’s worth confirming.)

#### Solution

Here’s a solution using the sum formula for the first n numbers:

```java
public class MissingNumberFinder {
    public static int findMissingNumber(int[] numbers, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int number : numbers) {
            actualSum += number;
        }
        return expectedSum - actualSum;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5}; // Missing number is 4
        System.out.println(findMissingNumber(numbers, 5)); // Output: 4
    }
}
```

In this solution, we calculate the expected sum for numbers from 1 to n and subtract the sum of elements in the array to find the missing number.

------

### Question 4: Implement FizzBuzz

**Problem**: Write a function that prints numbers from 1 to n. For multiples of 3, print "Fizz" instead of the number, for multiples of 5, print "Buzz", and for multiples of both 3 and 5, print "FizzBuzz".

#### Clarifying Questions

- **Should I print or return the values?** (Typically, this question requires printing, but confirm with the interviewer.)
- **What should I do for negative numbers or zero?** (Usually, handle positive integers only, but it’s best to clarify.)

#### Solution

```java
public class FizzBuzz {
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
```

This solution iterates from 1 to `n`, checking conditions for multiples of 3 and 5 to print "Fizz", "Buzz", or "FizzBuzz".

------

### Question 5: Find the First Non-Repeated Character in a String

**Problem**: Write a function that takes a string and returns the first non-repeated character. If all characters are repeated, return `null`.

#### Clarifying Questions

- **What should I return if all characters are repeated?** (Usually `null` or some indication that no unique character exists.)
- **What should I do with spaces or special characters?** (Generally, treat them as part of the string, but it’s best to confirm.)

#### Solution

This solution uses a `LinkedHashMap` to maintain insertion order.

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static Character findFirstNonRepeatedChar(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // All characters are repeated
    }
    
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedChar("swiss")); // Output: "w"
    }
}
```

In this solution, we use a `LinkedHashMap` to store each character and its count, maintaining order. Then, we iterate through the map to find the first character with a count of 1.

------

These questions cover basic algorithms, string manipulation, control flow, and data structures that are commonly used in Java. Be sure to ask for clarification to fully understand each problem's constraints and edge cases.
