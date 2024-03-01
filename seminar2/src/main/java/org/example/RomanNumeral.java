package org.example;

public class RomanNumeral {
    // private fields
    private String romanNumeral;

    // Constructor
    public RomanNumeral(String romanNumeral) throws Exception {
        if(romanNumeral.isEmpty()){
            throw new Exception("Illegal romanNumeral");
        }
        this.romanNumeral = romanNumeral;
    }

    public int toArabicNumeral() throws Exception {
        int result = 0;
        int index = 0;
        while(index < this.romanNumeral.length()){
            char currentCharacter = this.romanNumeral.charAt(index);

            int currentNumber = letterToNumber(currentCharacter);
            index ++;

            if(index == this.romanNumeral.length()){
                result += currentNumber;
            }else{
                int nextNumber = letterToNumber(this.romanNumeral.charAt(index));

                if(nextNumber > currentNumber){
                    result += (nextNumber - currentNumber);
                    index++;
                }else{
                    result += currentNumber;
                }
            }
        }
        return result;
    }

    private int letterToNumber(char letter) throws Exception {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new Exception("Illegal input");
        }
    }

    // Getter of initial roman numeral value
    public String getRomanNumeral() {
        return romanNumeral;
    }
}