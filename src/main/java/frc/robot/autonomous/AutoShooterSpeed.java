package frc.robot.autonomous;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Ports;

public class AutoShooterSpeed {

    VictorSP lmotor;
    VictorSP rmotor;
    
    private void Auto() {
        lmotor = new VictorSP(Ports.shooter_motor_1);
        rmotor = new VictorSP(Ports.shooter_motor_2);
    
    }
    public void initialize(){
        lmotor.set(1);
        rmotor.set(-1);
    }

}
