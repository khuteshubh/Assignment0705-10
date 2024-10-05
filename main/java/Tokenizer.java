
public class Tokenizer {
	
//	public static String[] stringTokenizer(String str) {
//		return (str.split("[A-Za-z]",2));
//		
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
		
		try {
			String token[] =  str.split(" ");
			for(String  e: token) {
				System.out.println(e);
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
		
		

	}

}
