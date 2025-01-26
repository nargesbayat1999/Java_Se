package org.bayat.javase.errorhandling;


/*
 This exception applies to those under the age of 18.
 Version 0.1
 Producer: Narges Bayat
 */
public class AgeNotValidException extends RuntimeException {

    public AgeNotValidException(String message) {
        super(message);
    }

}
