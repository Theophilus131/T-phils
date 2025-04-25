
	import java.util.Scanner;
	public class StudentGrade{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
	int countA = 0;
	int countB = 0;
	int countC = 0;
	int countD = 0;
	int countF = 0;
	int countInvalid = 0;	

	for( int count = 0; count < 10; ){
	
	System.out.print("Enter Students Grades from 0 - 100: ");
  	int StudentGrade = input.nextInt();

	if(StudentGrade < 0 || StudentGrade > 100){
	System.out.print("invalid number entered: ");
	countInvalid++;
	continue;
	}
	count++;
	switch(StudentGrade / 10){
	
        case 8: 
	case 9:
	case 10: 
		System.out.println("A");
 		countA++;
		break;
	case 7: 
		System.out.println("B");
		countB++;
		break;

	case 6: 
		System.out.println("C");
		countC++;
		break;

	case 5:
		System.out.println("D");
		countD++;
		break;
	default: 
		System.out.println("F");
		countF++;
		break;
	}
	


     }
	
		System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                      "Number of students who received each grade:",
                      "A: ", countA,
                      "B: ", countB, 
                      "C: ", countC,  
                      "D: ", countD,
                      "F: ", countF);
		System.out.printf("number of invalid inputs are %d%n", countInvalid);
		
	




		}


}