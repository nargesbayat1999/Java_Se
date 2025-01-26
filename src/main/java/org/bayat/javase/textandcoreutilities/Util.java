package org.bayat.javase.textandcoreutilities;

public class Util {

    private  static  Util util = new Util();

    static public Util getInstance(){

        return util;
    }
    private Util() {
    }

    public  String caseMethode(String text) {
        if (text == null)
            return "";
        text = text.trim();
        text = text.toLowerCase();
        System.out.println(text);
        return text;
    }


    public  String search(String text2) {
        if (text2.startsWith("Narges")) {
            System.out.println("yes start by narges");
        }


        int cont = text2.indexOf("s");
        System.out.println(cont);

        if (text2.contains("emergency")) {
            System.out.println("yes energency");
        }
        return text2;
    }


    public String stringequals(String text3, String text4) {
        if (text3.equalsIgnoreCase(text4))
            System.out.println("yes equals");
        return text3;
    }

}
