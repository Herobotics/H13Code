package frc.robot.autonomous;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;
import frc.robot.subsystems.chassis.DriveTime;

public abstract class BaseLine extends CommandGroupBase {

    public BaseLine() {
        addSequential(new DriveTime(AutoDistances.BaseLine.DRIVE_TIME));
    }

	private void addSequential(DriveTime driveTime) {
	}

	@Override
	public void addCommands(Command... commands) {
	// TODO Auto-generated method stub
		
	}
}
