package student;

public class Student {
  private String firstName ;
  private String lastName;
  private String nickName;
  private int studentId ;
  private String address1;
  private String address2;
  private String city;
  private String state;
  private int zipCode;
  private int phoneNumber;

  public Student(int studentId) {
    this.studentId = studentId;
  }

  public Student(int studentId, String firstName, String lastName) {
    this.studentId = studentId;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    if(firstName == "") {
      System.out.println("Invalid first name");
    }
    this.firstName = firstName;
  }

  public int getStudentId() {
    return this.studentId;
  }
}
