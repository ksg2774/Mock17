package obj;

public class call extends testobj{
	static int p=20;
	
	public call()
	{
		
		this(10);
	    
		System.out.println("this is no argument consructor");	
	}
	 public call(int a)
	{
		this(10,20);//this is contructr chaining
		System.out.println("this is  argument consructor");	
	}
	public call(int a,int b)
	{
		super(50);
		System.out.println("this is  2argument consructor"+(a+b));	
	}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		call c=new call();
		c.bike(10);
	    bike(10, 20);
	   
	    System.out.println("globly declare static variable "+p); 
	}
	public void bike(int a)
	{
		System.out.println("this is 1 parameter method "+a);
	}
	public static void bike(int a,int b)
	{	
		int c=a+b;
		 System.out.println("this is 2 parameter method "+c);
		System.out.println("this is  parameter method "+p);
	}
}
