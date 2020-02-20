package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.intake.togglesolenoid;
import frc.robot.subsystems.intake.axle;

public class Controller{

    public static final int port_pilot_controller = 0;
    public static final int port_copilot_controller = 1;

    private static Controller instance;
    public static Controller getInstance(){
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }

    //creates pilot and copilot ports

    public Controller() {
        final Joystick pilot = new Joystick(port_pilot_controller);
        final Joystick coPilot = new Joystick(port_copilot_controller);

        new JoystickButton(pilot, GamePad.Button.A).whenPressed(new togglesolenoid());
        new JoystickButton(pilot, GamePad.Button.B).whenPressed(new shooter(1.0));
        new JoystickButton(pilot, GamePad.Button.B).whenReleased(new shooter(0));
    }

    public static double get_Triggers() {
        final double value = pilot.getRawAxis(2) - pilot.getRawAxis(3);
        SmartDashboard.putNumber("axle speed",value);
        return value;
    }

    //gives triggers and buttons functions

    private void DriverController() {
        driver = new Joystick(0);
    }

    public double getForward() {
        return driver.getRawAxis(1);
    }

    public double getTurn() {
        return driver.getRawAxis(0);
    }
    //driving
}
