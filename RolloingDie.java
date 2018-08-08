import java.util.Random;


class RollingDie{

	public static void main(String args[]){
	
		rolling();
		rolling2();
	}
	//there are two function to get rangom number 1 to 6 range
	
	public static void rolling(){
		
		Random rn=new Random();
		int randomNumber=rn.nextInt(6)+1;//range of rn.nextInt(6)  0 to 5 ,we want to get 0 to 6 i include one
		System.out.println(randomNumber);
		
	}
	
	public static void rolling2(){
		
		int rn=(int) Math.round(Math.random()*6);//this range is 0 to 6 ,in this not need 0
		if(rn==0) rolling2();
		
		else
		System.out.println(rn);
		
		//number = (int) Math.round(Math.random()*6);
	}
}