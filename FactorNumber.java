//Please do me a small app.
//The app asks the user for a number, then prints all the factors of the number
	

	import java.util.Scanner;
   	public class FactorNumber{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

   	System.out.print("Enter any number: ");
      	int number = input.nextInt();
	
	System.out.println( "Factors of " + number + " are " );
     	int count = 1;
	
     	while(count <= number){
        if(number % count == 0){
        System.out.println(count + " ");
	  
		}
	 count++;

		}

   
	}


	}