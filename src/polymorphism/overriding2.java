package polymorphism;

public class overriding2 extends overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    overriding2 o2=new overriding2();
    o2.eng();
    o2.eng1();
    o2.eng2();
    overriding o=new overriding();
	o.eng();
   
    
    
	}
void eng()
{
	System.out.println("overriding2 = its a complete method");
	
}
}
