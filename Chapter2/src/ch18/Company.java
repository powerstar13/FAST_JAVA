package ch18;

public class Company {

    // 유일한 객체를 제공할 때 싱글톤 패턴을 사용한다.
    private static Company instance = new Company();

    private Company() {
    }

    public static Company getInstance()
    {
        if (instance == null) instance = new Company();
        return instance;
    }
}
