import java.util.ArrayList;
import java.util.List;

public class newDeck {
    List<Integer> deck = new ArrayList<>();
    public List<Integer> newDeck() {
        for (int i = 0; i < 4; i ++) {
            deck.add(2);
        }
        for (int i = 0; i < 4; i ++) {
            deck.add(3);
        }
        for (int i = 0; i < 4; i ++) {
            deck.add(4);
        }
        for (int i = 0; i < 4; i ++) {
            deck.add(5);
        }
        for (int i = 0; i < 4; i ++) {
            deck.add(6);
        }
        for (int i = 0; i < 4; i ++) {
            deck.add(7);
        }
        for (int i = 0; i < 4; i ++) {
            deck.add(8);
        }
        for (int i = 0; i < 4; i ++) {
            deck.add(9);
        }
        for (int i = 0; i < 16; i ++) {
            deck.add(10);
        }
        for (int i = 0; i < 4; i ++) {
            deck.add(11);
        }
        return deck;
    }

    public List<String> name() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 4; i ++) {
            names.add("a Two");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("a Three");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("a Four");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("a Five");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("a Six");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("a Seven");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("an Eight");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("a Nine");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("a Ten");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("a Jack");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("a Queen");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("a King");
        }
        for (int i = 0; i < 4; i ++) {
            names.add("an Ace");
        }
        return names;
    }
}
