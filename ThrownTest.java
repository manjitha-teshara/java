import java.lang.Exception;

class ThrownTest{

	public static void main(String args[]){
		throwException();
	}
	
	
	static void throwException() throws Exception{
		throw new Exception();
	}
}