import java.util.*;

public class ClassRoster
  {
    public static void main(String[] args)
      {
            //create linkedstudentList
            LinkedList<Student> studentList = new LinkedList<Student>();
            //creating student studentList
            Student s1 = new Student("Thomas","Flesher",101);
            Student s2 = new Student("Kendra","Flesher",102);
            Student s3 = new Student("Sadie","Flesher",103);
            Student s4 = new Student("Macy","Flesher",104);
            Student s5 = new Student("Kayla","Flesher",105);
            Student s6 = new Student("Brad","Flesher",106);
            Student s7 = new Student("Kelly","Flesher",107);
            Student s8 = new Student("Shelley","Kempenar",108);
            Student s9 = new Student("Kallee","Kempenar",109);
            Student s10 = new Student("Peggy","Geaudreau",110);
            Student s11 = new Student("Ray","Geaudreau",111);
            Student s12 = new Student("Jason","Voecks",112);
            Student s13 = new Student("Steff","Voecks",113);
            Student s14 = new Student("Landen","Voecks",114);
            Student s15 = new Student("Ali","Voecks",115);
            Student s16 = new Student("Carolyn","Hoppes",116);
            Student s17 = new Student("Dan","Hoppes",117);
            Student s18 = new Student("Jane","Smith",118);
            Student s19 = new Student("Joe","Isles",119);
            Student s20 = new Student("Roger","Frank",120);
           //add students to studentList
            studentList.add(s1);
            studentList.add(s2);
            studentList.add(s3);
            studentList.add(s4);
            studentList.add(s5);
            studentList.add(s6);
            studentList.add(s7);
            studentList.add(s8);
            studentList.add(s9);
            studentList.add(s10);
            studentList.add(s11);
            studentList.add(s12);
            studentList.add(s13);
            studentList.add(s14);
            studentList.add(s15);
            studentList.add(s16);
            studentList.add(s17);
            studentList.add(s18);
            studentList.add(s19);
            studentList.add(s20);
            
            //display original studentList
            System.out.println("\nLinkedList: Original");
            for (Student s : studentList){
                System.out.print(s.getFirstName() + " " + s.getLastName() + " " + s.getStudentID() + "\n");
            }
            System.out.println("\nLinkedList: Reversed");
            Collections.reverse(studentList);
            for (Student s : studentList){
                System.out.print(s.getFirstName() + " " + s.getLastName() + " " + s.getStudentID() + "\n");
            }            
      }
  }