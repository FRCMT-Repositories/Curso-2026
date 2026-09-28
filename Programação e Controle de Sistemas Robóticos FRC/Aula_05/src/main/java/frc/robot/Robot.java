// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.littletonrobotics.junction.LoggedRobot;
import org.littletonrobotics.junction.Logger;
import org.littletonrobotics.junction.networktables.NT4Publisher;
import org.littletonrobotics.junction.wpilog.WPILOGWriter;

import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.SubSystems.MotorNEO;

public class Robot extends LoggedRobot {
  private Command m_autonomousCommand;

  private final RobotContainer m_robotContainer;

  private final Dashboard m_Dashboard = new Dashboard();
  // private NetworkTable elastic = NetworkTableInstance.getDefault().getTable("Elastic");
  private MotorNEO m_MotorNEO = new MotorNEO(false, IdleMode.kBrake, 40);

  private XboxController m_Controller = new XboxController(0);

  public Robot() {
    m_robotContainer = new RobotContainer();

    Logger.recordMetadata("ProjetcName", "FRC_MT");

    if(isReal()){
      Logger.addDataReceiver(new WPILOGWriter());
      Logger.addDataReceiver(new NT4Publisher());
    }
    else if(isSimulation()){
      Logger.addDataReceiver(new WPILOGWriter("logs"));
    }

    Logger.start();

  }

  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();

    // elastic.getEntry("Control/A").setBoolean(m_Controller.getAButton());
    // elastic.getEntry("Control/Y").setBoolean(m_Controller.getYButton());

    // elastic.getEntry("Control/Trigger").setDouble(m_Controller.getRightTriggerAxis());
    // elastic.getEntry("Control/JoyRX").setDouble(m_Controller.getRightX());


    m_MotorNEO.setSpeed(MathUtil.applyDeadband(m_Controller.getRightX(), 0.1));

    Logger.recordOutput("Control/Joystick Right X", MathUtil.applyDeadband(m_Controller.getRightX(), 0.1));
    Logger.recordOutput("Motor/Current", m_MotorNEO.getCurrent());

  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  @Override
  public void disabledExit() {
  }

  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    if (m_autonomousCommand != null) {
      CommandScheduler.getInstance().schedule(m_autonomousCommand);
    }
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void autonomousExit() {
  }

  @Override
  public void teleopInit() {
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  @Override
  public void teleopPeriodic() {
  }

  @Override
  public void teleopExit() {
  }

  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  @Override
  public void testPeriodic() {
  }

  @Override
  public void testExit() {
  }
}
