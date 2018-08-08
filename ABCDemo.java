

import java.util.ArrayList;
import java.util.Scanner;

public class ABCDemo {
	
	static void throwException() throws Exception{
		throw new Exception();
	}

	public static void main(String args[]){  
		try {
			System.err.println("Some Error");
			throwException();
			return;
		}
		catch(RuntimeException r) {
			System.out.println("RuntimeException:"  + r);
		}
		catch(Exception exp) {
			System.out.println("Exception");
			return;
		}
		finally{
		 System.out.println("Finally Exception");
		 //Scanner.close();
		}
		
		}  
}