package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {
        //Definiere eine Liste von Zahlen
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Gebe die Gesamtsumme aller Zahlen aus
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Summe:" + sum);

        //Gebe die Summe aller geraden Zahlen aus
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        IntStream.range(0,10_000_000).parallel().forEach(System.out::println);
    }
}
