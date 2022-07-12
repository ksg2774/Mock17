package interFace;

public class bike1 extends company{
     int a=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike1 b1=new bike1();
		b1.math();
		b1.pulser();
		

	}
	void math()
	{
		this.a=this.a+10;
		System.out.println(this.a);
		System.out.println(super.a);
	}

}
