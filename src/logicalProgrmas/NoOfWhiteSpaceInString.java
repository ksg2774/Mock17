package logicalProgrmas;

public class NoOfWhiteSpaceInString {

	public static void main(String[] args) {
		
		String str=" P U   N  E  ";
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char mychar=str.charAt(i);
			if(mychar==' ')
			{
				count++;
			}
			
		}
 System.out.println("the white spaces in string"+str+"is "+count);
	}

}
