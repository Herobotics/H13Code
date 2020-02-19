import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Ports;
import frc.robot.driverstation.Controller;

public class axle extends Subsystem {

    private Victor intake_axle;

    public axle() {
		intake_axle = new Victor(Ports.ball_intake_axle);
	}
	
	public void setSpeed(double speed){
		intake_axle.set(speed);
	}
	
	protected void execute(){
		intake_axle.setSpeed(Controller.getInstance().get_Triggers());
	}
	
	//creates a new motor for the intake, sets the speed
	protected void initDefaultCommand() {
	}
}
