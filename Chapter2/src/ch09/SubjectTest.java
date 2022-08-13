package ch09;

public class SubjectTest {

    public static void main(String[] args) {

        Student studentLee = new Student(100, "Lee");
        studentLee.setKorea(new Subject("국어", 100));
        studentLee.setMath(new Subject("수학", 99));

        Student studentKim = new Student(200, "Kim");
        studentKim.setKorea(new Subject("국어", 50));
        studentKim.setMath(new Subject("수학", 65));

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
