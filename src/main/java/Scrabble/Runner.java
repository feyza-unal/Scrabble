package Scrabble;

import java.util.Scanner;

import static Scrabble.Game.*;

public class Runner {

    static String word;
    static String player1Name;
    static String player2Name;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st player's name: ");
        player1Name = input.next().toUpperCase();

        System.out.println("Enter 2nd player's name: ");
        player2Name = input.next().toUpperCase();

        System.out.println(player1Name+", Enter a word to start the game: ");
        word=input.next().toUpperCase();
        System.out.println(word);

        gameStart(player1Name, player2Name, word);

        System.out.println(player1Name+": "+plyr1Score);
        System.out.println(player2Name+": "+plyr2Score);

        if (plyr1Score > plyr2Score) {
                System.out.println(player1Name + " WIN!!!");
        } else if (plyr2Score > plyr1Score) {
            System.out.println(player2Name + " WIN!!!");
        } else {
            System.out.println("The game is over in a draw");
        }


    }
}
