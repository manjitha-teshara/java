class AnonymousInnerClassTest{

	public static void main(String args[]){
	
	Phone p=new Phone(){
		
		public void show(){
			
			System.out.println("Tik tik ...");
		}
	};
	p.show();
	
	}
}


class Phone{
	
	Phone(){
		System.out.println("In phone constructer...");
	}
	
	void show(){
		System.out.println("Showing...");
	}
}