// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
// Main Robot class
public class Robot extends TimedRobot { // Main Robot class extending TimedRobot
  private Command m_autonomousCommand; // Autonomous command variable

  private final RobotContainer m_robotContainer; // RobotContainer instance

  public Robot() // Robot constructor
  {
    m_robotContainer = new RobotContainer(); // Initialize RobotContainer
  }

  @Override
  public void robotPeriodic() // Robot periodic method
  {
    CommandScheduler.getInstance().run(); // Run the CommandScheduler
  }

  @Override
  public void disabledInit() // Disabled initialization method
  {
    // Disabled-specific initialization code can go here
  }

  @Override
  public void disabledPeriodic() // Disabled periodic method
  {
    // Disabled-specific periodic code can go here
  }

  @Override
  public void disabledExit() // Disabled exit method
  {
    // Disabled-specific exit code can go here
  }

  @Override
  public void autonomousInit() // Autonomous initialization method
  {
    m_autonomousCommand = m_robotContainer.getAutonomousCommand(); // Get the autonomous command

    if (m_autonomousCommand != null) // If autonomous command is not null
    {
      m_autonomousCommand.schedule(); // Schedule the autonomous command
    }
  }

  @Override
  public void autonomousPeriodic() // Autonomous periodic method
  {
    // Autonomous-specific periodic code can go here
  }

  @Override
  public void autonomousExit() // Autonomous exit method
  {
    // Autonomous-specific exit code can go here
  }

  @Override
  public void teleopInit() // Teleop initialization method
  {
    if (m_autonomousCommand != null) // If autonomous command is not null
    {
      m_autonomousCommand.cancel(); // Cancel the autonomous command
    }
  }

  @Override
  public void teleopPeriodic() // Teleop periodic method
  {
    // Teleop-specific periodic code can go here
  }

  @Override
  public void teleopExit() // Teleop exit method
  {
    // Teleop-specific exit code can go here
  }

  @Override
  public void testInit() // Test initialization method
  {
    CommandScheduler.getInstance().cancelAll(); // Cancel all commands
  }

  @Override
  public void testPeriodic() // Test periodic method
  {
    // Test-specific periodic code can go here
  }

  @Override
  public void testExit() // Test exit method
  {
    // Test-specific exit code can go here
  }

  @Override
  public void simulationPeriodic() // Simulation periodic method
  {
    // Simulation-specific periodic code can go here
  }
}
