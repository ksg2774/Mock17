package logicalProgrmas;

public class ReversemiddleString {

	public static void main(String[] args) {
    //revers even possition of string means AM and PUNE
		String str="I AM IN PUNE";
		String ar[]=str.split(" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			if(i%2!=0)
			{
				String str1=ar[i];
				ar[i]=revstr(str1);
			}
		}
		System.out.println(str);
		for (int i=0;i<=ar.length-1;i++)
		{
			
			System.out.print(ar[i]+" ");
		}
		
	}
		public static String revstr(String input)
		{
			String rev="";
			for(int i=input.length()-1;i>=0;i--)
			{
				rev=rev+input.charAt(i);
				
			}
			return rev;
			
		
		
     
	}

}
