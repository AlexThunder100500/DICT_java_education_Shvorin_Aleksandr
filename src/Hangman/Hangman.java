package Hangman;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        System.out.println("HANGMAN");
        Scanner sc = new Scanner(System.in);

        boolean found;
        int life=8;

        while (true) {

            System.out.println(" The game will be available soon. ");
            System.out.println ("- Guess the word: (S) ");
            System.out.println ("- Exit (E) ");
            System.out.println ("Please enter your choice : ");

            String answer = sc.nextLine().toUpperCase();

            if (answer.equals("E")) {
            }
            else {

                System.out.println ("Input a letter:");

                String word = sc.nextLine();
                word = word.toUpperCase();
                char[] filler=new char[word.length()];
                int i =0;
                while (i<word.length()) {
                    filler[i]='-';
                    i++;
                }
                found = true;
                while (found) {

                    System.out.print("The Random Word is now : ");
                    System.out.println (filler);
                    System.out.print ("You have "+life);
                    System.out.println (" Lives left");

                    System.out.print ("Your Guess : ");
                    short guess = (short) sc.nextLine().charAt(0);
                    guess = (short) Character.toUpperCase(guess);

                    System.out.println (guess);

                    int j;
                    if (word.contains(guess+"")) {

                        System.out.println ("The Guess is Correct !!");
                        for (j=0;j<word.length();j++) {

                            if(word.charAt(j)==guess) {
                                filler[j]= (char) guess;
                            }
                        }
                    }
                    else {
                        life--;
                    }

                    if(word.equals(String.valueOf(filler))) {
                        System.out.println ("Congratulations You Won! Your Guessed Word is : "+word);
                        found=false;
                    }

                    if (life==0) {
                        found=false;
                        System.out.println ("Game Over.");}
                }
            }
        }
    }
}