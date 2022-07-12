package constructor;

public class DefaultConstructor {
	  
	  
	  int a;
	  int b;
	  public DefaultConstructor()
	  
	  {
		System.out.println("it is a constructor");
		a=100;
		b=200;
		
		  }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultConstructor dc =new DefaultConstructor();
		dc.add();
   
	}
   public  void add()
   {
	 
	   int sum=a+b;
	   
	   System.out.println("sum is "+sum);
	   
   }
   }

