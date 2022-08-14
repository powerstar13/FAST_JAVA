package ch14;

public class Student {

    private String studentName;
    private int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus)
    {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway)
    {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo()
    {
        System.out.printf("%s님의 남은 돈은 %d원입니다.\n", studentName, money);
    }
}
