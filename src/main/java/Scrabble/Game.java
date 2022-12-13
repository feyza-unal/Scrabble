package Scrabble;

import java.util.Scanner;
import static Scrabble.Finalword.fnlword;
public class Game {
    static int plyr1Score = 0;
    static int plyr2Score = 0;

    static void gameStart(String player1Name, String player2Name, String word) {
        Scanner input = new Scanner(System.in);

        System.out.println(player2Name + " , Do you accept " + "-" + word + "-" + " ?" + "(Y/N)");
        char doYouAccept = input.next().toUpperCase().charAt(0);
        if (doYouAccept == 'Y') {

            plyr1Score += word.length();
            System.out.println("1st player's score: " + plyr1Score);
            System.out.println(player2Name + " Do you want to continue ? (Y/N)");
            char cntnue = input.next().toUpperCase().charAt(0);

            if (cntnue == 'Y') {

                System.out.println("Enter the word to suffix to word " + "-" + word + "-");
                String suffix = input.next().toUpperCase();

                word = fnlword(word, suffix);

                System.out.println(player1Name + " , Do you accept " + "-" + word + "-" + " ?" + "(Y/N)");
                doYouAccept = input.next().toUpperCase().charAt(0);

                if (doYouAccept == 'Y') {

                    plyr2Score += word.length();

                    System.out.println("2nd player's score: " + plyr2Score);
                    System.out.println(player1Name + " Do you want to continue ? (Y/N)");
                    cntnue = input.next().toUpperCase().charAt(0);

                    if (cntnue == 'Y') {

                        System.out.println("Enter the word to suffix to word " + "-" + word + "-");
                        suffix = input.next().toUpperCase();

                        word = fnlword(word, suffix);
                        gameStart(player1Name, player2Name, word);

                    }

                }

            }

        }
    }
}