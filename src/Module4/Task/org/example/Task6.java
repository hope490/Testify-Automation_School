package org.example;

public class Task6 {
    public static void main(String[] args) {
        String word = "DEMOCRACY";
        String reversed = " ";
        for(int i = word.length()-1 ; i>=0; i--)
            reversed+=word.charAt(i);
        System.out.println(reversed);

       String extraction=reversed.substring(5,9);
        System.out.println(extraction);
    }

}
