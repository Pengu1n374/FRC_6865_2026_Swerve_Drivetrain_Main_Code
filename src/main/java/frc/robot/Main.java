// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
// Dylan was here - 2023

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * DO NOT add any static variables to the class below, or any initialization at all. 
 * DO NOT modify this file except to change the parameter class to the startRobot call.
 */
public final class Main {
  private Main() {

  }

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * If you change your main robot class, you MUST change the parameter type! Otherwise, it won't run correctly.
   */
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);
  }
}
