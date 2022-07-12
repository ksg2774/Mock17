package logicalProgrmas;

//import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		//Palindrome string
	//	Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the string");
		//String orgstr = sc.next();
		String orgstr="nitin";
               String rev = "";
               for(int i=orgstr.length()-1;i>=0;i--)
               {
            	   rev=rev+orgstr.charAt(i);
                }
               System.out.println("original string is  "+orgstr);
               System.out.println("Reverse string is  "+rev);

               if(orgstr.equals(rev))
               {
            	   System.out.println("string is palindrom");
               }
               else 
               {
            	   System.out.println("string is not palindrom");
               }
	}
}
