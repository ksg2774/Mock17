package patterns;

public class StarPattern10 {

	public static void main(String[] args) {
	//	*       *
	//	**     **
	//	***   ***
	//	**** ****
	//	*********
	//	**** ****
	//	***   ***
	//	**     **
	//	*       *
		//row-9,cols-9,star1,space1,star2,space2
	
		int star1=1;
		int space1=4;
		int star2=1;
		int space2=3;
		
	for (int i=1;i<=9;i++)
	{
		for (int j=1;j<=star1;j++)
		{
			System.out.print("*");
		}
		for (int j=1;j<=space1;j++)
		{
			System.out.print(" ");
		}
		for (int j=1;j<=space2;j++)
		{
			System.out.print(" ");
		}
		for (int j=1;j<=star2;j++)
	 { 
			if(j<5||j>5)
			{
			System.out.print("*");
			}			
		}
		System.out.println();
		if(i<5)
		{
			star1++;
			space1--;
			space2--;
			star2++;
		}
		if(i>4)
		{
			star1--;
			space1++;
			space2++;
			star2--;
		}
		
	}
		
		System.out.println("pattern is print for git fourth change");

	}

}
