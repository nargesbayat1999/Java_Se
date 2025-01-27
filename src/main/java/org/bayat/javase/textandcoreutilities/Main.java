package org.bayat.javase.textandcoreutilities;


public class Main {
    public static void main(String[] args) {
        String txt = "Narges home star isc emergency   ";

        String txt2 = "Narges home star Isc emergency   ";
        Util test=Util.getInstance();

        test.search(txt2);
        System.out.println(txt2);
        test.equals(txt2, txt);
        test.convertToLowerCase(txt2);

        if(test.equals(txt2, txt))
            System.out.println("yes equals");
    }
}
