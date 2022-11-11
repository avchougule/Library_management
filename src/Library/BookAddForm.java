package Library;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;
public class BookAddForm {
  

  void addBooksForm(){
    System.out.println();
    System.out.println("**********Add Books Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Author Name:-");
    String Author =sc.nextLine();
    
    System.out.println("Enter Book Name :-");
    String BookName =sc.nextLine();
    
    
    
    try {
      Connection con=ConnectionProvider.createConnection();
      PreparedStatement pstmt=con.prepareStatement("insert into book(Author,BookName) values(?,?)");
      //pstmt.setInt(1, 2);
      pstmt.setString(1, Author);
      pstmt.setString(2, BookName);
     
      pstmt.executeUpdate();
      System.out.println("Add book Successflly !!!");
    } catch (Exception e) {
      // TODO: handle exception
      //System.out.println("try again !!!");
      System.out.println(e);
    }
  }

}