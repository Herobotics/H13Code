package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.Command;

public class RunShooter {

	double speed;
	
    public RunShooter (double speed) {
        Shooter.getInstance();
        this.speed = speed;
    }

    protected void initialize() {
    	Shooter.getInstance().runShooter(speed);
    }

    protected boolean isFinished() {
        return true;
    }
}