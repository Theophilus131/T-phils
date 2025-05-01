  import java.util.Scanner;

  	public class MortgageCalculator{
  	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
  
   	System.out.println("Enter the amount you wish to borrow: ");
     	double principal = input.nextDouble();
 
    	System.out.println("Enter yearly interest rate offered on the mortgage: ");
     	double annualInterestRate= input.nextDouble();

    	System.out.println("Enter the duration in year: ");
      	double duration = input.nextDouble();

      	double PercentageMonthly = annualInterestRate / 100;
      	double monthlyRate = PercentageMonthly / 12;

       	double yearDuration = duration * 12;

  	double monthlyPayment = (principal * monthlyRate * Math.pow(1 + monthlyRate, yearDuration)) / (Math.pow(1 + monthlyRate, 	yearDuration) - 1);


    	System.out.printf("Your monthly mortgage payment is: $%.2f%n", monthlyPayment);      



	}



}