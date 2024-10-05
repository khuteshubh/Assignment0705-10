import java.util.InputMismatchException;
import java.util.Scanner;

class SquareVal{
	public static int findSquare(int num) {
		return (num*num);
	}
}

public class TestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareVal square = new SquareVal();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Number");
			int num = sc.nextInt();
			int result = square.findSquare(num);
			System.out.println(result);
			
		}
		catch(InputMismatchException e) {
			System.out.println("Enter the correct input : " + e);
		}

	}

	
}
