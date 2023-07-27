package GameConsole;

import GameControllers.XboxController;

public class Xbox {

    String name;
    boolean open;

    public boolean isOpen(){
        return open;
    }

    public void open() throws Exception{

        if (open==true) {
            throw new Exception ("Xbox already open");
        } else {
            System.out.println("Xbox is opening");
            this.open=true;
        }
    }

    public void shutdown() throws Exception{

        if(open == false){
            throw new Exception("Xbox already close");
        } else{
            System.out.println("Xbox is shutting down! ");
            this.open=false;
        }
    }

    public void addController(XboxController GameControllers){
        System.out.println("Xbox Controller added");
    }

    public void playGame() throws Exception{
        if(open==false){
            throw new Exception("The device must be turned on to play the game !");
        } else{
            System.out.println("Game started");
            this.open=false;
        }
    }
}


