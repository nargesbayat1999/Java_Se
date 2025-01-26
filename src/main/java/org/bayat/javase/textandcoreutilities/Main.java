package org.bayat.javase.textandcoreutilities;


public class Main {
    public static void main(String[] args) {
        String txt = "Narges home star isc energency   ";

        String txt2 = "Narges home star Isc Energency   ";
        Util test=Util.getInstance();

        test.search(txt2);
        test.equals(txt2, txt);
        test.convertToLowerCase(txt2);

        if(test.equals(txt2, txt))
            System.out.println("yes equals");
    }
}
