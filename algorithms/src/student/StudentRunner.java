package student;

public class StudentRunner {
  public static void main(String[] args) {
    Student s = new Student(1);
    System.out.println(s.getStudentId());
    System.out.println(s.getFirstName());
    Student s2 = new Student(2, "saia", "kalyan");
//    s2.studentId = 2;
    s2.setFirstName("sai");
    System.out.println(s2.getStudentId());
    System.out.println(s2.getFirstName());

    s2.setFirstName("");
//    s2.firstName = "";
  }
}
