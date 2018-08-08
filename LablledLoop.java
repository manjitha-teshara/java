class LablledLoop{
	
	public static void main(String args[]){
	
		int x=0;
		
		x++;
		fk:System.out.println("In fk label again");
		for(x=0;x<10;x++){
		
			
				if(x%2==0){
					
					//System.out.println("go to");
					continue fk;
				}
				System.out.print(x);
		}
		
	}
}