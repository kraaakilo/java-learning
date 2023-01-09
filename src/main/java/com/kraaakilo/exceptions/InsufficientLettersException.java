package com.kraaakilo.exceptions;

public class InsufficientLettersException extends Exception{
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public InsufficientLettersException(String message) {
        this.message = message;
    }
}
