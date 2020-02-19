package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj.command.Command;

public class togglesolenoid extends Command {

    public togglesolenoid() {

    }

    protected void initialize() {
        System.out.println("Toggling Intake Solenoid");
        Intake.getInstance().setExtention(!Intake.getInstance().getExtention());
    }
    //when run, toggle solenoid and print line
    
    protected boolean isFinished() {
        return true;
    }
}