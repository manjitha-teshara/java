
import java.lang.Exception;
class CustomerException2{

	public static void main(String args[]){
	
		System.out.println("Strating process...");
		
		try{
			throw new AgeFixRangeException("fucking age...");
			
		}
			catch(AgeFixRangeException e){		
				System.out.println("Strating AgeFixRangeException process...");
											
			}
			catch(Exception e){		
				System.out.println("Strating Exception process...");
			}
	}
}

class AgeFixRangeException extends Exception{


	AgeFixRangeException(String s){
		super(s);
	}
}