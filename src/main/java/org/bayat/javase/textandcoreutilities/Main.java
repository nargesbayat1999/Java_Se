package org.bayat.javase.textandcoreutilities;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String txt = "Narges home star isc energency   ";

        String txt2 = "Narges home star Isc Energency   ";
        Util test=Util.getInstance();

        test .search(txt2);
        test.stringequals(txt2, txt);
        test.caseMethode(txt);
    }
}
