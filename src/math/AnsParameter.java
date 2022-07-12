package math;

public class AnsParameter {

	public static void main(String[] args) {
		mathOperationsParameters mop=new mathOperationsParameters();
		
		// addition
		mathOperationsParameters.sum(9, 6);//calling static method with parameter from another class
		mathOperationsParameters.sum(55, 44);//calling static method with parameter from another class
		
		//Subtraction
		mathOperationsParameters.sub(99, 33);//calling static method with parameter from another class
		mathOperationsParameters.sub(6, 8);//calling static method with parameter from another class
		
		//multiplication
		mop.mul(1, 2);//calling non static method with parameter from another class
		mop.mul(80, 5);//calling non static method with parameter from another class
		
		
		// Division
		mop.div(5, 5);//calling non static method with parameter from another class
		mop.div(6, 2);//calling non static method with parameter from another class
		

	}

}
