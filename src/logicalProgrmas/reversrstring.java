package logicalProgrmas;

public class reversrstring {

	public static void main(String[] args) {
		// reverse string
		
		String s="Kiran";
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("original string is "+s);
		System.out.println("reverse string is "+rev);
	}

}
