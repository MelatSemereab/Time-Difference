package LAB7A;

import java.util.Scanner;
import java.text.DecimalFormat;
/***************************************************************
 Filename: Circle2
 Created by: melat
 Created on: 10/18/2021
 Comment: calculating area and perimeter of a circle using a method.
 ***************************************************************/

public class Circle2
{
   // declaring a constant
   static final double MULTIPLIER = 2.0;
   static double radius;

   //a method to calculate the area
   public static double getArea()
   {
      return Math.PI * Math.pow(radius, 2);
      // return statement
   }//getArea
   //a method to calculate the circumference

   public static double getCircumference()
   {
      return MULTIPLIER * Math.PI * radius;
      // return statement
   }//getCircumference

   public static void main(String[] arguments)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");
      double area, circumference;
      System.out.print("Enter radius of a circle - ");
      radius = keyboard.nextDouble();
      area = getArea();
      // call the getArea() method
      circumference = getCircumference();
      // call the getCircumference() method
      System.out.print("Area of circle = " + df.format(area) + "\n\n");
      System.out.println("Circumference of circle = " + df.format(circumference));
   }//main
}//class


