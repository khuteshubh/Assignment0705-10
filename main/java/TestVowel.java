import java.util.Scanner;

public class TestVowel {
	public static boolean checkVowel(String str) throws Exception {
		for(int i = 0; i < str.length();i++) {
			str.toLowerCase();
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
				throw new Exception ("String not contain vowel");
				
			}
			
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = " ";
		try {
			System.out.println("Enter the string");
			str = sc.next();
			boolean result = checkVowel(str);
			
			if(result == true) {
				System.out.println("String contain vowel");
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
