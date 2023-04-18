package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    private static Predicate<Integer> isEven = (number) -> number % 2 == 0;
    public static void main(String[] args) {
        //Anstatt Liste aufwendig zu initialisieren, benutze of

        List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 7, 8);
        List<Integer> evenNumbers = numbers.stream().takeWhile(isEven).
                collect(Collectors.toList());
        System.out.println("Even numbers: ");
        System.out.println(evenNumbers);

        List<String> ppl = List.of("Bill", "Bob", "Jennifer", "Ben");
        List<String> newPpl = ppl.stream()
                .takeWhile(person -> !person.equals("Jennifer"))
                .map(person -> person + " 1")
                .collect(Collectors.toList());

        newPpl.stream().forEach(System.out::println);

        Stream.iterate(0, n -> n < 10, n -> n + 1)
                .forEach(System.out::println);

        ppl = List.of("Bill", "Bob", "Jennifer", "Ben");
        newPpl = ppl.stream()
                .dropWhile(person -> !person.equals("Jennifer"))
                .map(person -> person + " 1")
                .collect(Collectors.toList());

        newPpl.stream().forEach(System.out::println);

    }
}
