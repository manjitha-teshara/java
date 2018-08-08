class Runner extends Runnable{

	public void start(){
		for(int j=0;j<=100;j++){
			System.out.println("Hello"+j);
		
			try{
				Thread.sleep(100);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}

public class MyProgram{
	
	
	public static void main(String args[]){
		Runner r1=new Runner();
		r1.start();
	}
}