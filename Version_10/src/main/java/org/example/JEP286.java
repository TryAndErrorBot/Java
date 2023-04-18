package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JEP286 {
    public static void main(String[] args) {
        try (var reader = new BufferedReader(new FileReader("file.txt"))) {
            // Do something with the reader
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
