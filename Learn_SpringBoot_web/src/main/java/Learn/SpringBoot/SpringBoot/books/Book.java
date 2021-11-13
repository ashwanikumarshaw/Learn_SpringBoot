package Learn.SpringBoot.SpringBoot.books;

public class Book {
	
	private long id;
	private String Book_Name;
	private String Author_Name;
	
	//Create Constructor
	public Book(long id, String book_Name, String author_Name) {
		super();
		this.id = id;
		Book_Name = book_Name;
		Author_Name = author_Name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public String getAuthor_Name() {
		return Author_Name;
	}

	public void setAuthor_Name(String author_Name) {
		Author_Name = author_Name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", Book_Name=" + Book_Name + ", Author_Name=" + Author_Name + "]";
	}
	
	

}
