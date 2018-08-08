import java.util.Scanner;
class GCD{

	public static void main(String args[]){
	
		Scanner sn=new Scanner(System.in);
		int num1=sn.nextInt();
		int num2=sn.nextInt();
		
		gcd(num1,num2);
	}
	
	public static void gcd(int n1,int n2){
	
		if(n2==0){
			System.out.println("GCD is "+n2);
		}
		else if(n1>=n2){
			gcd(n2,n1%n2);
		}
		else{
			gcd(n2,n1);
		}
	}
}