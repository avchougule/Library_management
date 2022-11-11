package student;


public class Student {
  
  private String name;
  private int Role_no;
  private int Library_id;

  public Student(String name, int role_no, int library_id) {
    this.name = name;
    Role_no = role_no;
    Library_id = library_id;
  }

  public Student() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRole_no() {
    return Role_no;
  }

  public void setRole_no(int role_no) {
    Role_no = role_no;
  }

  public int getLibrary_id() {
    return Library_id;
  }

  public void setLibrary_id(int library_id) {
    Library_id = library_id;
  }


  



}