package ch10;

public class Birthday {

    private int day;
    private int month;
    private int year;

    private boolean valid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            this.valid = false;
        } else {
            this.valid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if (valid) System.out.printf("%d년 %d월 %d일입니다.\n", this.year, this.month, this.day);
        else System.out.println("유효하지 않은 날짜입니다.");
    }
}
