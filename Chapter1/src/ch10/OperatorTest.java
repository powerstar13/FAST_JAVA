package ch10;

public class OperatorTest {

    public static void main(String[] args) {

        int myNum = 10;
        int yourNum = 20;

        myNum = myNum + yourNum;
        System.out.println(myNum);
        myNum += yourNum;
        System.out.println(myNum);

        int gameScore = 150;

        int lastScore = ++gameScore; // gameScore += 1; gameScore = gameScore +1;
        System.out.println(lastScore);
        System.out.println(gameScore);

        lastScore = gameScore++;
        System.out.println(lastScore);
        System.out.println(gameScore);

        lastScore = --gameScore;
        System.out.println(lastScore);
        System.out.println(gameScore);

        lastScore = gameScore--;
        System.out.println(lastScore);
        System.out.println(gameScore);
    }
}
