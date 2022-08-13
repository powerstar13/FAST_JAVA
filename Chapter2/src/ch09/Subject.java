package ch09;

public class Subject {

    private String subjectName;
    private int score;

    public Subject() {}

    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
