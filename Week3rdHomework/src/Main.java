import GameControllers.*;
import GameConsole.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Playstation ps = new Playstation();
        PsController dualshock = new PsController();
        ps.open();
        ps.addController(dualshock);
        ps.playGame();
        ps.shutdown();

        Xbox seriesS = new Xbox();
        XboxController xboxCont = new XboxController();
        seriesS.open();
        seriesS.addController(xboxCont);
        seriesS.playGame();
        seriesS.shutdown();

    }

}