public class Student
  {
    private String firstName, lastName;
    private int studentID;
    
    //constructor 
    public Student(String fname, String lname, int studentid){
        firstName = fname;
        lastName = lname;
        studentID = studentid;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getStudentID(){
        return studentID;
    }
  }
