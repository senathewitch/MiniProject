package Hangman;

import java.io.*;
import java.util.*;

public class MiniProject {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("C:/Users/Sonny/cities.txt"));
        Scanner keyboard = new Scanner(System.in);

        List<String> cities = new ArrayList<>();

        while (scanner.hasNext()) {
            cities.add(scanner.nextLine());
        }
        Random rand = new Random();

        String city = cities.get(rand.nextInt(cities.size()));

        System.out.println(city);

        List<Character> playerGuesses = new ArrayList<>();

        printCityState(city, playerGuesses);

        System.out.println("Guess a letter!");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));

        printCityState(city, playerGuesses);

    }
    private static void printCityState(String city, List<Character> playerGuesses) {
        for (int i = 0; i < city.length(); i++) {
            if (playerGuesses.contains(city.charAt(i))) {
                System.out.print(city.charAt(i));
            }
            else {
                System.out.print("_");
            }
        }
        System.out.println();
    }
}

