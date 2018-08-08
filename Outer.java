
class Outer {
    
    private String name;
    Outer(){
    System.out.println("In outer class...fk");}
    class Inner{
        
        int id;
        Inner(){
        System.out.println("In inner class ...fk");}
        
    }
    
    public static void main(String[] args) {
       
       Outer ob=new Outer();
       ob.name="manjitha";
       Outer.Inner in=ob.new Inner();
       
       in.id=101;
	   in.name="fukaya";
       
       
       
       
       
       
    }
    
}
