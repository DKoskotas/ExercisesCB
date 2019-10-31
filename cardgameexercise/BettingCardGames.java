
package cardgameexercise;


public class BettingCardGames extends CardGame{

    public BettingCardGames() {
        
    }
    
    public void shuffle(){
        System.out.println("Shuffle Cards");
    }

    @Override
    public void deal() {
        System.out.println("Deal to the gamblers");
    }

    @Override
    public void displayRules() {
        System.out.println("Display rules to the gamblers");
    }

    @Override
    public void keepScore() {
        System.out.println("Keep score of the gamblers");
    }
}
