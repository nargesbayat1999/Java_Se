package org.example.eroor_handeling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Register {
    public static void main(String[] args) {

        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

            if (age<18)
                throw new AgeNotValidException("سن کوچگ تر از 18");

        }
        catch (InputMismatchException e){
            System.out.println("ورودی معتبر نیست");
        }
catch (AgeNotValidException e){
            System.out.println(e.getMessage());
}
        finally{System.out.println("فرم ارسال شد ");}

    }
}