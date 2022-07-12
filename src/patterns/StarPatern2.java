package patterns;

public class StarPatern2 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// row-5,col=5,initial row star=1
		
		int star=0;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=star;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			star++;
			
		}

	}

}
