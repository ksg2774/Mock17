package patterns;

public class oppopiramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//* * * *
		// * * *
		//  * *
		//   *
	
	int space1=0;
	int star1=4;
	int row1=4;
	for(int k=1;k<=row1;k++)
	{
		for(int l=1;l<=star1;l++)
		{
			System.out.print("*");
		}
		for(int l=1;l<=space1;l++)
		{
			System.out.print(" ");
		}
		System.out.println();
         star1--;
         space1++;

	}

}
}
