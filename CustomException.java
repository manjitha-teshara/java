import java.lang.Exception;

class CustomException{

	public static void main(String args[]) throws InvalidAgeException{
	
		int num=16;
		
		if(num<18){
			throw new InvalidAgeException("Age is wrong...");
		}
		else{
			System.out.println("welcome to the green land...");
		}
		
	}
	
}


class InvalidAgeException extends Exception{

	InvalidAgeException(String s){
	super(s);}
	
}