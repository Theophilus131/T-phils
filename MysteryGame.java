 //Create a new app!!! Redo our mystery game with loops but it should keep asking until the user guesses correctly. You should output congratulations and the number of //guesses

	import java.util.Scanner;
	public class MysteryGame{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	int computerNumber = (int)(Math.random() * 10) + 1;
	System.out.println(computerNumber);

     	int userGuess = input.nextInt(); 

    	int counter = 0;

     	while(userGuess != computerNumber){

	if( userGuess > computerNumber){
	System.out.println(" wrong guess : ");
          System.out.println("Enter number: ");
        userGuess= input.nextInt();
		}

	if(userGuess < computerNumber){
	System.out.println(" wrong guess: ");
          System.out.println("Enter number: ");
        userGuess= input.nextInt();
		 }

        counter++;
     
    }

      if( userGuess  == computerNumber){
           System.out.println("Congratulation you guessed it correctly");
              System.out.println("number of guess: " + counter);
		}

    }
            }