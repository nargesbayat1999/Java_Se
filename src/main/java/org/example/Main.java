package org.example;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String txt=  "Narges home star isc energency   ";

        String txt2=  "Narges home star Isc Energency   ";


       Util.search(txt2);
       Util.stringequals(txt2,txt);
        Util.caseMethode(txt);
    }
}
