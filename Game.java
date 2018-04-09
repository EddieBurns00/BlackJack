import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    double pot;

    public Game()
    {
      
    }
    
    public void playGame(){
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        Player p = new Player(name, 1000);
        Player c = new Player("Computer", 0);
        System.out.println("How much would you like to bet?");
        double a = scan.nextInt();
        p.bet(a);
        Deck cards = new Deck();
        cards.initialize();
        cards.shuffle();
        p.hit(cards.deal());
        p.hit(cards.deal());
        c.hit(cards.deal());
        c.hit(cards.deal());
        System.out.println("You have: ");
        p.printPdeck();
        System.out.print("Which is equal to ");
        p.handTotal();
        System.out.print("The dealer's hand is equal to ");
        c.handTotal();
        System.out.println("What would you like to do?");
        String play = scan.next();
        if (play.equals("hit") || play.equals("Hit")) {
            p.hit(cards.deal());
            System.out.println("You now have ");
            p.printPdeck();
            System.out.print("Which is equal to ");
            p.handTotal();
            if (p.hand < 21) {
                System.out.println("What would you like to do?");     
                String play2 = scan.next();
                if (play2.equals("hit") || play2.equals("Hit")) {
                    p.hit(cards.deal());
                    System.out.println("You now have ");
                    p.printPdeck();
                    System.out.print("Which is equal to ");
                    p.handTotal();
                    if (p.hand < 21) {
                            System.out.println("What would you like to do?");
                
                    }
                    if (p.hand == 21) {
                            System.out.println("Blackjack!");

                    }
                    if (p.hand > 21) {
                            System.out.println("Bust!");

                    }

                }
                if (play2.equals("stay") || play2.equals("Stay")) {
                    p.stay();
                    p.handTotal();
                }
            }
            if (p.hand == 21) {
                System.out.println("Blackjack!");

            }
            if (p.hand > 21) {
                System.out.println("Bust!");

            }

        }
        if (play.equals("stay") || play.equals("Stay")) {
            p.stay();
            p.handTotal();
        }
        while (c.hand < 18) {
            c.hit(cards.deal());
            
        } 
        if (c.hand <=18) {
            c.stay();
        }
        System.out.print("The dealer's hand is equal to ");
        c.handTotal();
        if (p.hand > c.hand && p.hand < 21) {
            System.out.println("You win");
            pot+=p.amount;
            pot+=p.amount;
        }
        if (p.hand > 21) {
            System.out.println("You Lose");
        }
        if (p.hand == c.hand) {
            System.out.println("You Tie");
            pot+=p.amount;            
        }
        System.out.println("Your balance is now" + p.amount );
        System.out.println("What would you like to keep playing?");     
        String choice = scan.next();
        if (choice.equals("Yes") || choice.equals("yes")) {
            playGame();            
        }
        else {
            endGame();
        }
    }
        
    
    public void determineWinner() {

    }
    
    public void endGame() {
       System.exit(1); 
        
        
    }

}
