import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Ports;

public class shooter extends Subsystem {
    
    private Victor shooter;

    public static shooter instance;
	
	public static shooter getInstance()
    {
		if (instance == null)
		   instance = new shooter();
	
		return instance;
    }
    
    public shooter() {
        shooter = new Victor(Ports.ball_shooter);
	}  

    public double setSpeed(double speed){
        shooter.setSpeed(speed);
    }

    
}