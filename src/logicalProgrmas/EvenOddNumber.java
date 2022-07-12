package logicalProgrmas;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int even=0;
		int odd=0;
		if(num%2==0)
		{
			System.out.println(num+" is a even number");
		}
		else
		{
			System.out.println(num+" is a odd number");
		}
		System.out.println("--------------------------------------------------");
		System.out.println("check the odd and even number between 1 to 10");
		for (int i=1;i<=num;i++ )
		{
		if(i%2==0)
		{
			even++;
			System.out.println("its a even number  "+i);
			
		}
		else
		{
			odd++;
			System.out.println("its a odd number   "+i );
		}
		}
		System.out.println("--------------------------------------------------");
 System.out.println("total odd numbers "+odd);
 System.out.println("total even numbers "+even);
 
	}

}
