/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
   private int number;
   private String suit;
   private String rank;
   public Card (int n, String s, String r) {
       this.number = n;
       this.suit = s;
       this.rank = r; 
   }
   
   public int getNumber() {
       return number;
       
   }
   
   public void setNumber(int n) {
       this.number = n;
       
   }
   
   public String getSuit() {
       return suit;
   }
   
   public String getRank() {
       return rank;
   }
   
   public String toString() {
       return "The " + rank + " of " + suit + "\n";
    }
   
   
}
