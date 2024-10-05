import java.util.Scanner;

class Library{
	
	private Book[] books;
	private int bookCount;
	private static final int maxBook = 100;
	
	

	
	public Library() {
		this.books = new Book[maxBook];
		this.bookCount = 0;
		
		
		
	}
	
	
	public void add(Book book) {
		
			
			if(bookCount < maxBook){
				books[bookCount++] = book;
				System.out.println("Book Added Successfully");
				
			}
			else {
				System.out.println("Library is full...");
				
			}
		
	}
	
	public void remove() {
		System.out.println(" ");
		
	}
	
	public void display(){
		for(int i=0;i<bookCount;i++) {
			if(bookCount == 0) {
				System.out.println("Library emty...");
			}else {
				System.out.println(books[i]);
				
			}
			
		}
		
		
	}
	
	
}

class Book{
	
	private int bookId;
	private String bookName;
	
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	
	
	
	
}

public class TestLibrary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Book book = new Book(0, null);
		int ch;
		
		Library library = new Library();
		System.out.println("Enter the detail");
		do {
			
			System.out.println("Welcome to the Library......");
			System.out.println("1 Add the Book");
			System.out.println("2 Remove the Book");
			System.out.println("3 Display the book");
			System.out.println("4 Exit");
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1:
				int bookId;
				String bookName;
				System.out.println("Enter the book Id");
				bookId = sc.nextInt();
				System.out.println("Enter the book Name");
				bookName = sc.next();
				book.setBookId(bookId);
				book.setBookName(bookName);
				library.add(book);
				
				break;
                
				
			
			case 2:
				System.out.println("Remove Book");
				break;
				
			case 3:
				
				System.out.println(book.getBookId() );
				System.out.println(book.getBookName());
				break;
			}
			
				
				
			
			
		} while(ch>0);
		
	}

}
