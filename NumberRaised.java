//Use a for loop to multiply the result by the base for the number of times specified by the exponent. int base = 3; int exponent = 4; int result = //1; for (int i = 0; i < exponent; i++) { result *= base; } System. out. println("Result: " + result);



import java.util.Scanner;
 public class NumberRaised{
 public static void main(String [] args){

	 Scanner input = new Scanner(System.in);
	System.out.println("Enter integer: ");
 	int base = input.nextInt();

	System.out.println("Enter second integer: ");
  	int exponent = input.nextInt();

    	int result =1;
   
 
  	for( int i = 0; i < exponent; i++){

   	result *= base;

	}
 	 System.out.println("Result: " + result);


      }



   }