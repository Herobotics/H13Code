package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Ports;

public class Shooter extends SubsystemBase {

  // This variable and function are for managing and accessing the chasses anywhere in the code
  private static Shooter instance;
  public static Shooter getInstance(){
    if(instance == null){
      instance = new Shooter();
    }
    return instance;
  }

  // All actuators on the intake
  VictorSP motor;

  // Creates a new Intake. This method should only be called once
  private Shooter() {
    // Set up the actuators
    motor = new VictorSP(Ports.shooter_motor);

    // Set teleop as the default command
    this.setDefaultCommand(new Teleop());
  }

  void setSpeed(double speed){
    motor.set(speed);
  }
}
