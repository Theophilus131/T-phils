import java.util.Scanner;
public class SumDowhile{
public static void main(String [] args){

 Scanner input = new Scanner(System.in);
 int sum = 0;
 int terminate;
  

 do{
  System.out.println("Enter two number: ");
  int firstNumber = input.nextInt();
  int secondNumber = input.nextInt();
 
     sum= firstNumber + secondNumber;
   System.out.println("The sum is: " + sum);
   
 
   System.out.print(" Do you wish to perform this tasks again or enter 0 to end the operation: ");
   	terminate = input.nextInt();
 

  }while( terminate != 0);

   System.out.println("Program ended.");
	
        

	}



}