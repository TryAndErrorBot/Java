package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        //List ist unveraenderbar
        List<String> unmodifiableList = list.stream().collect(Collectors.toUnmodifiableList());
        unmodifiableList.stream().forEach(System.out::println);
    }
}
