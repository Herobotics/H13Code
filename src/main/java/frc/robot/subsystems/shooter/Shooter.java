package frc.robot.subsystems.shooter;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.Solenoid;

import frc.robot.Ports;

public class Shooter extends SubsystemBase {

  // This variable and function are for managing and accessing the chasses
  // anywhere in the code
  private static Shooter instance;

  public static Shooter getInstance() {
    if (instance == null) {
      instance = new Shooter();
    }
    return instance;
  }

  // All actuators on the intake
  VictorSP lmotor;
  VictorSP rmotor;
  Solenoid windowsolenoid;

  // Creates a new Intake. This method should only be called once
  private Shooter() {
    // Set up the actuators
    lmotor = new VictorSP(Ports.shooter_motor_1);
    rmotor = new VictorSP(Ports.shooter_motor_2);
    windowsolenoid = new Solenoid(Ports.window_solenoid);
  }

  boolean getWindow() {
    return windowsolenoid.get();
  }

  void setWindow(boolean b) {
    windowsolenoid.set(b);
  }

  void setSpeed(double speed) {
    lmotor.set(speed);
    rmotor.set(-speed);
  }
}
