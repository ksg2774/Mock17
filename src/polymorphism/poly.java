package polymorphism;

public class poly {

	public static void main(String[] args)
	{
		poly p=new poly();
		p.engineering();
		p.engineering(5);
			
		

	}
void engineering()
{
	System.out.println("overloading =its a eng methd without parameter");
	
}
void engineering(int a)
{
	System.out.println("overloading =its a eng methd with parameter   "+a);
}


}
