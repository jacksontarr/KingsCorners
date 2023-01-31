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
        startTurn(hand1);
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
        System.out.println("Side 1");
        side1.printPile();
        System.out.println("Side 2");
        side2.printPile();
        System.out.println("Side 3");
        side3.printPile();
        System.out.println("Side 4");
        side4.printPile();
        System.out.println("Corner 1");
        corner1.printPile();
        System.out.println("Corner 2");
        corner2.printPile();
        System.out.println("Corner 3");
        corner3.printPile();
        System.out.println("Corner 4");
        corner4.printPile();
    }

    public static void startTurn(Hand hand) {
        hand.add(deck.remove());
        hand.add(deck.remove());
        hand.printHand();
        printPiles();
        makeTurn(hand);
    }

    public static void makeTurn(Hand hand) {
        int i;
        do {
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
        int card, pNum;
        String sPile, pType;
        System.out.println("Which card do you want to play?");
        hand.printHand();
        card = kb.nextInt();
        System.out.println("Which pile do you want to add it to?");
        printPiles();
        sPile = kb.nextLine();
        
        switch (card) {
            case 1: hand.remove(card-1);
                    
        }
    }

    public static void movePile() {

    }
}