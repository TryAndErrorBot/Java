package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class DateAndTime {
    public static void main(String[] args) {
        //Erstelle ein LocalDateTime Objekt
        LocalDateTime localDateTimePast = LocalDateTime.of(2022, 1, 1, 0, 0);
        System.out.println(localDateTimePast);

        //Erstelle ein LocalDateTime Objekt mit der aktuellen Zeit
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println(localDateTimeNow);

        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTimeNow, ZoneOffset.ofHours(2) );
        System.out.println(offsetDateTime);


        //Manipuliere ein LocalDateTime Objekt
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDatePlusTwoDays = localDateNow.plusDays(2);
        LocalDate localDateMinusTwoDays = localDateNow.minusDays(2);
    }
}
