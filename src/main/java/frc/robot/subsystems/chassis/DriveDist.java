package frc.robot.subsystems.chassis;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj.controller.ProfiledPIDController;


public class DriveDist extends PIDCommand {

	public DriveDist(PIDController controller, DoubleSupplier measurementSource, double setpoint,
			DoubleConsumer useOutput, Subsystem[] requirements) {
		super(controller, measurementSource, setpoint, useOutput, requirements);
		//TODO Auto-generated constructor stub
	}

	private final static double P = 1.0;
    private final static double I = 0.0;
    private final static double D = 0.1;

    private final static double sP = -0.1;

    private double distance;
    private double timeout;

    public void DriveDistance(double distance, double timeout) {
	    Chassis.getInstance();

		withTimeout(timeout);

		this.distance = distance;
	}

    public void initialize() {
		// Make sure everything is 0 ed properly
		System.out.println("Driving to: " + distance);
		getPIDController().setSetpoint(distance);
	}

	private PIDSubsystem getPIDController() {
        return null;
    }

	protected double returnPIDInput() {
		return Chassis.getInstance().getAverageDistance();
	}

	protected void usePIDOutput(double output) {
		Chassis.getInstance().arcadeDrive(output, Chassis.getInstance().getRotation() * sP, false);
	}

    protected void end() {

	}

	protected void interrupted() {
		end();
	}

	protected void useOutput(double output, double setpoint) {
		// TODO Auto-generated method stub

	}

	protected double getMeasurement() {
		// TODO Auto-generated method stub
		return 0;
	}
}
