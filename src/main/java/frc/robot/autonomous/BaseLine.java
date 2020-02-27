package frc.robot.autonomous;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.chassis.DriveDist;

public class BaseLine extends CommandBase {

    public BaseLine() {

        addSequential(new DriveDist(AutoDistances.BaseLine.DISTANCE, AutoDistances.BaseLine.TIME_OUT));
    }
}