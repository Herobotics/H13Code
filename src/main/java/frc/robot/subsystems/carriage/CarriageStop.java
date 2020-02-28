package frc.robot.subsystems.carriage;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class CarriageStop extends CommandBase {
	
    public CarriageStop () {
        Carriage.getInstance();
    }

    public void initialize() {
        Carriage.getInstance().carriageStop();
    }

    public boolean isFinished() {
        return true;
    }
}