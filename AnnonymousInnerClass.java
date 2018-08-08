class AnnonymousInnerClass{

	AnnonymousInnerClass(){
		System.out.println("In AnnonymousInnerClass ...");
	}
	
	void show(){
	
		System.out.println("Showing ...");
	}
	
	public static void main(String Args[]){
	
		AnnonymousInnerClass fj=new AnnonymousInnerClass();
		
		fj.show();
		
		AnnonymousInnerClass fk=new AnnonymousInnerClass(){
		
			void show(){
				System.out.println("Ober write annonymous ...");
			}
		};
		
		fk.show();
	}
}