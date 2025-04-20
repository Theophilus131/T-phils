import java.util.Scanner;
public class PrimeNumber{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

	int counter=0;
 	int i= 0;
 	int number= 0;
	System.out.print("Enter any Integer: ");
  	number= input.nextInt();
 

for(i = 2; i<= number/2; i++ ){
   if (number % i == 0){
      counter++;
}
}


  if(counter == 0 && number != 1)
   System.out.println( number + " is a prime number");
  else{
    System.out.println(number + " is not a prime number");
  }










}





}