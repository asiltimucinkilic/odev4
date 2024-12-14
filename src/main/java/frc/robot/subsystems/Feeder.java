// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.DigitalInput;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder extends SubsystemBase {
  /** Creates a new Feeder. */
  public TalonFX mFeederMotor;
  public DigitalInput mFeederSensor;
  
  

  public Feeder() {
    mFeederMotor = new TalonFX(2);
    mFeederSensor = new DigitalInput(0);
  }

  public void setFeeder(double speed) {
    mFeederMotor.set(speed);
  }
  public boolean getFeederSensor() {
    return mFeederSensor.get();
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
