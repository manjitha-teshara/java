class NonStatic_Inner{

	String name;
	class Inner{
		String password;
		
	}
	
	public static void main(String args[]){
	
		NonStatic_Inner out1=new NonStatic_Inner();
		
		NonStatic_Inner.Inner in=NonStatic_Inner.new Inner();
	}
}