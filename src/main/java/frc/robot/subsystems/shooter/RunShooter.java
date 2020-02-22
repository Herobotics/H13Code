package frc.robot.subsystems.carriage;

import edu.wpi.first.wpilibj2.command.Command;

public class RunShooter {

	double speed;
	
    public RunShooter (double speed) {
        Shooter.getInstance();
        this.speed = speed;
    }

    protected void initialize() {
    	Carriage.getInstance().RunShooter(speed);
    }

    protected boolean isFinished() {
        return true;
    }
}