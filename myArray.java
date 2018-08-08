import java.util.Scanner;

class myArray{
	int a[]=null;
	
	myArray(int l){
		a=new int[l];
	}
	
	myArray(int a1[]){
		a=a1;
	}
	/*
	int read(){
		for(int x:a);
			
		
	}*/
	
	void print(){
	for(int x:a){
			System.out.print(x+" ");
		}
	
	}
	
	public myArray reverse(){
		int len=a.length;
		int temp[]=new int[len];
		int x=0;
		for(int i=len-1;i>=0;i--){
			temp[x]=a[i];
			x++;
		}
		myArray m=new myArray(temp);
		return m;
	}
	
	public void add(myArray a2){
			int len=a.length;
			for(int i=0;i<len;i++){
				
				a[i]=a2.a[i]+a[i];
				//System.out.println(a[i]);
			}
			
		
	}
	
	public static void main(String args[]){
	
		myArray a1=new myArray(4);
		a1.print();
		a1.reverse();
		int arr2[]={12,3,5,5};
		
		myArray a2=new myArray(arr2);
		
		a1.add(a2);
		a1.print();
	}

}