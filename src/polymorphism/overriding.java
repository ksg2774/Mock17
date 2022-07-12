package polymorphism;

public  class overriding extends overriding1{

	public static void main(String[] args) {
		overriding o=new overriding();
		o.eng();
		overriding1 o1=new overriding1();
		o1.eng();
		o1.eng1();
		o1.eng2();
		

	}
	
	
	void eng()
	{
		System.out.println("overriding = its a complete method");
		
	}
	
	

}
