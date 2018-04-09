import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends Deck
{
    String name;
    double amount;
    ArrayList<Card> pdeck;
    int hand;
    public Player(String n, double a) {
        this.name = n;
        this.amount = a;
        pdeck = new ArrayList<Card>();
    }
    
    public void bet(double input) {
        if (amount < input) {
            System.out.println("You do not have enough funds for this.");
        }
        else {
            amount -= input;
        }
        
    }
    
    public Card hit(Card c) {
        pdeck.add(c);
        return c;
        
    }
        
    
    public void stay() {
        System.out.print("Your final total is ");
        
    }
    
    public Card addCard(Card c) {
        pdeck.add(c);
        return c;
        
    }
    
    public void updateWinnings() {
        
        
    }
    
    public void handTotal() {
        hand = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < pdeck.size(); i++) {
            Card temp = pdeck.get(i);
            if (temp.getRank().equals("Ace")) {
                System.out.println("\n Would you like the Ace to be an 11 or 1");
                int choice = scan.nextInt();
                temp.setNumber(choice);
            }
            hand += temp.getNumber();
        }
        System.out.println(hand);
    }
    
    
    public void printPdeck() {
        for(Card c: pdeck) {
            System.out.print(c);
        }
    }
}
