
import java.util.Scanner;
class AssertionError{
	public static void main(String args[]){
		Scanner sn=new Scanner(System.in);
		int age=sn.nextInt();
		assert(age <100):"Error...age is"+age;
		
		if(age>=0 && age <=16){
			System.out.println("Child...");
		}
		else if(age>16 && age<=30){
			System.out.println("Younger");
		}
		
		else{
			System.out.println("elder ...");
		}
	}
}