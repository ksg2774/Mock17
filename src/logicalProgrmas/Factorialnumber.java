package logicalProgrmas;

public class Factorialnumber {

	public static void main(String[] args) {
		// factorial num=5  --->5*4*3*2*1
		
		int num=5;
		int num1=1;
		for(int i=num;i>=1;i--)
		{
			num1=num1*i;
			
		}
		System.out.println ("the factorial of "+num+" is "+num1);

	}

}
