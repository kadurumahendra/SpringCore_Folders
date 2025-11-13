package librarysystem;

public class Library {
	
	private int libId;
	private String libName;
	private Book book;
	public Library() {
		super();
	}
	public int getLibId() {
		return libId;
	}
	public void setLibId(int libId) {
		this.libId = libId;
	}
	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Library [libId=" + libId + ", libName=" + libName + ", book=" + book + "]";
	}
	
	
	
	

}
