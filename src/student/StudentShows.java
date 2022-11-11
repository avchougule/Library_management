package student;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



	public class StudentShows {
	  
	  public void studentShow() {
	    System.out.println();
	    System.out.println("************* Show Student *************");
	    //int id=1;

	    // System.out.println("id\t\tname\t\tRoll No\t\tLibrary id");
	    // for(Student student:studentList){
	      
	    //    if (student==null){
	    //     System.out.println("null\t\tnull\t\tnull\t\tnull");
	    //     break;   
	    //    }
	    //    else{
	    //     System.out.println(id+")\t\t"+student.getName()+"\t\t"+student.getRole_no()+"\t\t"+student.getLibrary_id());
	    //     id++;
	    //    }
	    // }

	    try {
	      Connection con=ConnectionProvider.createConnection();
	      Statement stmt=con.createStatement();
	      ResultSet rs= stmt.executeQuery("select * from students");
	      System.out.println("id\t\tname\t\tRoll No\t\tLibrary id");
	      while(rs.next()){
	        System.out.println(rs.getInt("id")+")\t\t"+rs.getString("name")+"\t\t"+rs.getInt("Role_no")+"\t\t"+rs.getInt("Library_id"));
	      }
	    } catch (Exception e) {
	      // TODO: handle exception
	      //System.out.println("try again !!!");
	      System.out.println(e);
	    }

	    
	  }
	}