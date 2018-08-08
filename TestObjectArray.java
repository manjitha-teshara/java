class A{
	A(){
		System.out.println("In a...");
	}

}

class B extends A{
	B(int i){
		System.out.println("In b..."+i);
	}
	
}

class TestObjectArray{

	public static void main(String args[]){
	
		B arr[]=new B[10];
		int x=0;
		while(x<10){
			arr[x]=new B(x);
			x++;
		}
	}
}