import java.util.Scanner;
public class LargestandSmallest{
public static void main(String [] args){
      Scanner input = new Scanner(System.in);
	
    System.out.print("enter numbers and enter (-1) to stop: ");
        int number = input.nextInt();
 
 	int Largest = 0;
        int Smallest = 2_000_000_0;
        int counter = 1;

   while(number != -1 ){
   number = input.nextInt();

	if(number == -1) {
	 break;
		}

	  if (counter == 0) {
	    Largest = number;
	    Smallest = number;
		}

	if( number > Largest ){
         Largest = number;
		}

	if(number < Smallest ){
         Smallest = number;
    		 }
	counter++;

	}
	System.out.println("largest number is " + Largest);
 	System.out.println("smallest number is " + Smallest);

	 
	
	
	
   }

}