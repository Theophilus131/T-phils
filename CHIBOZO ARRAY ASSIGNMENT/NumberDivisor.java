public class NumberDivisor{



public static int [] isDivisible(int [] numbers, int divisibleBy){

   int count = 0;
   
  for(int i = 0; i< numbers.length; i++){

   if(numbers[i] % divisibleBy == 0){
  
     count++;

	}
}

	int[] result = new int[count];
		int index = 0;
	for(int i = 0; i< numbers.length; i++){
	
	if(numbers[i] % divisibleBy == 0){
	
           result [index] = numbers[i];
	index++;

	}
}

	return result;



}