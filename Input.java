import java.util.Scanner;

class Input{
	
	
	public static void main(String args[]){
	
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter number ");
		int num=sn.nextInt();
		
		System.out.println("~ "+num+" ==> " +~num);
		
		int num1=128;
		System.out.println(num1>>2);
	
	}
}