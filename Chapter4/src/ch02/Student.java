package ch02;

public class Student {

    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentNum + ", " + studentName;
    }

    /**
     * equals를 재정의할 때 비교한 값을 반환해주면 된다.
     * @return
     */
    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student) {
            Student std = (Student) obj; // 다운캐스팅
            if (this.studentNum == std.studentNum)
                return true;
            else return false;
        }

        return false;
    }
}
