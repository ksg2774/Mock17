package logicalProgrmas;

public class Revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ognum=123;
		int revnum=0;
		for(int i=ognum;i>=0;i=i/10)
		{
			int rem=i%10;
			revnum=revnum*10+rem;
			
		}
			System.out.println(" reverse number "+revnum);

	}

}
