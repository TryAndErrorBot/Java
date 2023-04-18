package org.example;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalMethod {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("Hello");
        String value = optional.orElseThrow(NoSuchElementException::new);
        System.out.println(value);

        //Hello

        optional = Optional.ofNullable(null);
        value = optional.orElseThrow(NoSuchElementException::new);
        System.out.println(value);

        /**
         * Exception in thread "main" java.util.NoSuchElementException
         * 	at java.base/java.util.Optional.orElseThrow(Optional.java:403)
         * 	at org.example.OptionalMethod.main(OptionalMethod.java:13)
         */
    }
}
