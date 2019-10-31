
package cardgameexercise;


public class FourPlayerCardGames extends CardGame{

    public FourPlayerCardGames() {
        
    }
    
    public void shuffle(){
        System.out.println("Shuffle Cards");
    }

    @Override
    public void deal() {
        System.out.println("Deal for 4 players");
    }

    @Override
    public void displayRules() {
        System.out.println("Display rules for 4 players");
    }

    @Override
    public void keepScore() {
        System.out.println("Keep score for 4 players");
    }
}
