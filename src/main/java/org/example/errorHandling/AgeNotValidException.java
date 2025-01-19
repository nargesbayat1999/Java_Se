package org.example.errorHandling;

public class  AgeNotValidException extends Exception  {

    public AgeNotValidException(String message) {
        super(message);
    }

}
