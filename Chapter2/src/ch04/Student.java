package ch04;

public class Student {

    private int studentNumber;
    private String studentName;
    private String address;

    public Student(int studentNumber, String studentName, String address) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void showStudentInfo() {
        System.out.printf("%d 학번의 이름은 %s이고, 주소는 %s입니다.\n", studentNumber, studentName, address);
    }
}
