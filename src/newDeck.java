import java.util.ArrayList;
import java.util.List;

public class newDeck {
    List<Integer> deck = new ArrayList<>();
    public List<Integer> newDeck() {
        for (int i = 2; i < 11; i++) {
            deck.add(i);
        }
        for (int i = 2; i < 11; i++) {
            deck.add(i);
        }
        for (int i = 2; i < 11; i++) {
            deck.add(i);
        }
        for (int i = 2; i < 11; i++) {
            deck.add(i);
        }
        for (int i = 1; i < 12; i++) {
            deck.add(10);
        }
        for (int i = 1; i < 5; i++) {
            deck.add(11);
        }
        return deck;
    }

    public List<String> name() {
        List<String> names = new ArrayList<>();
        names.add("a Two");
        names.add("a Three");
        names.add("a Four");
        names.add("a Five");
        names.add("a Six");
        names.add("a Seven");
        names.add("an Eight");
        names.add("a Nine");
        names.add("a Ten");
        names.add("a Jack");
        names.add("a Queen");
        names.add("a King");
        names.add("an Ace");
        return names;
    }
}
