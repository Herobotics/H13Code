package frc.robot.subsystems.chassis;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Ports;

public class Chassis extends SubsystemBase {

  // This variable and function are for managing and accessing the chasses anywhere in the code
  private static Chassis instance;
  public static Chassis getInstance(){
    if(instance == null){
      instance = new Chassis();
    }
    return instance;
  }

  // All motors on the chassis
  VictorSP left1;
  VictorSP left2;

  VictorSP right1;
  VictorSP right2;

  // Creates a new Chassis. This method should only be called once
  private Chassis() {
    // Set up the motors
    left1 = new VictorSP(Ports.chassis_left_1);
    left2 = new VictorSP(Ports.chassis_left_2);

    right1 = new VictorSP(Ports.chassis_right_1);
    right2 = new VictorSP(Ports.chassis_right_2);

    // Set teleop as the default command
    this.setDefaultCommand(new Teleop());
  }

  // Control the chassis with tank drive with this function
  void tankDrive(double left, double right){
    System.out.println(left + " " + right);
    left1.set(left);
    left2.set(left);
    
    right1.set(-right);
    right2.set(-right);
  }

  // Control the chassis with arcade drive with this function
  void arcadeDrive(double forward, double turn){
    arcadeDrive(forward, turn, true);
  }

  // Arcade drive with optinal squared inputs
  void arcadeDrive(double forward, double turn, boolean square){

		// square inputs preserving sign
		if (square) {
			forward = forward * forward * (forward / Math.abs(forward));
			turn = turn * turn * (turn / Math.abs(turn));
		}

		double max = Math.max(Math.abs(forward), Math.abs(turn));
		double difference = forward - turn;
		double total = forward + turn;

    double left;
    double right;
    
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
}
