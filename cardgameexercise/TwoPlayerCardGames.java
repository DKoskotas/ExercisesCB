
package cardgameexercise;


public class TwoPlayerCardGames extends CardGame{

    public TwoPlayerCardGames() {
        
    }
    
    public void shuffle(){
        System.out.println("Shuffle Cards");
    }

    @Override
    public void deal() {
        System.out.println("Deal for 2 players");
    }

    @Override
    public void displayRules() {
        System.out.println("Display rules for 2 players");
    }

    @Override
    public void keepScore() {
        System.out.println("Keep score for 2 players");
    }
}
