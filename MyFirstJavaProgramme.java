class MyFirstJavaProgramme{

	public static void main(String args[]){
		System.out.println("MyFirstJavaProgramme programme running.....");
		
		int x=10;
		System.out.println(x++*2);
		System.out.println(++x);
		
		int num=120;
		//System.out.println("num<<3  num=%d",num<<3);
		System.out.println(num<<3);
		num=120;
		System.out.println(num>>3);
		System.out.println("num= "+num);
		System.out.println(~num);
		
	}
}