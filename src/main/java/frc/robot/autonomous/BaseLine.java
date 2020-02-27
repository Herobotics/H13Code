package frc.robot.autonomous;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.chassis.DriveTime;

public class BaseLine extends CommandBase {

    public BaseLine() {
        addSequential(new DriveTime(AutoDistances.BaseLine.DRIVE_TIME));
    }
}