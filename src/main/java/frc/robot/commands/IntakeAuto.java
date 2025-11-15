// The IntakeAuto will be used as an Auto for the robot is Automatically Intake something

package frc.robot.commands;

// All imports will be between Lines 6-9
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.IntakeParameters;

public final class IntakeAuto {
      public static IntakeCommand IntakeAuto;
// Intake static factory for an autonomous Intake command.
  public static Command IntakeAuto(IntakeSubsystem subsystem) {
    return Commands.sequence(subsystem.IntakeMethodCommand(), new IntakeCommand(subsystem));
  }
  private IntakeAuto() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}

