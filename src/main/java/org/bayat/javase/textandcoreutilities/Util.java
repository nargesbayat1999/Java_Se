package org.bayat.javase.textandcoreutilities;

public class Util {

    private static Util utilInstance = new Util();

    private Util() {
    }

    //creat Object Method
    public static Util getInstance() {
        return utilInstance;
    }

    //This method converts all uppercase letters to lowercase
    public String convertToLowerCase(String text) {
        if (text == null)
            return "";
        text = text.trim();
        text = text.toLowerCase();
        System.out.println(text);
        return text;
    }

    public String search(String text2) {
        if (text2.startsWith("Narges"))
            System.out.println("yes start by narges");

        int cont = text2.indexOf("s");
        System.out.println(cont);

        if (text2.contains("emergency"))
            System.out.println("yes energency");

        return text2;
    }

    public boolean equals(String text3, String text4) {
        return text3.equalsIgnoreCase(text4);
    }

}
