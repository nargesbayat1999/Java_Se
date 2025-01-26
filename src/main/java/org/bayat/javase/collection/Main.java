package org.bayat.javase.collection;


import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        Collection<String> myCollection = new MyCollection<>();
        myCollection.add("A");
        myCollection.add("B");
        myCollection.add("C");
        myCollection.add("D");
        myCollection.add("E");

       myCollection.remove("A");

        System.out.println(myCollection.size());

        myCollection.forEach(System.out::println);



        Repository<Integer, String> narges = new Repository<>(22, "5");
        System.out.println(narges);


    }


}
