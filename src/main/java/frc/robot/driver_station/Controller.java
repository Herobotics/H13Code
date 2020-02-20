package frc.robot.driver_station;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.intake.ToggleIntake;

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
        new JoystickButton(driver, GamePad.Button.A).whenPressed(new ToggleIntake());
        new JoystickButton(driver, GamePad.Button.B).whenPressed(null /* TODO: make command */);
        new JoystickButton(driver, GamePad.Button.B).whenReleased(null /* TODO: make command */);
    }

    // Get the speed we want the ball intake to move at
    public double getIntakeAxle(){
        return driver.getRawAxis(GamePad.Axis.LT) - driver.getRawAxis(GamePad.Axis.RT);
    }

    // Get our forward value for the chassis
    public double getForward(){
        return driver.getRawAxis(GamePad.Axis.LEFT_Y);
    }

    // Get our turn value for the chassis
    public double getTurn(){
        return driver.getRawAxis(GamePad.Axis.LEFT_X);
    }
}