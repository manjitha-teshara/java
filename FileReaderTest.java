import java.io.FileReader;
class FileReaderTest{


	public static void main(String args[]){
	
		FileReader fr=new FileReader("Desktop\new 1.txt");
		
		 int i;  
			try{
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close(); 
			}catch(Exception e){
				
				System.out.print("Error.");
				try{
					Thread.sleep(1000);
					
				}
				catch(Exception er){
					
				}
			}
	}
}