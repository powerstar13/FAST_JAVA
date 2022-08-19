package ch09;

public class Desktop extends Computer {

    // 추상 메서드 구현
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    // 추상 메서드 구현
    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    // 오버라이드
    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");
    }
}
