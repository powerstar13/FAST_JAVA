package ch09;

public class Student {

    private int studentId;
    private String studentName;

    private Subject korea;
    private Subject math;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        this.korea = new Subject();
        this.math = new Subject();
    }

    public void setKorea(Subject korea) {
        this.korea = korea;
    }

    public void setMath(Subject math) {
        this.math = math;
    }

    public void showScoreInfo() {
        int total = korea.getScore() + math.getScore();
        System.out.printf("%s 학생의 총점은 %d점입니다.\n", this.studentName, total);
    }
}
