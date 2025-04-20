	import java.util.Scanner;
	import java.util.Random;
	public class MysteryGameWithLoop{
	public static void main(String [] args){


	Scanner input = new Scanner(System.in);

	Random random = new Random();
	int computerNumber = random.nextInt(1, 11);
	System.out.print(computerNumber);
	int counter = 1;

	System.out.println("Enter number from 1 - 10: ");
	 int userNumber = input.nextInt();
	
	while(counter <= 2){

 	if( userNumber  == computerNumber){
           System.out.println("you are correct");
              }
   
	else if( userNumber > computerNumber){
	System.out.println(" number entered is too high: ");
         }

	else if(userNumber < computerNumber){
	System.out.println("number entered is too low: ");
          }

        counter++;
      System.out.println("Enter number from 1- 10: ");
        userNumber= input.nextInt();
    }

System.out.println(" Game over the number was: " + computerNumber);

					}
}








