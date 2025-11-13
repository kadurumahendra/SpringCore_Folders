package setterInjection.task2;

public class Library {
	
	private String libraryName;
	
	private Book book;

	public Library() {
		super();
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", book=" + book + "]";
	}
	
	

}
