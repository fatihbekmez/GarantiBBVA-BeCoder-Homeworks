package GameConsole;

import GameControllers.GameController;
import GameControllers.PsController;

public class Playstation {

    String name;
    boolean open;

    public boolean isOpen(){
        return open;
    }

    public void open() throws Exception{

        if (open==true) {
            throw new Exception ("PS already open");
        } else {
            System.out.println("PS is opening");
            this.open=true;
        }
    }

    public void shutdown() throws Exception{

        if(open == false){
            throw new RuntimeException("PS already close");
        } else{
            System.out.println("PS is shutting down! ");
            this.open=false;
        }
    }

    public void addController(PsController GameControllers){
        System.out.println("Dualshock added");
    }

    public void playGame() throws Exception{
        if(open==false){
            throw new RuntimeException("The device must be turned on to play the game !");
        } else{
            System.out.println("Game started");
            this.open=false;
        }
    }
}