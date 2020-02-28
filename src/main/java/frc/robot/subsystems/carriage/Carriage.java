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
  Relay motor;
  private Carriage(){
    // Set up the actuators
    motor = new Relay(Ports.carriage_motor);
  }

  public void carriageStart() {
    motor.set(Relay.Value.kForward);
  }
  
  public void carriageStop() {
    motor.set(Relay.Value.kOff);
  }
}