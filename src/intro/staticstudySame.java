package intro;

public class staticstudySame {

	static public void main(String[] args) {
		
		//calling method in same class 
		
		test();//regular static method
		
		staticstudySame s1=new staticstudySame();
		s1.test1();// regular non static
		
		
	}
		public static void test ()//regular static method
		{
			
		System.out.println("i am a regular static");

		}

		public void test1()// regular non static
		{
			System.out.println("i am rgular non static");
			
		}
		
	}


