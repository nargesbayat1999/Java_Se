package org.bayat.javase.collection;


import java.util.Collection;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Collection<String> myCollection = new MyCollection<>();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("عناصر مورد نظر وارد کن و با ','جدا کن");
            String input = scanner.nextLine();
            String[] inputArray = input.split(",");
            for (String s : inputArray) {
                myCollection.add(s);
            }
            for (String s : myCollection) {
                System.out.println(s);
            }
            System.out.println("طول آرایه:"+myCollection.size());
            System.out.println("عنصر ریمو شده رو انتخاب کن");
            String removeElement = scanner.nextLine();
            myCollection.remove(removeElement);
            System.out.println("طول آرایه:"+myCollection.size());



        }



            Repository<Integer, String> narges = new Repository<>(22, "5");
            System.out.println(narges);





    }
}
