package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");

        System.out.println(LocalDate.now().format(formatter));
        System.out.println(LocalDate.now());
        System.out.printf("%s %s, %s\n", today.getMonth(), today.getDayOfMonth(), today.getYear());
        System.out.println(today.format(fmt));

    }
}