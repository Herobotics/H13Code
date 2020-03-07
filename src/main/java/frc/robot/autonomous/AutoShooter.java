package frc.robot.autonomous;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;
import frc.robot.subsystems.chassis.DriveTime;
import frc.robot.Ports;
import frc.robot.subsystems.carriage.CarriageStart;
import frc.robot.subsystems.shooter.Shooter;

public abstract class AutoShooter extends CommandGroupBase {

    VictorSP lmotor;
    VictorSP rmotor;

    Relay carriage;
    private void autoShooterSpeed() {
        lmotor = new VictorSP(Ports.shooter_motor_1);
        rmotor = new VictorSP(Ports.shooter_motor_2);
        carriage = new Relay(Ports.carriage_motor);
    }
    
    public void initialize(){
        lmotor.set(1);
        rmotor.set(-1);
        carriage.set(Relay.Value.kForward);
    }

	@Override
	public void addCommands(Command... commands) {
	// TODO Auto-generated method stub
		
	}
}
