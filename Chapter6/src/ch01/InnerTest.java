package ch01;

class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        this.inClass = new InClass();
    }

    private class InClass {

        int inNum = 100;

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

    public void usingClass() {
        inClass.inTest();
    }

    static class InStaticClass {

        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println("InStaticClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InStaticClass iNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }

        static void sTest() {
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InStaticClass iNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
        }
    }
}

public class InnerTest {

    public static void main(String[] args) {

        // 인스턴스 내부 클래스 사용하기
        OutClass outClass = new OutClass();
        outClass.usingClass();

        System.out.println();

        // 정적 내부 클래스 사용하기
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        System.out.println();

        OutClass.InStaticClass.sTest();
    }
}
