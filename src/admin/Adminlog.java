package admin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Adminlog {

    Scanner sc = new Scanner(System.in);
    private String user_name;
    private String password;

    public Adminlog(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }

    public Adminlog() {

    }

    // ---------------- dash board ---------------------------

    static void dashboard() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("**** Welcome To the Library ****");
        System.out.println("1.Students Record");
        System.out.println("2.Book Records");
        System.out.println("3.Manage Books");
        System.out.println("4.logout");
        System.out.println("Enter your option");
        int a = sc.nextInt();
        BookRecords obj = new BookRecords();
        StudentsRecord obj1 = new StudentsRecord();
        switch (a) {
            case 1:
                obj1.studentRecord();
                Adminlog.dashboard();
                break;

            case 2:
                obj.Librarydisplay();
                Adminlog.dashboard();
                break;

            case 3:
                break;

            case 4:
                break;

            default:
                break;
        }
    }

    // ----------------Login Form-------------------------------

   // BookRecords obj = new BookRecords();
    //StudentsRecord obj1 = new StudentsRecord();

    public void loginForm() {
        System.out.println();
        System.out.println("************* Login page *************");
        System.out.println("Enter User Name:-");
        String user_name = sc.next();

        System.out.println("Enter Password:-");
        String password = sc.next();

        try {
            
            Connection con = ConnectionProvider.createConnection();
            Statement stmt = con.createStatement();
            ResultSet admins = stmt.executeQuery("select * from Admins");
            boolean match = false;
         
            while (admins.next()) {
              
                if (admins.getString("user_name").equals(user_name)  && admins.getString("password").equals(password)) {
                    match = true;
                    break;
                }              
            }

            if (match) {
                System.out.println("Login Successful !!!");
                dashboard();

            } else {
                System.out.println("Incorrect User Name or Password Try again. ");

            }

        } 
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

       

    }

}
