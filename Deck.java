/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;
public class Deck
{
    ArrayList<Card> deck = new ArrayList<Card>();
    ArrayList<Card> tempDeck = new ArrayList<Card>();
    Card temp;
    public Deck () {
        deck = new ArrayList<Card>();

        
    }
    
    public Card deal() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(52);
        Card temp = deck.get(randomInt);
        deck.remove(randomInt);
        return temp;
    }
    
    public void shuffle() {
        tempDeck = new ArrayList<Card>();
        for (int i = 0; i < 52; i++) {
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(52);
            temp = deck.get(randomInt);
            tempDeck.add(temp);
        }
        deck = tempDeck;
    }
    
    public void initialize() {
        String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String [] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        for (String s : suits) {
            int value = 1 ;
            for (String r : ranks) {
                if (value > 10) {
                    value = 10;
                }
                Card card = new Card(value, s , r);
                deck.add(card);
                value++;
            }
        }
    }
    
    public void printDeck() {
        for(Card c: deck) {
            System.out.println(c);
        }
    }
}
