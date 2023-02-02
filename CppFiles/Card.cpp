using namespace std;
#include <string>
#include <iostream>

class Card {
    private:
        int suit, value;
        friend std::ostream& operator<<(std::ostream &strm, const Card &c);

    public:
        Card(int s, int v) : suit(s), value(v) {};
};

std::ostream& operator<<(std::ostream &strm, const Card &card) {
    string sSuit, sValue;

    switch (card.suit) {
            case 1: 
                sSuit = "Hearts";
                break;
            case 2:
                sSuit = "Diamonds";
                break;
            case 4: 
                sSuit = "Spades";
                break;
            case 5: 
                sSuit = "Clubs";
                break;
    }

    switch (card.value) {
        case 11:  
            sValue = "Jack";
            break;
        case 12:  
            sValue = "Queen";
            break;
        case 13:  
            sValue = "King";
            break;
        case 1:     
            sValue = "Ace";
            break;
        default:
            sValue = std::to_string(card.value);
            break;
    }
    
    strm << sValue << " of " << sSuit;
    return strm;
}

int main() {
    Card c(1, 4);
    cout << c;
}