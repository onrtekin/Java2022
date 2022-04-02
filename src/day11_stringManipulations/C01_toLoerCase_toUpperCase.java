package day11_stringManipulations;

import java.util.Locale;

public class C01_toLoerCase_toUpperCase {

    public static void main(String[] args) {
        
        
        
        String str="Java Guzeldir";
        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

    }
    
    
}
