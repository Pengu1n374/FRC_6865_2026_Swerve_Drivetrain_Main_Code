// The ShooterAuto will be used as an Auto to Automatically Shoot something

package frc.robot.commands;

// All imports will be between Lines 6-9
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.ShooterParameters;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;


public final class ShooterAuto {
  public static ShooterCommand ShooterAuto;

/** Shooter static factory for an autonomous Shooter command. */
  public static Command ShooterAuto(ShooterSubsystem subsystem) {
    return Commands.sequence(subsystem.ShooterMethodCommand(), new ShooterCommand(subsystem));
  }

  private ShooterAuto() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
