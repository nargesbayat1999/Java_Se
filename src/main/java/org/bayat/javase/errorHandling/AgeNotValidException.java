package org.bayat.javase.errorHandling;


// This exception applies to those under the age of 18.
public class  AgeNotValidException extends Exception  {

    public AgeNotValidException(String message) {
        super(message);
    }

}
