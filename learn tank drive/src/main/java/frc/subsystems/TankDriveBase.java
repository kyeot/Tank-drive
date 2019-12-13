/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Add your docs here.
 */
public class TankDriveBase extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public VictorSPX leftMotor;
  public VictorSPX rightMotor;
  public double leftSpeed;
  public double rightSpeed;
  

  public TankDriveBase(){
    leftMotor = new VictorSPX(1);
    rightMotor = new VictorSPX(0);
  }

  public void setLeftSpeed(double speed){
    leftMotor.set(ControlMode.PercentOutput, speed);
    leftSpeed = speed;
  }

  public void setRightSpeed(double speed){
    rightMotor.set(ControlMode.PercentOutput, speed);
    rightSpeed = speed;
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
