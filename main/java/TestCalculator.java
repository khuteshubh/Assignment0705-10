import java.util.Scanner;

class Calculator{
	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int add() throws ArithmeticException {
		
		
		if( (num1 <= 0) ) {
			throw new ArithmeticException("Enter the new value should not be negative " + num1);
		}else if(num2 <= 0){
			throw new ArithmeticException("Enter the new value should not be negative " + num2);
		}
		else {
			return (num1+num2);
			
		}
		
	}
	
	public int sub() {
		return (num1-num2);
	}
	
	public int mul() {
		return (num1 * num2);
	}
	
	public int division() {
		return (num1/num2);
	}
	
	
}
public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator calculator ;
		
		try {
			System.out.println("Enter the two number");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			calculator = new Calculator(num1, num2);
			int result = calculator.add();
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
