package student;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;
public class StudentUpdate {
  
  static void stuUpdate(){
    System.out.println();
    System.out.println("**********update Student Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Student id :-");
    int id =sc.nextInt();

    System.out.println("Enter Student Name:-");
    String name =sc.next();
    
    System.out.println("Enter Student Role_no :-");
    int Role_no =sc.nextInt();

    System.out.println("Enter Student Library_id :-");
    int Library_id =sc.nextInt();

    
    try {
      Connection con=ConnectionProvider.createConnection();
      PreparedStatement pstmt=con.prepareStatement("update students set name=?, Role_no=? ,Library_id=? where id=?");
   
      pstmt.setString(1, name);
      pstmt.setInt(2, Role_no);
      pstmt.setInt(3, Library_id);
      pstmt.setInt(4, id);
      pstmt.executeUpdate();
      System.out.println("update Student Successflly !!!");
    } catch (Exception e) {
      // TODO: handle exception
      
      System.out.println(e);
    }
    

    
  }
  
}