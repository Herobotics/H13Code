package frc.robot.driver_station;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.intake.IntakeAxle;
import frc.robot.subsystems.intake.ToggleIntake;
import frc.robot.subsystems.carriage.Carriage;
import frc.robot.subsystems.carriage.CarriageStart;
import frc.robot.subsystems.carriage.CarriageStop;
import frc.robot.subsystems.chassis.InvertDrive;
import frc.robot.subsystems.shooter.ToggleWindow;

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
        new JoystickButton(driver, GamePad.Button.RB).whenPressed(new IntakeAxle(1));
        new JoystickButton(driver, GamePad.Button.RB).whenReleased(new IntakeAxle(0));
        new JoystickButton(driver, GamePad.Button.B).whenPressed(new CarriageStart());
        new JoystickButton(driver, GamePad.Button.B).whenReleased(new CarriageStop());
        new JoystickButton(driver, GamePad.Button.LB).whenPressed(new IntakeAxle(-1));
        new JoystickButton(driver, GamePad.Button.LB).whenReleased(new IntakeAxle(0));
        new JoystickButton(driver, GamePad.Button.START).whenPressed(new InvertDrive());

    }

    // Get the speed we want the ball intake to move at
    public double getShooter(){
        return driver.getRawAxis(GamePad.Axis.RT) - driver.getRawAxis(GamePad.Axis.LT);
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