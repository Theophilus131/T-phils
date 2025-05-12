 import java.util.Scanner;
 public class TestDriller{
 public static void main(String [] args){

  Scanner input = new Scanner(System.in);

  System.out.println("How many copies do you want? ");
   int number = input.nextInt();

 System.out.println("amount to be paid : " +   DrillerAssignment.pricePerCopy(number));



}


		}