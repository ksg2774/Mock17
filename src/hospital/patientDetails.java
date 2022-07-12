package hospital;

public class patientDetails {

	public static void main(String[] args) {
		
	/*	patientDetails pd=new patientDetails();
		pd.patient("Kiran" ,"Pune " ,25 ,'A' );
		pd.patient("Satish" ,"Mumbai " ,50 ,'C' );
		pd.patient("Avi" ,"Pune " ,35 ,'B' );
		pd.patient("Mrunali" ,"Pune " ,45 ,'E' );
		pd.patient("Om" ,"Pune " ,22 ,'D' );
		pd.patient("Manish" ,"Pune " ,14 ,'F' );
		pd.patient("pradeep", "usmanabad", 26, 'G');
		
*/
		patient1("khitij", "Latur" , 26, 'k',9595959595l,5.5f);
		patient1("vijay", "Latur", 26, 'v',6565655656l,6.5f);
		
	}
	
	public void patient(String name,String add, int age ,char block)//non static  regular method
	{
		System.out.println();
		System.out.println("Name of patient is  "+name);
		System.out.println("Address of patient is  "+add);
		System.out.println("age of patient is  "+age);
		System.out.println("Block of patient is  "+block);
		
		
	}
	
	public  static void patient1(String name,String add, int age ,char block,long mb_no,float height)
	{
		System.out.println();
		System.out.println("Name of patient is  "+name);
		System.out.println("Address of patient is  "+add);
		System.out.println("age of patient is  "+age);
		System.out.println("Block of patient is  "+block);
		System.out.println("mobile number of patient is "+mb_no);
		System.out.println("patient height is "+height+" inch");
		
		
	}
	

}
