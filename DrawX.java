package LAB7A;

/***************************************************************
 Filename: DrawX
 Created by: Melat Semereab
 Created on: 10/18/2021
 Comment: draw word X using astric by three different methods
 ***************************************************************/

public class DrawX
{
    //to draw the top and bottom line
   public static void drawOuter()
   {
      System.out.print("*\t\t\t\t*");
   }
   //to draw the second and fourth lines
   public static void drawInner()
   {
      System.out.println("\n\t*\t\t*\t");
   }
   //drawMiddle() – to draw the middle line
   public static void drawMiddle()
   {
      System.out.println("\t\t*\t\t");
   }

   public static void main(String args[])
   {
      drawOuter();
      drawInner();
      drawMiddle();
      drawInner();
      drawOuter();


   }
}