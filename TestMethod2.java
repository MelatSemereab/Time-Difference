
package LAB7A;
import java.text.DecimalFormat;
import java.util.Scanner;
/***************************************************************
 Filename: TestMethod2
 Created by: Melat Zerai
 Created on: 10/18/2021
 Comment: Different methods
 ***************************************************************/


public class TestMethod2
{
   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("00.00");
   // Method to read in and return an integer
   public static int readInteger(String text)
   {
      System.out.print("Enter " + text);
        return keyboard.nextInt();
   }//readInteger
   //This method accepts an integer value as a parameter and returns the resultof trebling the value passed in
   public static int multiplyBy3(int pNumber)
   {
      return Math.multiplyExact(3,pNumber);
   }

   // This method accepts an integer value as a parameter and returns one greater than the number
   public static int addOne(int pNumber)
   {
       return pNumber + 1;
   }
   // - This method accepts two integer values as parameters and returns the product of the two numbers product
   public static int product(int pNumber1, int pNumber2)
   {
      return pNumber1 * pNumber2;
   }
   // – This method accepts three double values as parameters representing a
   //length in yards, feet and inches and returns the length in metres (to 2 decimal places).
   //There are 12 inches in 1 foot, 3 feet in 1 yard and 39.39 inches in 1 metre. Assume 0 <=inches < 12 and 0 <= feet < 3.

   public static double convertToMetres(double pYards, double pFeet, double pInch)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");
      double yard, foot, inch, total, meterLength;

      System.out.println("Please enter the length in yard: ");
      yard = keyboard.nextDouble();
      System.out.println("Please enter the length in feet: ");
      foot = keyboard.nextDouble();
      System.out.println("Please enter the length in inch: ");
      inch = keyboard.nextDouble();
      //yard to inch
      yard = yard * 36;
      //foot to inch
       foot = foot * 12;
       total = yard + foot + inch;
       meterLength = 39.39 * total;
       return meterLength;

   }
   //– This method accepts an integer (0-9) as a parameter and return the equivalent wordString "zero", "one" … "nine"
   /*public static int convertToWords(String 0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
   {
      if ()
   }*/

   public static void main(String[] args) {
      int number1, number2, number3, answer;
      double metres;
      String numberInWords;
      System.out.println("Testing multiplyBy3()");
      System.out.println("*********************");
      number1 = readInteger("a number: ");
      answer = multiplyBy3(number1);
      System.out.println(number1 + " multiplied by 3 = " + answer + "\n");
      System.out.println("Testing addOne()");
      System.out.println("*************");
      number1 = readInteger("a number: ");
      answer = addOne(number1);
      System.out.println(number1 + " + 1 = " + answer + "\n");
      System.out.println("Testing product()");
      System.out.println("*****************");
      number1 = readInteger("first number: ");
      number2 = readInteger("second number: ");
      number3 = readInteger("third number: ");
     // answer = product(number1, number2, number3);
      System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + "\n");
      System.out.println("Testing convertToMetres()");
      System.out.println("*************************");
      number1 = readInteger("yards: ");
      number2 = readInteger("feet: ");
      number3 = readInteger("inches: ");
      metres = convertToMetres(number1, number2, number3);
      System.out.println(number1 + " yards, " + number2 + " feet, " +
            number3 + " inches = " + df.format(metres) + " metres\n");
      System.out.println("Testing convertToWords()");
      System.out.println("************************");
      number1 = readInteger("a number: ");
     // numberInWords = convertToWords(number1);
      //System.out.println(number1 + " = " + numberInWords + "\n");
   }//main
}//class
