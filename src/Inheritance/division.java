package Inheritance;

public class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  MecEng mec=new MecEng();
  CivilEng civ=new CivilEng();
  
		 int sum=mec.coll+mec.ddd+civ.coll+civ.ddd;
		 System.out.println("sum of two departments   "+sum);
	}

}
