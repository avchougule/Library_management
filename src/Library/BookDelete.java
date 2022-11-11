package Library;
import java.sql.Connection;
import java.sql.PreparedStatement;
 
import java.util.Scanner;

public class BookDelete {

    static void bookDelete( ) {
    	System.out.println();
		System.out.println("**********Delete Student************");
		System.out.println("Enter Book id: ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		// booksList.remove(id-1);
		// System.out.println("Delete Book Successfully !!!");

	try {
      Connection con=ConnectionProvider.createConnection();
      PreparedStatement pstmt=con.prepareStatement("delete from book where id= ?");
      pstmt.setInt(1, id);
      pstmt.executeUpdate();
      System.out.println("Delete Book Successfully !!!");
    } catch (Exception e) {
      // TODO: handle exception
      //System.out.println("try again !!!");
      System.out.println(e);
    }
	}
}