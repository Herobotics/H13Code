package frc.robot.subsystems.carriage;

import edu.wpi.first.wpilibj.VictorSP;
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
  VictorSP motor;

  // Creates a new Intake. This method should only be called once
  private Carriage(){
    // Set up the actuators
    motor = new VictorSP(Ports.carriage_motor);
  }

  void setSpeed(double speed){
    motor.set(speed);
  }
}
