package array;

import java.util.Arrays;

public class Singlearray {

	public static void main(String[] args) {
    int a[]= new int[4];
    	a[0]=1;
    	a[1]=2;
    	a[2]=5;
    	//a[3]=4;
    	
    Arrays.sort(a);// use for ascending order
    for (int i=0;i<=a.length-1;i++)
   
    
    {
    	System.out.println(a[i]);
    	
    }
    
    System.out.println("...................................");
    for (int i=a.length-1;i>=0;i--)//descending order
    	   
        
    {
    	System.out.println(a[i]);
    	
    }
    
   char[]  mobile=new char[5];
   mobile[0]='s';
   mobile[1]='a';
   mobile[2]='p';
   mobile[3]='b';
   Arrays.sort(mobile);// use for ascending order
   for (int i=0;i<=mobile.length-1;i++)
  
   
   {
   	System.out.println(mobile[i]);
   	
   }
   
   System.out.println("...................................");
   for (int i=mobile.length-1;i>=0;i--)//descending order
   	   
       
   {
   	System.out.println(mobile[i]);
   	
   }
   
   String[] s=new String[2];
   s[0]="velocity";
   s[1]="corporate";
   Arrays.sort(s);// use for ascending order
   for (int i=0;i<=s.length-1;i++)
  
   
   {
   	System.out.println(s[i]);
   	
   }
   
   System.out.println("...................................");
   for (int i=s.length-1;i>=0;i--)//descending order
   	   
       
   {
   	System.out.println(s[i]);
   	
   }
   
    
    
	}

}
