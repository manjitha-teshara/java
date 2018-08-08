class ThreadSleep{

	public static void main(String args[]){
		System.out.print("Loading.");
		for(int i=0;i<5;i++){
			System.out.print(".");
			try{Thread.sleep(1000);}
			catch(Exception e){}
		}
	}
}