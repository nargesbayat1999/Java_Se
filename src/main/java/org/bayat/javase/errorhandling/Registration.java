package org.bayat.javase.errorhandling;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
This class is to determine the age of people to register for the practice of the custom exhibition
*/
public class Registration {

    public static void main(String[] args) {
        /*
        This exception is custom defined to control the user's age
        Version 0.1
        Producer: Narges Bayat
        */
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println("فرم ارسال شد");
            }
            if (age < 18)
                throw new AgeNotValidException(age + "!" + "\n ثبت نام افراد زیر 18 سال معتبر نیست");
        } catch (InputMismatchException e) {
            System.out.println("ورودی معتبر نیست لطفا عدد سن وارد کنید");
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("اصلاعات برسی شد ");
        }

    }
}