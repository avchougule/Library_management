package Library;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class BookShows{

  public void bookShows() {
    System.out.println();
    System.out.println("************* Show Books *************");
    //int id = 1;
    // System.out.println("id\t\tAuthor\t\tBook Name");

    // for (Book book : booksList) {
    //   System.out.println(+id + ")\t\t" + book.getAuthor() + "\t\t" + book.getBookName());
    //   id++;
    // }


    try {
      Connection con=ConnectionProvider.createConnection();
      Statement stmt=con.createStatement();
      ResultSet rs= stmt.executeQuery("select * from book");
      System.out.println("id\t\tAuthor\t\tBookName");
      while(rs.next()){
        System.out.println(rs.getInt("id")+")\t\t"+rs.getString("Author")+"\t\t"+rs.getString("BookName"));
      }
    } catch (Exception e) {
      System.out.println(e);
    }

  }

}
  
