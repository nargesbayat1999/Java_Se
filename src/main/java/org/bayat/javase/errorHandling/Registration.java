package org.bayat.javase.errorHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

//Test Class Registration

public class Registration {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if (age < 18)
                throw new AgeNotValidException(age + "!" + "\n ثبتنام افراد زیر 18 سال معتبر نیست");
        } catch (InputMismatchException e) {
            System.out.println("ورودی معتبر نیست لطفا عدد سن وارد کنید");
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("فرم ارسال شد ");
        }

    }
}