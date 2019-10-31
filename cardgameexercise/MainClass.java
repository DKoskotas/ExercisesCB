
package cardgameexercise;

import java.util.ArrayList;
import java.util.List;


public class MainClass {

    
    public static void main(String[] args) {
        
        TwoPlayerCardGames tp = new TwoPlayerCardGames();
        FourPlayerCardGames fp = new FourPlayerCardGames();
        BettingCardGames bp = new BettingCardGames();
        
        List<CardGame> cardGames = new ArrayList();
        cardGames.add(tp);
        cardGames.add(fp);
        cardGames.add(bp);
        
        for(CardGame g : cardGames){
            g.shuffle();
            g.deal();
            g.displayRules();
            g.keepScore();
            System.out.println("\nStart the game: ");
            System.out.println("__________________\n");
        }
    }
    
}
