// The IntakeSubsystem is the system that creates the value of Intaking something for the Robot
//E - 2025

package frc.robot.subsystems;

// All imports with be between Lines 7-10
import frc.robot.commands.IntakeAuto;
import frc.robot.commands.IntakeCommand;
import frc.robot.subsystems.IntakeParameters;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    // Creates a new IntakeSubsystem
   public IntakeSubsystem() {
    // State what should happen in the IntakeSubsystem in the brackets
   }
    /**
   * Below is the IntakeCommand factory method.
   *
   * @return to return a command
   */
  public Command IntakeMethodCommand() {
    // Inline construction of command goes here, between the brackets.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* The One-time action goes here */
        });
  }
  public final IntakeParameters parameters = new IntakeParameters();
  /**
   * Below is a Intake method querying a boolean state of the subsystem (for example, a digital sensor to recognize what is in front of the Shooter).
   *
   * The @return value of some boolean subsystem state, such as a digital sensor, is below.
   */
  public boolean IntakeCondition() {
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