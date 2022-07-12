package logicalProgrmas;

public class ReversetheNumberByConvert {

	public static void main(String[] args) {
		// number convert to string and string convert to number
		int ognum=123;
		String ogstr=Integer.toUnsignedString(ognum);
		String rev="";
		for(int i=ogstr.length()-1;i>=0;i--)
		{
			rev=rev+ogstr.charAt(i);
			
		}
		int revnum=Integer.parseInt(rev);
		System.out.println("original number "+ognum);
		System.out.println("reverse number  "+revnum);
				
		

	}

}
