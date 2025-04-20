import java.util.Scanner;
public class LargestandSmallest{
public static void main(String [] args){
      Scanner input = new Scanner(System.in);
	
    System.out.print("enter numbers and enter (-1) to stop: ");
        int number = input.nextInt();
 
 	int Largest = 0;
        int Smallest = 0;
        int counter = 1;

   while(number != -1 ){
	System.out.print("enter numbers and enter (-1) to stop: ");
   number = input.nextInt();
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
	if(number == -1) {
	System.out.print("you have exited the loop");
	}
	else {
         
	System.out.println("largest number is " + Largest);
 	System.out.println("smallest number is " + Smallest);
	}

	 
   }

}