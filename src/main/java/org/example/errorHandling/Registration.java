package org.example.errorHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            if (age == 0)
                throw new IllegalAccessException("Age is Zero!");

            if (age < 18)
                throw new AgeNotValidException("سن کوچگ تر از 18");

        } catch (NullPointerException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("ورودی معتبر نیست");
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("فرم ارسال شد ");
        }

    }
}