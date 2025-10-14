import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> names = new newDeck().name();
        List<Integer> deck = new newDeck().newDeck();
        System.out.println(names);
        System.out.println(deck);
        List<Integer> playerHand = new ArrayList<>();
        List<Integer> dealerHand = new ArrayList<>();
        int card = returnCard(deck.size());
        dealerHand.add(deck.get(card));
        deck.remove(card);
        card = returnCard(deck.size());
        playerHand.add(deck.get(card));
        deck.remove(card);
        card = returnCard(deck.size());
        dealerHand.add(deck.get(card));
        deck.remove(card);
        card = returnCard(deck.size());
        playerHand.add(deck.get(card));
        deck.remove(card);
        System.out.println("Your cards are, " + playerHand.get(0) + " and " + playerHand.get(1));
        System.out.println("The dealers cards are " + dealerHand.get(0) + " and a mystery card!");
        System.out.println("Your total is " + total(playerHand));


    }
    public static int returnCard(int decksize) {
        Random rng = new Random();
        int min = 0;
        int max = decksize;
        return(rng.nextInt((max-(min)) + 1) + min);

    }

    public static int total(List<Integer> hand) {
        int total = 0;
        for (int i = 0; i < hand.size(); i++) {
            total += hand.get(i);
        }
        return total;
    }
    public static boolean bust(int total){
        if (total > 21) return true;
        else return false;
    }

    public static List<Integer> aceChecker(List<Integer> hand) {
        if (total(hand) > 21) {
            if (hand.contains(11)) {
                hand.remove(11);
                hand.add(1);
            }
            }
        return hand;
    }
    }