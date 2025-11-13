package librarysystem;

public class Author {
	
	private String authorName;
	private String nationality;
	public Author() {
		super();
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", nationality=" + nationality + "]";
	}
	
	

}
