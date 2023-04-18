package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ParallelStreams {

    public static class User {
        String name;

        Integer age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        //Liste mit Namen
        List<String> names = List.of("Max", "Moritz", "Hans", "Peter", "Paul", "Klaus");
        //Zerteile die Liste in mehrere Teile und gebe jeden Namen aus
        names.parallelStream().forEach(System.out::println);

        List<User> users = Arrays.asList(
                new User("Alice", 25),
                new User("Bob", 30),
                new User("Charlie", 20),
                new User("David", 35),
                new User("Eve", 28),
                new User("Frank", 40));

        //Sortiere die Liste nach Namen und gebe sie aus
        users.parallelStream().sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList()).forEach(user -> System.out.println(user.getName() + " " + user.getAge()));


    }
}
