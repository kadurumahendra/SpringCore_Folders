package books;

public class Library {
	private int libid;
	private Book book;
	public Library() {
		super();
	}
	public int getLibid() {
		return libid;
	}
	public void setLibid(int libid) {
		this.libid = libid;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Library [libid=" + libid + ", book=" + book + "]";
	}
	
	
	
	
	

}
