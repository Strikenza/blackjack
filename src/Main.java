import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int card;
        List<Integer> deck = new newDeck().newDeck();
        List<String> names = new newDeck().name();
        boolean reset;
        while (1==1) {
            System.out.println("--------------------");
            reset = false;
            System.out.println(deck);
            System.out.println(names);
            List<Integer> playerHand = new ArrayList<>();
            List<Integer> dealerHand = new ArrayList<>();
            List<String> playerHandNames = new ArrayList<>();
            List<String> dealerHandNames = new ArrayList<>();
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
                if (reset) {
                    System.out.println("yo");
                    break;
                }
                else {
                    System.out.println("gurt");
                    System.out.println("Would you like to hit or stand?");
                    String hitOrStand = scanner.nextLine();
                    if (hitOrStand.equals("hit") || hitOrStand.equals("Hit")) {
                        card = returnCard(deck.size());
                        playerHand.add(deck.get(card));
                        playerHandNames.add(names.get(card));
                        deck.remove(card);
                        names.remove(card);
                        System.out.println("You pulled " + playerHandNames.get(playerHandNames.size() - 1));
                        playerHand = aceChecker(playerHand);
                        System.out.println("Your total is " + total(playerHand));
                        if (bust(total(playerHand))) {
                            System.out.println("You busted with a " + total(playerHand) + ". You lose!");
                            break;
                        }
                    } else {
                        System.out.println("Dealer's face down card was " + dealerHandNames.get(1) + " and as such has a total of " + total(dealerHand));
                        while (bust(total(dealerHand)) == false) {
                            if (total(dealerHand) < 17) {
                                card = returnCard(deck.size());
                                dealerHand.add(deck.get(card));
                                dealerHandNames.add(names.get(card));
                                deck.remove(card);
                                names.remove(card);
                                System.out.println("The dealer pulled " + dealerHandNames.get(dealerHandNames.size() - 1));
                                dealerHand = aceChecker(dealerHand);
                                System.out.println("The dealer's total is " + total(dealerHand));
                                if (bust(total(dealerHand))) {
                                    System.out.println("Dealer busts with a " + total(dealerHand) + ". You win!");
                                    break;
                                }
                            } else {
                                if (!bust(total(dealerHand))) {
                                    if (total(playerHand) > (total(dealerHand))) {
                                        System.out.println("You win with a " + total(playerHand) + "!");
                                        reset = true;
                                        break;
                                    }
                                    if (total(dealerHand) > (total(playerHand))) {
                                        System.out.println("Dealer wins with a " + total(dealerHand) + "!");
                                        reset = true;
                                        break;
                                    }
                                    if (total(playerHand) == total(dealerHand)) {
                                        System.out.println("You tie! You and dealer have the same total of " + total(playerHand) + "!");
                                        reset = true;
                                        break;
                                    }
                                }
                                if (bust(total(dealerHand))) {
                                    System.out.println("Dealer busts with a " + total(dealerHand) + ". You win!");
                                    reset = true;
                                    break;
                                }
                            }
                        }


                    }
                }
            }
        }





    }
    public static int returnCard(int decksize) {
        Random rng = new Random();
        if (decksize <= 1) {
            List<Integer> deck = new newDeck().newDeck();
            List<String> names = new newDeck().name();
        }
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
                for (int i = 0; i < hand.size(); i ++) {
                    if (hand.get(i) == 11) {
                        hand.remove(i);
                        hand.add(1);
                        break;
                    }
                }

            }
            }
        return hand;
    }
    }