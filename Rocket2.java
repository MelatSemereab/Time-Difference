package LAB7A;
import java.util.Scanner;
/***************************************************************
 Filename: Rocket2
 Created by: Melat Semereab
 Created on: 10/20/2021
 Comment: This program should do the same as Rocket.java (read in
 3 integers representing the blast-off time of a rocket expressed in hours, minutes and seconds on
 the 24-hour clock (assume valid input). Then read another integer giving the rocket's flight time in
 seconds. Use the data to calculate the time of day at which the rocket will return to earth and print
 out this time in a readable format). You should create 3 process methods as follows:
 readData() – read in blast-off time (hours, minutes and seconds) and flight time
 calculateArrivalTime() – calculate arrival time (hours, minutes and seconds)
 outputResults() - Output results in the following format:
 ***************************************************************/

public class Rocket2
{


  //to read data from end user
   public static void readData()
   {
       Scanner keyboard = new Scanner(System.in);
       int hour, minute, second, givenTotalSecond;
       System.out.println("Enter the start off hour ");
       hour = keyboard.nextShort();

      System.out.println("Enter the start off minute ");
      minute = keyboard.nextInt();

      System.out.println("Enter the start off second ");
      second = keyboard.nextInt();

      System.out.println("Enter the rocket's flight time in seconds ");
      givenTotalSecond = keyboard.nextInt();
      calculateArrivalTime(hour, minute, second , givenTotalSecond);
   }
   //calculating the arrival time
   public static void calculateArrivalTime(int pHour, int pMinute, int pSecond, int pGivenTotalSecond)
   {
       pHour = pGivenTotalSecond / 3600;
       pMinute = (pGivenTotalSecond % 3600) / 60;
       pSecond = (pGivenTotalSecond % 3600) % 60;
       //System.out.println(pHour + ":" + pMinute + ":" + pSecond);
   }

   public static void main(String args[])
   {
       readData();

   }
}