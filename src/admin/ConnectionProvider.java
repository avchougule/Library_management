package admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider  {

static Connection con;

  public static Connection createConnection() throws Exception{
    try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ftc_library", "root", "root");
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
    }
    return con;
  } 
}