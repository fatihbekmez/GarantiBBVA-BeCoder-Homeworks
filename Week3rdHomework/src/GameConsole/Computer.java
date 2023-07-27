package GameConsole;

import GameControllers.GameController;
import GameControllers.PsController;

public class Computer{

    String name;
    boolean open;

    public boolean isOpen(){
        return open;
    }

    public void open() throws Exception{

        if (open==true) {
            throw new RuntimeException ("PC already open");
        } else {
            System.out.println("PC is opening");
            this.open=true;
        }
    }

    public void shutdown() throws Exception{

        if(open == false){
            throw new RuntimeException("PC already close");
        } else{
            System.out.println("PC is shutting down! ");
            this.open=false;
        }
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
