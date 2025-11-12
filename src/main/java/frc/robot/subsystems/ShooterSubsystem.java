// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
// This is the ShooterSubsystem which will opperate the Shooting Mechanism of the Robot

package frc.robot.subsystems;
// All the imports are between Line 8-10
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.cameraserver.*;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  public ShooterSubsystem() {
    // State what should happen in the ShooterSubsystem.
  }

  /**
   * ShooterCommand factory method.
   *
   * @return a command
   */
  public Command ShooterMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* The One-time action goes here */
        });
  }

  /**
   * Below is a Shooter method querying a boolean state of the subsystem (for example, a digital sensor to recognize what is in front of the Shooter).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean ShooterCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called the "ONCE PER SCHEDULER RUN" Method
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called the "ONCE PER SCHEDULER RUN DURING SIMULATION" Method
  }
}
