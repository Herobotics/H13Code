package frc.robot.subsystems.carriage;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class CarriageSpeed extends CommandBase {

	double speed;
	
    public CarriageSpeed (double speed) {
        Carriage.getInstance();
        this.speed = speed;
    }

    public void initialize() {
    	Carriage.getInstance().carriageSpeed(speed);
    }

    public boolean isFinished() {
        return true;
    }
}