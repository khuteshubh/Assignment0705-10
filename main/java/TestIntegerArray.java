import java.util.Scanner;

public class TestIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size] ;
		try {
			
			
			for(int i=0;i<size;i++) {
				System.out.println("Enter the number: ");
				int num = sc.nextInt();
				arr[i] = num;
			}
			System.out.println("Enter the index number you want to access");
			int val = sc.nextInt();
			System.out.println(arr[val]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid index number " +  e);
					
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
