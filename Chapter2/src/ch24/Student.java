package ch24;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjectList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int score) {
        subjectList.add(new Subject(subjectName, score));
    }

    public void showStudentInfo() {

        int total = 0;

        for (Subject subject : subjectList) {
            int score = subject.getScore();
            total += score;
            System.out.printf("학생 %s의 %s 과목 성적은 %d입니다.\n", studentName, subject.getSubjectName(), score);
        }

        System.out.printf("학생 %s의 총점은 %d입니다.\n", studentName, total);
    }
}
