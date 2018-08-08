//import java.lang.Exception;
class CoustomException{

	public static void main (String args[])throws ManjiException{
	
		System.out.println("Manjith's Exception ...");
		
		throw new ManjiException("Koheda hutto kela une...");
	}
}


class ManjiException extends Exception{

	ManjiException(String s){
		super(s);
	}
}