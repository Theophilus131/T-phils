  	import java.util.Scanner;
 	public class FactoriaNumber{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
  
	System.out.print("Enter any number: ");
	long Number= input.nextLong();


 	long counter = 0;
 	long factorial = 1;
 	counter = Number; 
	while( counter != 0){

	factorial= factorial * counter;
	counter--;
	}

	System.out.println("the Factorial of number is " + factorial);

	}

	}