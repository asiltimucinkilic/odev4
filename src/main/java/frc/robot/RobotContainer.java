// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.IntakingCommand;
import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Intake;

public class RobotContainer {
  Intake intake = new Intake();
  Feeder feeder = new Feeder();
  PS5Controller mDrivController = new PS5Controller(0);

  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    new JoystickButton(mDrivController, 1).onTrue(new IntakingCommand(intake, 1, feeder, 0.7));
    new JoystickButton(mDrivController, 2).onTrue(new IntakingCommand(intake, -1, feeder, -0.7));
  }

  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
