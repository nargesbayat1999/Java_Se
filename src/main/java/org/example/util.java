package org.example;

public class util {
    public static String case_methode(String text) {
        if(text==null)
            return "";
        text=text.trim();
        text=text.toLowerCase();
        System.out.println(text);
        return text;
    }



    public static  String search(String Text2){
if(Text2.startsWith("Narges")){
    System.out.println("yes start by narges");
    }


    int cont=Text2.indexOf("s");
        System.out.println(cont);

        if (Text2.contains("emergency")){
            System.out.println("yes energency");}
        return  Text2;
    }


    public static String Stringequals(String Text3 ,String Text4)
    {if (Text3.equalsIgnoreCase(Text4))
        System.out.println("yes equals");
        return Text3;
    }

    }
