import java.lang.Integer;
class IntegerAndInt{

	static void show(int c){
		System.out.println("showing int...");
	}
	
	static void show(Integer c){
		System.out.println("Showing Integer...");
	}

	public static void main(String args[]){
		Integer c=new Integer(10);
		int b=c;
		show(b);//<--Integer argument ekak
		
		System.out.println(c==b);
	}
}