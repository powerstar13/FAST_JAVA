package ch02;

public class LambdaTest {

    public static void main(String[] args) {

//        Add addI = (x, y) -> { return x + y; };
        Add addI = (x, y) -> x + y;

        System.out.println(addI.add(2, 3));
    }
}
