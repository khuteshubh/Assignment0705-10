import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = " ";
		try {
			System.out.println("Enter the String");
			str = sc.next();
			System.out.println(Integer.parseInt(str));
		}
		catch(NumberFormatException e) {
			System.out.println("string direct not convert in integer");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
