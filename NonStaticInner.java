class NonStaticInner{

	String name;
	class Inner{
		String password;
		
	}
	
	public static void main(String args[]){
	
		NonStaticInner out1=new NonStaticInner();
		
		NonStaticInner.Inner in=NonStaticInner.new Inner();
	}
}