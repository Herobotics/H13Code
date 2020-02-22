package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class RunShooter extends CommandBase {

	double speed;
	
    public RunShooter (double speed) {
        Shooter.getInstance();
        this.speed = speed;
    }

    public void initialize() {
    	Shooter.getInstance().runShooter(speed);
    }

    public boolean isFinished() {
        return true;
    }
}