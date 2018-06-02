import java.util.*;

class Die{
	static int number;
	public static void roll(){
		number=(int) Math.round(Math.random()*6);
		if(number==0) roll();
	}

	public static void display(){
		System.out.println(number);
	}

	public static void main(String args[]){
		roll();
		display();
	}

}

