package ch09;

public abstract class Laptop extends Computer {

    // 추상 메서드 구현
    @Override
    public void display() {
        System.out.println("Laptop display");
    }
}
