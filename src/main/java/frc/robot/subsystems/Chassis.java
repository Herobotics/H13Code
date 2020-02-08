package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Ports;

public class Chassis extends SubsystemBase {

  private static Chassis instance;
  public static Chassis getInstance(){
    if(instance == null){
      instance = new Chassis();
    }
    return instance;
  }

  VictorSP left1;
  VictorSP left2;

  VictorSP right1;
  VictorSP right2;

  /**
   * Creates a new Chassis.
   */
  private Chassis() {
    left1 = new VictorSP(Ports.chassis_left_1);
    left2 = new VictorSP(Ports.chassis_left_2);

    right1 = new VictorSP(Ports.chassis_right_1);
    right2 = new VictorSP(Ports.chassis_right_2);
  }

  public void tankDrive(double left, double right){
    System.out.println(left + " " + right);
    left1.set(left);
    left2.set(left);
    
    right1.set(-right);
    right2.set(-right);
  }

  public void arcadeDrive(double forward, double turn){
    double left;
    double right;

		double max = Math.max(Math.abs(forward), Math.abs(turn));
		double difference = forward - turn;
		double total = forward + turn;

		if (forward >= 0.0) {
			// First quadrant
			if (turn >= 0.0) {
				left = max;
				right = difference;
			}
			// Second quadrant
			else {
				left = total;
				right = max;
			}
		} else {
			// Fourth quadrant
			if (turn >= 0.0) {
				left = total;
				right = -max;
			}
			// Third quadrant
			else {
				left = -max;
				right = difference;
			}
		}

    this.tankDrive(left, right);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
