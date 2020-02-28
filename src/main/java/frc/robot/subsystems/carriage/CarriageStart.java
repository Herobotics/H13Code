package frc.robot.subsystems.carriage;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class CarriageStart extends CommandBase {
	
    public CarriageStart () {
        Carriage.getInstance();
    }

    public void initialize() {
        Carriage.getInstance().carriageStart();
    }

    public boolean isFinished() {
        return true;
    }
}