package patterns;

import java.util.Scanner;

public class piramidstar {

	public static void main(String[] args) {
		
		piramid();
	pir();
		
		
		
	}
		public static void piramid()
		{
		//   * 
		//  * *
		// * * *
		//* * * *
		
	
		
		
		
		// row=4, col=4, space=3,star=1
		
		//Scanner sc=new Scanner(System.in);
		int star=1;
		int space=3;
		int row=4;
	
		for(int i=1;i<=row;i++)
		{
		   for (int j=1;j<=space;j++)
		   {
		    System.out.print(" ");   
		   }
		   for(int j=1;j<=star;j++)
		   {
			   
			   System.out.print("* ");
		}
		   System.out.println();
		space--;
		star++;
		}
}
	public static void pir()
		{
		
		
		}
	}

		
	


