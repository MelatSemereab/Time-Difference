package LAB7A;

import java.util.Scanner;

/***************************************************************
 Filename: TestMethods1
 Created by: melat zerai
 Created on: 10/18/2021
 Comment: testing different methods
 ***************************************************************/

public class TestMethods1
{
   static Scanner keyboard = new Scanner(System.in);

   // Method to read in and return an integer
   public static int reanNumber()
   {
      System.out.println("Enter a real number: ");
      return keyboard.nextInt();
   }

   // Method to read in and return a name
   public static String whoAmI()
   {
      System.out.println("Please enter your name: ");
      return keyboard.nextLine();
   }

   // Method to read in a number then test if a number has been guessed correctly
   public static boolean goodGuess()
   {
      final int CORRECT = 3;
      int number;
      number = reanNumber();
      if (number == CORRECT)
         return true;
      else
         return false;
   }

   // Method to read in 2 integers and return their sum
   public static int sumOfNumbers()
   {
      int number1, number2;
      number1 = reanNumber();
      number2 = reanNumber();
      return (number1 + number2);
   }

   // Method to read in 2 integers and return their product
   public static int productOfNumbers()
   {
      int number1, number2;
      number1 = reanNumber();
      number2 = reanNumber();
      return (number1 *number2);
   }
      // Method to read in 2 integers and return the larger
      public static int max()
      {
         int number1, number2, largestNumber;
         number1 = reanNumber();
         number2 = reanNumber();
         largestNumber = number1;
         if (number1 < number2)
            largestNumber = number2;
         else if (number1 > number2)
            largestNumber = number1;
         else
            System.out.println("They are equal.");

         return largestNumber;
      }

      public static void main(String[] args) {
         String name;
         boolean correct;
         int sum, product, largerNumber;
         System.out.println("Testing whoAmI()");
         System.out.println("****************");
         name = whoAmI();
         System.out.println("Your name is " + name + "\n");
         System.out.println("Testing goodGuess()");
         System.out.println("*******************");
         correct = goodGuess();
         if (correct) {
            System.out.println("You have guessed correctly\n");
         }//if
         else {
            System.out.println("You have guessed incorrectly\n");
         }//else
         System.out.println("Testing sumOfNumbers()");
         System.out.println("**********************");
         sum = sumOfNumbers();
         System.out.println("The sum of the two numbers is " + sum + "\n");
         System.out.println("Testing productOfNumbers()");
         System.out.println("**************************");
         product = productOfNumbers();
         System.out.println("The product of the two numbers is " + product + "\n");
         System.out.println("Testing max()");
         System.out.println("*************");
         largerNumber = max();
         System.out.println("The larger of the two numbers is " + largerNumber);
      }//main
   }//class