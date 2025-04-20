 //Create a new app!!! Redo our mystery game with loops but it should keep asking until the user guesses correctly. For every wrong 3 guesses, the app just change the //mystery number (Notify //the user that the mystery number has changed every time you change it). You should output congratulations and the number of guesses



import java.util.Scanner;
	public class MysteryGameThirdLoop{
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
          
 	 if(counter % 3 == 0){
         computerNumber = (int)(Math.random() * 10) + 1;
	System.out.println(" the mystery number has been changed: ");
    
      }

   	 }

      if( userGuess  == computerNumber){
           System.out.println("Congratulation you guessed it correctly");
              System.out.println("number of guess: " + counter);
		}




}


}