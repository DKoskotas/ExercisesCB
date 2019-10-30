
package w3d2exercises;


public class Stage {
    private Actor actor;
    
    public Stage(){
        this.actor = new HappyActor();
        System.out.println("Play Comedy");
    }
    
    public void changeActing(){
        this.actor = new SadActor();
        System.out.println("Play Tragedy");
    }
    
    public void actOnStage(){
        actor.acting();        
    }
}
