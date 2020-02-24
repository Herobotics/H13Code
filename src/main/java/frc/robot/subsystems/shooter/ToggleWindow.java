package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ToggleWindow extends CommandBase {

    public void initialize() {
        Shooter.getInstance().setWindow(!Shooter.getInstance().getWindow());
    }
    
    public boolean isFinished() {
        return true;
    }
}