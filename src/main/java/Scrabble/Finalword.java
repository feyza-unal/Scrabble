package Scrabble;

import java.util.Scanner;

public class Finalword {
    static String fnlword;

    static String fnlword(String word, String sffx) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Do you want to put it at the beginning or end of the word?\n Press 'B' for the beginning, Press 'E' for the end of the word");
        char beginningOrEnd = input.next().toUpperCase().charAt(0);
        if (beginningOrEnd == 'B') {
            fnlword = sffx + word;
        } else if (beginningOrEnd == 'E') {
            fnlword = word + sffx;
        } else {
            System.out.println("Enter 'B' or 'E'");
            fnlword(word, sffx);

        }
        return fnlword;
    }
}
