package Library;
public class ShowBooks {
  String Author;
  String BookName;

  public ShowBooks(String author, String bookName) {
    Author = author;
    BookName = bookName;
  }

  

  public ShowBooks() {
  }



  public void showBooks(ShowBooks[] booksDatabase) {
    System.out.println();
    System.out.println("************* Show Books *************");
    int id=1;
    for(ShowBooks books:booksDatabase){
       if (books==null){
        System.out.println("Not some More Books");
        break;
       }
       else{
        System.out.println(id+") Author: "+books.Author+" Book Name: "+books.BookName);
        id++;
       }
    }
  }

  
  

}
