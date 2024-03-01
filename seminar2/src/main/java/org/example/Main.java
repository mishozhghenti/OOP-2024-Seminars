package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new RomanNumeral("IV").toArabicNumeral());
        System.out.println(new RomanNumeral("VI").toArabicNumeral());
        System.out.println(new RomanNumeral("XXI").toArabicNumeral());
        System.out.println(new RomanNumeral("XXII").toArabicNumeral());
        System.out.println(new RomanNumeral("XIX").toArabicNumeral());
    }
}