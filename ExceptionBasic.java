import java.lang.Exception;

public class ExceptionBasic
{
	public static void main(String[] args)
	{
	try{	int p = 1;//if p double not give exception
		System.out.println("result ="+p/0);
		}catch(ArithmeticException e){
		    
		    System.out.println("Fuking error "+e);
		}finally{
			
			System.out.println("finally come ...");
		}
	}
}
