package Library;
import java.util.Scanner;
public class AddBooksForm {


  void addBooksForm(ShowBooks[] booksDatabase,int index){
    System.out.println();
    System.out.println("**********Add Books Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Author Name:-");
    String Author =sc.nextLine();
    
    System.out.println("Enter Book Name :-");
    String BookName =sc.nextLine();

    ShowBooks obj1=new ShowBooks(Author, BookName);
    booksDatabase[index]=obj1;
    
    
  }
}
