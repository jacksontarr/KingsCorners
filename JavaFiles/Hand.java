package JavaFiles;
import java.util.Arrays;

public class Hand {
    private Card[] cards;
    private int size;

    public Hand() {
        this.cards = new Card[30];
        this.size = 0;
    }

    public void add(Card card) {
        int i = 0;
        while (cards[i] != null) {
            i++;
        }
        cards[i] = card;
        size++;
    }

    public Card remove(int i) {
        Card card = cards[i];
        while (cards[i] != null) {
            cards[i] = cards[i+1];
            i++;
        }
        size--;
        return card;
    }

    public void sort() {
        Card[] hand = new Card[size];
        for (int i = 0; i < size; i++) {
            hand[i] = cards[i];
        }
        Arrays.sort(hand);
        for (int i = 0; i < size; i++) {
            cards[i] = hand[i];
        }
    }

    public int getSize() {
        return size;
    }

    public Card getCard(int i) {
        return cards[i];
    }

    public void printHand() {
        int i = 0;
        System.out.println("Hand");
        sort();
        while (cards[i] != null) {
            System.out.println(String.format("\t%d. %s", i+1, cards[i]));
            i++;
        }
    }
}
