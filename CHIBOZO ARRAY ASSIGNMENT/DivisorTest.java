	import java.util.Scanner;
	import java.util.Arrays;
	 
	public class DivisorTest{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many Element do you want: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

       System.out.println("the divisible numbers are: " +Arrays.toString(NumberDivisor.isDivisible(size[])));


	}
}