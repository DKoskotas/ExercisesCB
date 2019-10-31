
package cardgameexercise;


public abstract class CardGame {

    public CardGame() {
        
    }
    
    public void shuffle(){
        System.out.println("Shuffle Cards");
    }
    
   public abstract void  deal();
   
   public abstract void  displayRules();
   
   public abstract void keepScore();
}
