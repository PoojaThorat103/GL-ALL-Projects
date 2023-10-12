package org.example.JavaProgrameTest;

public class separeteCharacterNumberFromString {

    public static void main (String [] args){

        String s = "12hs*fsdf908??&p";

        StringBuilder digit = new StringBuilder();
        StringBuilder alphabets =  new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();

        for(int i =0; i <= s.length() -1; i++){

            if(Character.isDigit(s.charAt(i))){
                digit.append(s.charAt(i));
            }else if(Character.isAlphabetic(s.charAt(i))){
                alphabets.append(s.charAt(i));
            }else{
                specialCharacters.append(s.charAt(i));
            }
        }
        System.out.println(digit);
        System.out.println(alphabets);
        System.out.println(specialCharacters);
    }

}
