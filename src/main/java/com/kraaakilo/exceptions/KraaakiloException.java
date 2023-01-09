package com.kraaakilo.exceptions;

public class KraaakiloException extends Exception{
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    public KraaakiloException(String message){
        this.message = message;
    }
}
