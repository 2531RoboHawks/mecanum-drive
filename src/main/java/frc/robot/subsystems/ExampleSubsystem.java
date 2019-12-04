/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.Drive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ExampleSubsystem extends Subsystem {
  private Spark frontLeft = new Spark(0);
  private Spark backleft = new Spark(1);
  private Spark frontRight = new Spark(2);
  private Spark backRight = new Spark(3);
  
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new Drive());
  }

  public void mecanumDrive(double stickOne, double stickTwo) {
    System.out.println(frontLeft.get());
    frontLeft.set(stickOne);
    backleft.set(stickOne);
    frontRight.set(stickOne);
    backRight.set(stickOne);
}

public void stop() {
  mecanumDrive(0.0D, 0.0D);
}

}
