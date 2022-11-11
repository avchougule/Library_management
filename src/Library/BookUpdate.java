package Library;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;
public class BookUpdate {
  

  static void bookUpdate(){
    System.out.println();
    System.out.println("**********update Book Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Book id :-");
    int id =sc.nextInt();

    System.out.println("Enter Author Name:-");
    String Author =sc.next();
    
    System.out.println("Enter Book Name:-");
    String BookName =sc.next();
    

    
    try {
      Connection con=ConnectionProvider.createConnection();
      PreparedStatement pstmt=con.prepareStatement("update book set Author=?, BookName=?  where id=?");
   
      pstmt.setString(1, Author);
      pstmt.setString(2, BookName);
      pstmt.setInt(3, id);
      
      pstmt.executeUpdate();
      System.out.println("update book Successflly !!!");
    } catch (Exception e) {
      // TODO: handle exception
      
      System.out.println(e);
    }
    

    
  }

}