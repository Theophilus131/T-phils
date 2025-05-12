
 public class DrillerAssignment{


 public static int pricePerCopy(int number){
 
 	if(number >= 1 && number <= 4){
	    number = number * 2000;
	       }

	else if(number >=5 && number <= 9){
		number = number * 1800;
			}

	else if(number >= 10 && number <= 29){
		number = number * 1600;
			}
 	
	else if(number >=30 && number <= 39){
		number = number * 1500;
			}

	else if(number >=50 && number <= 99){
		number = number * 1300;
			}
	
	else if(number >= 100 && number <= 199){
		number = number * 1200;
			}
	
	else if(number >= 200 && number <= 499){
		number = number * 1100;
			}
		
	else if(number >= 500 ){
		number = number * 1000;
			}
		return number; 


}













	}