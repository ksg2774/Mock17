package interFace;

public class company implements bike {
int a=10;
	public static void main(String[] args) {
		
company c=new company();
 c.pulser();
	}

	@Override
	public void pulser() {
		System.out.println("its a complete method");
		
	}

}
