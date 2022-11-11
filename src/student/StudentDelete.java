package student;

import java.sql.Connection;
import java.sql.PreparedStatement;


import java.util.Scanner;

public class StudentDelete {

    static void studentDelete() {
		System.out.println();
		System.out.println("**********Delete Student************");
		System.out.println("Enter Student id: ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		//studentlist.remove(id-1);
		try {
      Connection con=ConnectionProvider.createConnection();
      PreparedStatement pstmt=con.prepareStatement("delete from students where id= ?");
     pstmt.setInt(1, id);
      pstmt.executeUpdate();
      System.out.println("Delete Student Successfully !!!");
    } catch (Exception e) {
      // TODO: handle exception
      //System.out.println("try again !!!");
      System.out.println(e);
    }
	}
	
}