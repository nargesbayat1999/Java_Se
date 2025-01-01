package org.example;

public class Util {
    public static String caseMethode(String text) {
        if(text==null)
            return "";
        text=text.trim();
        text=text.toLowerCase();
        System.out.println(text);
        return text;
    }



    public static  String search(String text2){
if(text2.startsWith("Narges")){
    System.out.println("yes start by narges");
    }


    int cont=text2.indexOf("s");
        System.out.println(cont);

        if (text2.contains("emergency")){
            System.out.println("yes energency");}
        return  text2;
    }


    public static String stringequals(String Text3 ,String Text4)
    {if (Text3.equalsIgnoreCase(Text4))
        System.out.println("yes equals");
        return Text3;
    }

    }
