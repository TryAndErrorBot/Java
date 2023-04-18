package org.example;

import java.util.List;

public class Collections {
    public static void main(String[] args) {
        //Anstatt Liste aufwendig zu initialisieren, benutze of

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> copyNumbers = List.copyOf(numbers);

        copyNumbers.stream().forEach(System.out::println);
    }
}
