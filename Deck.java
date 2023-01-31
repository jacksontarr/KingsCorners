import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    private Card[] cards;
    private int size;

    public Deck() {
        this.size = 52;
        this.cards = new Card[size];
        fill();
    }

    private void fill() {
        int k = 0;
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 2; j++) {
                cards[k] = new Card(j, i);
                k++;
            }
            for (int j = 4; j <= 5; j++) {
                cards[k] = new Card(j, i);
                k++;
            }
        }
        List<Card> lst = Arrays.asList(cards);
        Collections.shuffle(lst);
        lst.toArray(cards);
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public Card remove() {
        int i = size-1;
        Card card;
        while (cards[i] == null) {
            i--;
        }
        card = cards[i];
        cards[i] = null;
        return card;
    }
}
