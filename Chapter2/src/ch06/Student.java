package ch06;

public class Student {

    private int studentNumber;
    private String studentName;
    private int grade;

    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return String.format("%d 학번의 이름은 %s이고, %d학년입니다.", this.studentNumber, this.studentName, this.grade);
    }
}
