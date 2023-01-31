public class Card implements Comparable<Card>{
    private int suit, value;

    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String toString() {
        String sSuit = "", sValue;

        switch (suit) {
            case 1: sSuit = "Hearts";
                    break;
            case 2: sSuit = "Diamonds";
                    break;
            case 3: sSuit = "Spades";
                    break;
            case 4: sSuit = "Clubs";
                    break;
        }

        switch (value) {
            case 11:  sValue = "Jack";
                      break;
            case 12:  sValue = "Queen";
                      break;
            case 13:  sValue = "King";
                      break;
            case 1:  sValue = "Ace";
                      break;
            default:  sValue = String.valueOf(value);
                      break;
        }

        return String.format("%s of %s", sValue, sSuit);
    }

    @Override
    public int compareTo(Card o) {
        return this.value - o.value;
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
