public class Sum{


public static int finalSum(int number){

int total = 0;

if(number >= 1 && number <= 10000 ) {

int firstNumber = (number / 10000) % 10;

int secondNumber = (number / 1000) % 10;

int thirdNumber = (number / 100) % 10;

int fourthNumber = (number / 10) % 10;

int fifthNumber =  number % 10;

   total = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
}

 return (total);



	}



}