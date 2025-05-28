import java.util.Scanner;
public class MultiplicationDriver{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("enter first number: ");
int number1 = input.nextInt();

System.out.println("Enter second number: ");
int number2 = input.nextInt();


MultiplicationTable.integer( number1, number2);

}
}