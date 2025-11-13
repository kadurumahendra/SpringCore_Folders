package books;

public class Book {
	private String bookname;

	public Book() {
		super();
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + "]";
	}
	
	

}
