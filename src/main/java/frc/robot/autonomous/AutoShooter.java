package frc.robot.autonomous;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;
import frc.robot.subsystems.chassis.DriveTime;
import frc.robot.Ports;
import frc.robot.subsystems.carriage.CarriageStart;
import frc.robot.subsystems.shooter.Shooter;

public abstract class AutoShooter extends CommandGroupBase {

    public AutoShooter() {
        addSequential(new DriveTime(AutoDistances.BaseLine.DRIVE_TIME));
        addSequential(new CarriageStart());
        addSequential(new AutoShooterSpeed());
    }

	private void addSequential(AutoShooterSpeed autoShooterSpeed) {
    }

    private void addSequential(CarriageStart carriageStart) {
    }

    private void addSequential(DriveTime driveTime) {
	}

	@Override
	public void addCommands(Command... commands) {
	// TODO Auto-generated method stub
		
	}
}
