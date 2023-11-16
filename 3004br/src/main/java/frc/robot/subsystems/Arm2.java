package frc.robot.subsystems;
import edu.wpi.first.wpilibj.xrp.XRPServo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm2 extends SubsystemBase {
  private final XRPServo m_armServo2XrpServo;

  /** Creates a new Arm. */
  public Arm2() {
    // Device number 4 maps to the physical Servo 1 port on the XRP
    m_armServo2XrpServo = new XRPServo(5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  /**
   * Set the current angle of the arm (0 - 180 degrees).
   *
   * @param angleDeg Desired arm angle in degrees
   */
  public void setAngle(double angleDeg) {
    m_armServo2XrpServo.setAngle(angleDeg);
  }

  
}

 
    

