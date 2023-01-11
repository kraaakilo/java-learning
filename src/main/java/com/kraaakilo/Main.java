package com.kraaakilo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        try {
            Path file = Paths.get("./image.jpg");
            Path copy = Paths.get("./out.jpg");
            Files.copy(file,copy, StandardCopyOption.REPLACE_EXISTING);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}