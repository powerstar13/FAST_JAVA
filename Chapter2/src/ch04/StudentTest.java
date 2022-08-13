package ch04;

public class StudentTest {

    public static void main(String[] args) {

        // 클래스를 기반으로 인스턴스 생성
        Student studentLee = new Student(12345, "Lee", "서울 강남구");
        studentLee.showStudentInfo();

        Student studentKim = new Student(54321, "Kim", "경기도 성남시");
        studentKim.showStudentInfo();
    }
}
