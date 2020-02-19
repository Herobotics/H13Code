package frc.robot.subsystems.intake;

import frc.robot.Ports;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {

    private static Intake instance;

    public static Intake getInstance() {
        if (instance == null) {
            instance = new Intake();
        }
        return instance;
    }

    Talon motor;
    Solenoid solenoid;
    //creates a new motor and solenoid, and returns the instance of the intake
    private Intake(){
        motor = new Talon(Ports.ball_intake_axle);
        solenoid = new Solenoid(Ports.ball_intake_solenoid);
    }
	public boolean getExtention() {
		return false;
	}
	public void setExtention(boolean b) {
	}
}