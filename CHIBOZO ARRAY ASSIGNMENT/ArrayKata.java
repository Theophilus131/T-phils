
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
}