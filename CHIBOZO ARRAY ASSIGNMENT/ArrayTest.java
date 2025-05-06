 import java.util.Arrays;
  public class ArrayTest{ 
  public static void main(String [] args){


 int Integers [] = {28, 10 , 78, 65, 34, 13, 79, 90, 56, 84};

//System.out.println("Largest number in the array is: " + ArrayKata.maximumIn(Integers));
 
//System.out.println("smallest number in the array is:" + ArrayKata.minimumIn(Integers));

  //System.out.println("Sum of array is: "+ ArrayKata.sumOf(Integers));

  //System.out.println("Sum of even numbers in the array is:" + ArrayKata.sumOfEvenNumbersIn(Integers));

 //System.out.println("Sum of Odd numbers in the array is :" + ArrayKata.sumOfOddNumbersIn(Integers));

 System.out.println("The largest and smallest numbers are: " + Arrays.toString(ArrayKata.maximumAndMinimumOf(Integers)));

}
	}