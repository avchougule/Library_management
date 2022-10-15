package Library;
import java.util.Scanner;

public class Adminlog {

    Scanner sc = new Scanner(System.in);   
    String adminId;
    String adminpass;
    

    public Adminlog(String adminId, String adminpass) {
        this.adminId = adminId;
        this.adminpass = adminpass;
    }
    
    public Adminlog() {
       
    }




void Librarydisplay(){
    System.out.println();
    System.out.println("*********** Welcome To the Library ***********");
            System.out.println("1.Add Books");
            System.out.println("2.Show Books");
            System.out.println("3.Exist");
            System.out.println("Enter your option");
            int a=sc.nextInt();
            switch (a) {
                case 1:callAddBooksForms();
                    break;
                
                case 2:objbook.showBooks(BooksDatabase); 
                    break;
                
                case 3:
                    break;   
                     
                default:
                    break;
            }
}





AddBooksForm objaddbook=new AddBooksForm();
    
    ShowBooks[] BooksDatabase=new ShowBooks[100];
    void callAddBooksForms(){
        Scanner obj=new Scanner(System.in);
        int index=0;
        while (true){
            objaddbook.addBooksForm(BooksDatabase,index);
            String flag="no";
            System.out.println("add one more book (yes/no): ");
            String choose=obj.nextLine();
            
            System.out.println("Add Book Successflly !!!");
            index++;
            if (choose.equals(flag)){
                
                break;
            }
            
        }
        
        
  }

     ShowBooks objbook=new ShowBooks(); 



    public void loginForm(Adminlog[] adminDatabase){
        System.out.println();
        System.out.println("************* Login page *************");
        System.out.println("Enter Id:-");
        String adminId =sc.nextLine();

        System.out.println("Enter Password:-");
        String adminpass =sc.nextLine();
        
        if (adminDatabase[0]==null){
            System.out.println("Incorrect id or Password Try again. (--- please signup first ---) ");
        }
            
        else if (adminDatabase[0].adminId.equals(adminId) && adminDatabase[0].adminpass.equals(adminpass)) {
            System.out.println("Login Successful !!!");
            System.out.println();
            System.out.println("*********** Welcome To the Library ***********");
            System.out.println("1.Add Books");
            System.out.println("2.Show Books");
            System.out.println("3.Exist");
            System.out.println("Enter your option");
            int a=sc.nextInt();
            switch (a) {
                case 1:callAddBooksForms();
                Librarydisplay();
                    break;
                
                case 2:objbook.showBooks(BooksDatabase); 
                Librarydisplay();
                    break;
                
                case 3:
                    break;   
                     
                default:
                    break;
            }
        } 
        else {
            System.out.println("Incorrect id or Password Try again. ");
        }
    }


}
