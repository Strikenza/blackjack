import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new newDeck().name();
        List<Integer> deck = new newDeck().newDeck();
        System.out.println(names);
        System.out.println(deck);
        int dealerCard1;
        int dealerCard2;
        List<Integer> PlayerCards = new ArrayList<>();

        int card = returnCard(deck.size());
        dealerCard1 = deck.get(card);
        deck.remove(card);
        card = returnCard(deck.size());
        dealerCard2 = deck.get(card);
        deck.remove(card);
        card = returnCard(deck.size());
        PlayerCards.add(deck.get(card));
        deck.remove(card);
        card = returnCard(deck.size());
        PlayerCards.add(deck.get(card));
        deck.remove(card);
        System.out.println("Your cards are, " + PlayerCards.get(0) + " and " + PlayerCards.get(1));
        System.out.println("The total is " + (PlayerCards.get(0) + PlayerCards.get(1)));


    }
    public static int returnCard(int decksize) {
        Random rng = new Random();
        int min = 0;
        int max = decksize;
        return(rng.nextInt((max-min) + 1) + min);

    }
}