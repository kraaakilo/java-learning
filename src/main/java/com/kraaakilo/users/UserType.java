package com.kraaakilo.users;

public enum UserType {
    Woman("With a boobs"),
    Man("With a biceps"),
    Binary("With none of them");

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    UserType(String description) {
        this.description = description;
    }
}
