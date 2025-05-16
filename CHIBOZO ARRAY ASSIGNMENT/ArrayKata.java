
  public class ArrayKata{


  public static int maximumIn(int [] ArrayOfIntegers ){
  
	int largest = ArrayOfIntegers[0];

	for(int Integer: ArrayOfIntegers){
	
	if(Integer > largest){
	largest = Integer;
		}
			}
	
		return (largest);
	}


public static int minimumIn(int [] ArrayOfIntegers ){
  
	int smallest = ArrayOfIntegers[0];

	for(int Integer: ArrayOfIntegers){
	
	if(Integer < smallest){
	smallest = Integer;
		}
			}
	
		return (smallest);
	}


 public static int sumOf(int [] ArrayOfIntegers){

   int total = 0;
   
      for(int Integer : ArrayOfIntegers){
	
	total += Integer;
}

	return total;

}

 
	public static int sumOfEvenNumbersIn(int []ArrayOfIntegers){
		int sumCount = 0;
		
	for(int Integer : ArrayOfIntegers){
	  if(Integer % 2 == 0)
	   sumCount += Integer;
		}
		
		return sumCount;
	}


public static int sumOfOddNumbersIn(int []ArrayOfIntegers){
		int OddNumberSum = 0;
		
	for(int Integer : ArrayOfIntegers){
	  if(Integer % 2 == 1)
	   OddNumberSum += Integer;
		}
		
		return OddNumberSum;
	}

 public static int [] maximumAndMinimumOf(int [] ArrayOfIntegers){
	int[] maxMin = new int [2];

  int largest = ArrayOfIntegers[0]; 
   int smallest = ArrayOfIntegers[0];

   for(int Integer : ArrayOfIntegers){ 

   if(Integer > largest){
	largest = Integer; maxMin[0] = largest;}

    if(Integer < smallest){
         smallest = Integer; maxMin[1] = smallest;}
	}

	return maxMin;

   }


	public static int noOfOddNumbersIn(int [] ArrayOfIntegers){
		int odd = 0;
        for(int integer : ArrayOfIntegers){

	if(integer % 2 == 1){
	     odd++;
		}
		}
         return (odd);

}

	public static int noOfEvenNumbersIn(int [] ArrayOfIntegers){
		int even = 0;
        for(int integer : ArrayOfIntegers){

	if(integer % 2 == 0){
	     even++;
		}
		}
         return (even);

}

	/*
      	public static int [] evenNumbersIn(int [] ArrayOfIntegers){		

		int evenCount = 0;
		
	 	int [] even = new int [1];
		 int Integers [] = {28, 10 , 78, 65, 34, 13, 79, 90, 56, 84};
		for(int i = 0; i <= Integers.length; i++){ 
		if(Integers[i] % 2 == 0)
		Integers[evenCount++] = Integers[i]

	      		 }
			}
         return even;

		}
		
			*/


 public static int [] squareNumbersIn(int [] ArrayOfIntegers){
    int[] result = new int[ArrayOfIntegers.length];

for(int i = 0; i < ArrayOfIntegers.length; i++){

	 result[i] = ArrayOfIntegers[i] * ArrayOfIntegers[i];
			}

 	 return result;

}
	
             
		

	}