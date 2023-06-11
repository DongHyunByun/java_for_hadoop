package com.fastcampus.de.java.clip13;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println(LocalDate.of(2022,2,20));
        System.out.println(LocalDate.parse("2022-02-20"));

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);

        DayOfWeek dow = LocalDate.now().getDayOfWeek();
        System.out.println(dow);
    }
}
