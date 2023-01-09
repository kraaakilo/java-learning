package com.kraaakilo;
import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        recursiveListing(File.listRoots());
    }

    public static void recursiveListing(File[] files) {

        for (File f : files) {
            if (f.isDirectory()) {
                try {
                    recursiveListing(Objects.requireNonNull(f.listFiles()));
                } catch (NullPointerException e) {
                    System.out.println("Accès refusé...");
                }
            } else {
                System.out.println(f.getName());
            }
        }
    }
}