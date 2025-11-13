// RobotContainer.java is where everything is defined and configured

package frc.robot;

// All imports will be between Lines 6-69
import static edu.wpi.first.units.Units.*;

import frc.robot.subsystems.*;
import frc.robot.commands.ShooterAuto;
import frc.robot.commands.ShooterCommand;
import frc.robot.commands.IntakeAuto;
import frc.robot.commands.IntakeCommand;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.ShooterParameters;
import frc.robot.subsystems.IntakeParameters;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.CommandSwerveDrivetrain;
import frc.robot.generated.TunerConstants.OperatorConstants;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.apriltag.*;
import edu.wpi.first.apriltag.jni.*;
import edu.wpi.first.units.Units;
import edu.wpi.first.math.*;
import edu.wpi.first.math.geometry.*;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.*;
import edu.wpi.first.math.util.*;
import edu.wpi.first.math.jni.*;
import com.ctre.phoenix6.configs.*;
import com.ctre.phoenix6.configs.jni.*;
import com.ctre.phoenix6.swerve.*;
import com.ctre.phoenix6.Orchestra;
import com.ctre.phoenix6.swerve.jni.*;
import com.ctre.phoenix6.wpiutils.*;
import com.ctre.phoenix6.hardware.jni.*;
import edu.wpi.first.units.*;
import edu.wpi.first.units.Units.*;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.sysid.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.simulation.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;
import edu.wpi.first.wpilibj.motorcontrol.*;
import com.ctre.phoenix.*;
import com.ctre.phoenix.time.StopWatch;
import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motion.*;
import com.ctre.phoenix.time.*;
import com.pathplanner.lib.*;
import com.pathplanner.lib.commands.*;
import com.pathplanner.lib.auto.*;
import com.pathplanner.lib.auto.NamedCommands;
import com.pathplanner.lib.auto.AutoBuilder;
import com.pathplanner.lib.commands.FollowPathCommand;
import com.pathplanner.lib.commands.PathPlannerAuto;
import com.pathplanner.lib.commands.PathfindingCommand;
import com.pathplanner.lib.util.*;
import com.pathplanner.lib.util.swerve.*;
import com.pathplanner.lib.pathfinding.*;
import com.pathplanner.lib.path.*;
import com.revrobotics.jni.*;
import com.revrobotics.config.*;
import com.revrobotics.spark.*;
import com.revrobotics.spark.config.*;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final IntakeSubsystem m_IntakeSubsystem = new IntakeSubsystem();
  private final ShooterSubsystem m_ShooterSubsystem = new ShooterSubsystem();
  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  // The container for the robot. Contains subsystems, OI devices, and commands.
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
    new Trigger(m_ShooterSubsystem::ShooterCondition)
        .onTrue(new ShooterCommand(m_ShooterSubsystem));
    
    m_driverController.b().whileTrue(m_ShooterSubsystem.ShooterMethodCommand());
  }

  // Use this method to define your trigger->command mappings. Triggers can be created via the
  // {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
  // predicate, or via the named factories in {@link edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s 
  // subclasses for {@link CommandXboxController Xbox}
  // {@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller PS4} controllers or 
  // {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight joysticks}.

  private void configureBindings() {
    // Schedule 'IntakeCommand' when 'IntakeCondition' changes to 'true'
    new Trigger(m_IntakeSubsystem::IntakeCondition)
        .onTrue(new IntakeCommand(m_IntakeSubsystem));
    // Schedule 'IntakeMethodCommand' when the Xbox controller's A button is pressed,
    // cancelling on release.
    m_driverController.a().whileTrue(m_IntakeSubsystem.IntakeMethodCommand());
  }

  // Use this to pass the autonomous command to the main {@link Robot} class.
  // @return the command to run in autonomous
  public Command getAutonomousCommand() {
    // The Intake command will be run in autonomous mode
    return IntakeAuto.IntakeAuto(m_IntakeSubsystem);
  }
}
