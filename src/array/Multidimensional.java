package array;

public class Multidimensional {

	public static void main(String[] args) {
		int a[][]=new int[3][4];
		a[0][0]=1;
		a[0][1]=8;
		a[0][2]=5;
		a[1][0]=2;
		a[1][1]=9;
		a[1][2]=6;
		
		for (int i=0;i<=a.length-1;i++)
		{
		
			
			for(int j=0;j<=a.length-1;j++)
			{
						System.out.print(a[i][j]+" ");
					
						
			}
			System.out.println();
	
		}
		
		
		
		
		

	}

}
