public class Pile {
    private Card top, bottom;

    public Card getTop() {
        return top;
    }

    public Card getBottom() {
        return bottom;
    }

    public void setTop(Card card) {
        this.top = card;
    }

    public void setBottom(Card card) {
        this.bottom = card;
    }

    public void add(Card card) {
        if (top == null) {
            top = card;
        }
        bottom = card;
    }

    public void printPile() {
        String sTop = "None", sBottom = "None";
        if (top != null) {
            sTop = top.toString();
            sBottom = bottom.toString();
        }
        System.out.println(String.format("\tTop: " + sTop + "\n\tBottom: " + sBottom));
    }
}
