package ch10;

import java.time.LocalDate;

public class BirthdayTest {

    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();

        Birthday date = new Birthday();
        date.setYear(nowDate.getYear());
        date.setMonth(nowDate.getMonthValue());
        date.setDay(nowDate.getDayOfMonth());

        date.showDate();
    }
}
