// This is the ShooterSubsystem which will opperate the Shooting Mechanism of the Robot

package frc.robot.subsystems;
// All imports will be between Lines 6-9

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.ShooterAuto;
import frc.robot.commands.ShooterCommand;
import frc.robot.subsystems.ShooterParameters;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */
  public ShooterSubsystem() {
    // State what should happen in the ShooterSubsystem in these brackets.
  }
   // Below is the ShooterCommand factory method.
   // Use @return to return a command
  public Command ShooterMethodCommand() {
    // Inline construction of command goes here, between the brackets.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* The One-time action goes here */
        });
  }
  public final ShooterParameters parameters = new ShooterParameters();
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
