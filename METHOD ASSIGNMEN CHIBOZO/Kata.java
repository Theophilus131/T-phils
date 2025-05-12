 public class Kata{


   
  		public static boolean isEven(int number){
		return (number % 2 == 0);
				}

		
		public static boolean isPrimeNumber(int number) {
		if (number <= 1) return false;
		for (int count = 2; i <= number / 2; count++) {
        	if (number % count == 0) {
            	return false;
  		}  
  			}
		return true;
  			}


		public static int subtract(int number1, int number2){

		if(number1 > number2)
		return (number1 - number2);
		else return (number2 - number1);
	                }

  		public static float divide(float number1, float number2){
		if(number2 == 0)
		return ( 0 );

		else return (number1 / number2);	
                 			}

		 public static int factorOf(int number){
  		int count;
  		for(count = 1; count <= number; count++  ){
  		if(number % count == 0){
			count++;
  				}
     					}      
			return count;
				}


		public static boolean isSquare(int number){
   		
   		return (Math.sqrt(number) % 1 == 0);
		

				}

		
		public static long factorialOf(long number){
   		long factorial = 1;
		long count;
 		for(count = 1; count <= number; count++){
 		factorial *= count;
			}
		return factorial ;
			}
		
		public static boolean isPalindrome(int number){

  		int firstNumber = (number / 10000) % 10;
   		int SecondNumber =(number / 1000) % 10;
    		int ThirdNumber =(number / 100) % 10;
    		int fourthNumber =(number / 10) % 10;
     		int fifthNumber = number % 10;
				
       		 return (firstNumber == fifthNumber);
				
			}
				
			
		public static long square(long number1){
		return number1 * number1;
				}	
					


}


