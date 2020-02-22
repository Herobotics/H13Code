package frc.robot.subsystems.carriage;

import edu.wpi.first.wpilibj2.command.Command;

public class CarriageSpeed {

	double speed;
	
    public CarriageSpeed (double speed) {
        Carriage.getInstance();
        this.speed = speed;
    }

    protected void initialize() {
    	Carriage.getInstance().carriageSpeed(speed);
    }

    protected boolean isFinished() {
        return true;
    }
}