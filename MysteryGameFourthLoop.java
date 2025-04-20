//Redo this but end the app if the user has 20 wrong guesses.


	import java.util.Scanner;
	public class MysteryGamefourthLoop{
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
          if( counter == 20){
	System.out.println(" To many wrong guess! Game over ");
      			break;
            }
       
   	 }

 	  if( userGuess  == computerNumber){
           System.out.println("Congratulation you guessed it correctly");
              System.out.println("number of guess: " + counter);
		}

}


}