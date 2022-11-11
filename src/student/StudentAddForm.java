package student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class StudentAddForm {

  

  void studentAddForm(){
    System.out.println();
    System.out.println("**********Add Student Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Student Name:-");
    String name =sc.nextLine();
    
    System.out.println("Enter Student Role_no :-");
    int Role_no =sc.nextInt();

    System.out.println("Enter Student Library_id :-");
    int Library_id =sc.nextInt();

    //Student obj1=new Student(name, Role_no, Library_id);
    //studentList.add(obj1);
    try {
      Connection con=ConnectionProvider.createConnection();
      PreparedStatement pstmt=con.prepareStatement("insert into students(name,Role_no,Library_id) values(?,?,?)");
      //pstmt.setInt(1, 2);
      pstmt.setString(1, name);
      pstmt.setInt(2, Role_no);
      pstmt.setInt(3, Library_id);
      pstmt.executeUpdate();
      System.out.println("Add Student Successflly !!!");
    } catch (Exception e) {
      // TODO: handle exception
      //System.out.println("try again !!!");
      System.out.println(e);
    }
    

    
  }

}