package com.kraaakilo.users;

import com.kraaakilo.exceptions.InsufficientLettersException;
import com.kraaakilo.exceptions.KraaakiloException;

import java.util.Objects;

public class User implements PlayerInterface {
    private String name;
    public static int instances;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private UserType gender = UserType.Binary;

    public UserType getGender() {
        return gender;
    }

    public void setGender(UserType gender) {
        this.gender = gender;
    }

    public User(String name) throws KraaakiloException, InsufficientLettersException {
        if (Objects.equals(name, "Unknown")) {
            throw new KraaakiloException("Unknown is not allowed as username");
        }
        if (name.length() < 5) {
            throw new InsufficientLettersException("Letters are not enough");
        }
        this.name = name;
        instances++;
    }

    public User(UserType gender) {
        this.name = "Unknown";
        this.gender = gender;
        instances++;
    }

    public void describe() {
        System.out.println("My name is " + this.name + " and my name count : " + name.length() + " letters");
    }

    @Override
    public void play() {
        System.out.println("I'm playing now Fortnite");
    }

    @Override
    public void win() {
        System.out.println("I'm winning on Fortnite");
    }

    @Override
    public String toString() {
        return "My name is " + this.name + " and my name count : " + name.length() + " letters";
    }

}
