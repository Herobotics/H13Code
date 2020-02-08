package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Controller {
    
    private static Controller instance;
    public static Controller getInstance(){
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }

	private Joystick driver;

    private Controller(){
        driver = new Joystick(0);
    }

    public double getForward(){
        return driver.getRawAxis(1);
    }

    public double getTurn(){
        return driver.getRawAxis(0);
    }
}