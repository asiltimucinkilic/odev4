// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Intake;

public class IntakingCommand extends Command {
  /** Creates a new IntakeCommand. */
  Intake m_intake;
  double m_speed_intake;

  Feeder m_feeder;
  double m_speed_feeder;

  public IntakingCommand(Intake intake, double speed_intake, Feeder feeder, double speed_feeder) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.m_intake = intake;
    this.m_speed_intake = speed_intake;
    this.m_feeder = feeder;
    this.m_speed_feeder = speed_feeder;
    addRequirements(m_intake, m_feeder);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_intake.getIntakeSensor()) {
      m_intake.setIntake(0);
    } 
    else if (m_feeder.getFeederSensor()) {
      m_feeder.setFeeder(0);
     }
    
    else {
      m_intake.setIntake(m_speed_intake);
      m_feeder.setFeeder(m_speed_feeder);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
