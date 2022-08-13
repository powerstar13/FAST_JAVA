package ch15;

public class IfIfTest {

    public static void main(String[] args) {

        int age = 12;
        int charge = 3000;

        if (age < 8) {
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        }
        if (8 <= age && age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        }
        if (14 <= age && age < 20) {
            charge = 2500;
            System.out.println("중·고등학생입니다.");
        }
        if (20 <= age) {
            charge = 3000;
            System.out.println("일반인입니다.");
        }

        System.out.printf("입장료는 %s원입니다.%n", charge);
    }
}
