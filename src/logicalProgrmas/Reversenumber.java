package logicalProgrmas;

public class Reversenumber {

	public static void main(String[] args) {
		// reverse number
		
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
