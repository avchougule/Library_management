package Library;

public class Book {
	  private String Author;
	  private String BookName;

	  public Book(String author, String bookName) {
	    Author = author;
	    BookName = bookName;
	  }

	  public Book() {

	  }

	  @Override
	  public String toString() {
	    return "Book [Author=" + Author + ", BookName=" + BookName + "]";
	  }

	  public String getAuthor() {
	    return Author;
	  }

	  public void setAuthor(String author) {
	    Author = author;
	  }

	  public String getBookName() {
	    return BookName;
	  }

	  public void setBookName(String bookName) {
	    BookName = bookName;
	  }

	}
