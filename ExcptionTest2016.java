import java.lang.Exception;
class ExcptionTest2016{

	public static void main(String args[]){
		try{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		int r=getD(a,b);
		System.out.println(r);
		}
		catch(NumberFormatException e){
			System.out.println("Ooho  NumberFormatException...");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Ooho  ArrayIndexOutOfBoundsException...");
		}
		catch(ArithmeticException e){
			System.out.println("Ooho  ArithmeticException...");
		}
	}
	
	public static int getD(int a,int b){
		return a/b;
	}
}