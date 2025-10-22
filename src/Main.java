import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> names = new newDeck().name();
        List<Integer> deck = new newDeck().newDeck();
        List<Integer> playerHand = new ArrayList<>();
        List<Integer> dealerHand = new ArrayList<>();
        List<String> playerHandNames = new ArrayList<>();
        List<String> dealerHandNames = new ArrayList<>();
        int card = returnCard(deck.size());
        dealerHand.add(deck.get(card));
        dealerHandNames.add(names.get(card));
        deck.remove(card);
        names.remove(card);
        card = returnCard(deck.size());
        playerHand.add(deck.get(card));
        playerHandNames.add(names.get(card));
        deck.remove(card);
        names.remove(card);
        card = returnCard(deck.size());
        dealerHand.add(deck.get(card));
        dealerHandNames.add(names.get(card));
        deck.remove(card);
        names.remove(card);
        card = returnCard(deck.size());
        playerHand.add(deck.get(card));
        playerHandNames.add(names.get(card));
        deck.remove(card);
        names.remove(card);
        System.out.println("Your cards are " + playerHandNames.get(0) + " and " + playerHandNames.get(1));
        System.out.println("The dealers cards are " + dealerHandNames.get(0) + " and a face down card!");
        System.out.println("Your total is " + total(playerHand));
        playerHand = aceChecker(playerHand);
        dealerHand = aceChecker((dealerHand));
        Scanner scanner = new Scanner(System.in);
        while (bust(total(playerHand)) == false) {
            System.out.println("Would you like to hit or stand?");
            String hitOrStand = scanner.nextLine();
            if (hitOrStand.equals("hit") || hitOrStand.equals("Hit")) {
                card = returnCard(deck.size());
                playerHand.add(deck.get(card));
                playerHandNames.add(names.get(card));
                deck.remove(card);
                names.remove(card);
                System.out.println("You pulled " + playerHandNames.get(playerHandNames.size() - 1));
                System.out.println("Your total is " + total(playerHand));
                if (bust(total(playerHand))) {
                    System.out.println("You busted!");
                }
            }
            else {
                while (bust(total(dealerHand)) == false) {
                    if (total(dealerHand) < 17) {
                        card = returnCard(deck.size());
                        dealerHand.add(deck.get(card));
                        dealerHandNames.add(names.get(card));
                        deck.remove(card);
                        names.remove(card);
                        System.out.println("The dealer pulled " + dealerHandNames.get(dealerHandNames.size() - 1));
                        System.out.println("The dealer's total is " + total(dealerHand));
                    }
                    else {
                        if (bust(total(dealerHand)) == false) {
                            if (total(playerHand) > (total(dealerHand)))
                                System.out.println("You win!");
                            if (total(dealerHand) > (total(playerHand))) {
                                System.out.println("Dealer wins!");
                            }
                            if (total(playerHand) == total(dealerHand)) {
                                System.out.println("Tie!");
                            }
                            dealerHand.add(22);
                        }
                    }
                }

            }
        }





    }
    public static int returnCard(int decksize) {
        Random rng = new Random();
        int min = 0;
        int max = decksize - 1;
        return(rng.nextInt((max-min) + 1) + min);

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