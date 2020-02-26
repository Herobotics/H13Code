package frc.robot.subsystems.carriage;

import edu.wpi.first.wpilibj.Relay.Direction;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Ports;

public class Carriage extends SubsystemBase {

  // This variable and function are for managing and accessing the chasses anywhere in the code
  private static Carriage instance;
  public static Carriage getInstance(){
    if(instance == null){
      instance = new Carriage();
    }
    return instance;
  }

  // All actuators on the intake
  Relay motor;
  // Creates a new Intake. This method should only be called once
  private Carriage(){
    // Set up the actuators
    motor = new Relay(Ports.carriage_motor);
  }
  
  public void carriageSpeed(double speed){
    motor.setDirection(Direction.kForward);
    motor.set(Value(speed)); 
  }

  private Value Value(double speed) {
    return null;
  }

}
