// The ShooterCommand will be used as a library for the ShooterSubsystem

package frc.robot.commands;

// All imports will be between Lines 6-9
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.ShooterParameters;
import frc.robot.commands.ShooterAuto;
import edu.wpi.first.wpilibj2.command.Command;


public class ShooterCommand extends Command { // Command for controlling the ShooterSubsystem
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final ShooterSubsystem m_subsystem; // The subsystem used by this command

  /**
   * Creates a new ShooterCommand.
   * @param subsystem The subsystem used by this command.
   */
  public ShooterCommand(ShooterSubsystem subsystem) { // Constructor for ShooterCommand
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // Initialization code can go here
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Execution code can go here
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Cleanup code can go here
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() { // Command should end condition
    return false;
  }
}
