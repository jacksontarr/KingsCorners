package JavaFiles;
import java.util.Scanner;

public class Driver {
    static Scanner kb = new Scanner(System.in);
    static Deck deck = new Deck();
    static Hand hand1 = new Hand();
    static Hand hand2 = new Hand();
    static Pile side1 = new Pile();
    static Pile side2 = new Pile();
    static Pile side3 = new Pile();
    static Pile side4 = new Pile();
    static Pile corner1 = new Pile();
    static Pile corner2 = new Pile();
    static Pile corner3 = new Pile();
    static Pile corner4 = new Pile();

    public static void main(String[] args) {
        startGame();
        do {
            startTurn(hand1);
            startTurn(hand2);
        } while (hand1.getSize() > 0 && hand2.getSize() > 0);
        if (hand1.getSize() == 0) {
            System.out.println("Player 1 wins!");
        }
        else {
            System.out.println("Player 2 wins!");
        }
    }

    public static void startGame() {
        for (int i = 1; i <= 7; i++) {
            hand1.add(deck.remove());
            hand2.add(deck.remove());
        }
        side1.add(deck.remove());
        side2.add(deck.remove());
        side3.add(deck.remove());
        side4.add(deck.remove());
    }

    public static void printPiles() {
        System.out.println("1. Side 1");
        side1.printPile();
        System.out.println("2. Side 2");
        side2.printPile();
        System.out.println("3. Side 3");
        side3.printPile();
        System.out.println("4. Side 4");
        side4.printPile();
        System.out.println("5. Corner 1");
        corner1.printPile();
        System.out.println("6. Corner 2");
        corner2.printPile();
        System.out.println("7. Corner 3");
        corner3.printPile();
        System.out.println("8. Corner 4");
        corner4.printPile();
    }

    public static void startTurn(Hand hand) {
        hand.add(deck.remove());
        hand.add(deck.remove());
        makeTurn(hand);
    }

    public static void makeTurn(Hand hand) {
        int i;
        do {
            hand.printHand();
            printPiles();
            System.out.println("0. End turn\n1. Play card\n2. Move pile");
            i = kb.nextInt();
            if (i == 1) {
                playCard(hand);
            }
            if (i == 2) {
                movePile();
            }
        } while (i != 0);
    }

    public static void playCard(Hand hand) {
        int cardChosen, pile;
        hand.printHand();
        cardChosen = Input.readNum("Which card do you want to play?", 1, hand.getSize());
        Card moved = hand.getCard(cardChosen-1);
        printPiles();
        pile = Input.readNum("Which pile do you want to add it to?", 1, 8);
        Pile onto = choosePile(pile);

        if (pile >= 5) {
            if (moved.getValue() == 13) {
                if (onto.getBottom() != null) {
                    System.out.println("Illegal move");
                }
                else {
                    onto.add(moved);
                    hand.remove(cardChosen-1);
                }
            }
            else {
                if (onto.getBottom() == null) {
                    System.out.println("Illegal move");
                }
                else {
                    if (isLegal(moved, onto.getBottom())) {
                        onto.add(moved);
                        hand.remove(cardChosen-1);
                    }
                    else{
                        System.out.println("Illegal move");
                    }
                }
            }
        }
        else {
            if (isLegal(moved, onto.getBottom())) {
                onto.add(moved);
                hand.remove(cardChosen-1);
            }
            else{
                System.out.println("Illegal move");
            }
        }
    }

    public static void movePile() {
        int moved, onto;
        Pile pMoved, pOnto;
        Card cMoved;
        printPiles();
        moved = Input.readNum("Which pile would you like to move?", 1, 8);
        onto = Input.readNum("Which pile would you like to move it onto?", 1, 8);

        pMoved = choosePile(moved);
        pOnto = choosePile(onto);
        cMoved = pMoved.getTop();

        if (onto >= 5) {
            if (cMoved.getValue() == 13) {
                if (pOnto.getBottom() != null) {
                    System.out.println("Illegal move");
                }
                else {
                    pOnto.add(pMoved.getBottom());
                    pMoved.clear();
                }
            }
            else {
                if (pOnto.getBottom() == null) {
                    System.out.println("Illegal move");
                }
                else {
                    if (isLegal(cMoved, pOnto.getBottom())) {
                        pOnto.add(pMoved.getBottom());
                        pMoved.clear();
                    }
                    else{
                        System.out.println("Illegal move");
                    }
                }
            }
        }
        else {
            if (isLegal(cMoved, pOnto.getBottom())) {
                pOnto.add(pMoved.getBottom());
                pMoved.clear();
            }
            else{
                System.out.println("Illegal move");
            }
        }
    }

    public static Pile choosePile(int i) {
        switch (i) {
            case 1:
                return side1;
            case 2:
                return side2;
            case 3:
                return side3;
            case 4:
                return side4;
            case 5:
                return corner1;
            case 6:
                return corner2;
            case 7:
                return corner3;
            case 8:
                return corner4;
            default:
                return side1;
        }
    }

    public static boolean isLegal(Card moved, Card onto) {
        if (onto == null) {
            return true;
        }
        else if (moved == null) {
            return false;
        }
        return (Math.abs(moved.getSuit() - onto.getSuit()) > 1) && (onto.getValue() - moved.getValue() == 1);
    }
}