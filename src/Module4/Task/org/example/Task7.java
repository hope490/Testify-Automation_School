package org.example;

public class Task7 {
    public static void main(String[] args) {

        String[][] fruitsArray = new String[4][3];

        fruitsArray[0][0] = "pineapple";
        fruitsArray[1][0] = "pea";
        fruitsArray[2][0] = "Orange";
        fruitsArray[3][0] = "Bananas";


        fruitsArray[3][2] = "Mango";

        for (int i = 0; i < fruitsArray.length; i++) {
            for (int j = 0; j < fruitsArray[i].length; j++) {
                System.out.println(fruitsArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
