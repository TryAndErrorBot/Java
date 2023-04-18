package org.example;

import java.util.Optional;

public class ProcessBuilder {
    public static void main(String[] args) {
        ProcessHandle handle = ProcessHandle.of(31177).orElseThrow(IllegalStateException::new);boolean isRunning = handle.isAlive();
        Optional<String> command = handle.info().command();
        System.out.println(command);
        long pid = handle.pid();

    }
}
