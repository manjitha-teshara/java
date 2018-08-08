import java.util.Scanner;
class SwitchTest{
	
	public static void main(String args[]){
		System.out.println("Enter number ");
		Scanner sn=new Scanner(System.in);
		int num=sn.nextInt();
		
		switch(num){
			case 1:
			System.out.println(true);
			break;
			case 0:
			System.out.println(false);
			break;
			default:
			System.out.println("In valid input...");
			
		}
	}
}