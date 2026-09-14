// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.SubSystems.MotorKrakenX60;

public class Robot extends TimedRobot {
  private Command m_autonomousCommand;

  private final RobotContainer m_robotContainer;
  private final Dashboard m_Dashboard = new Dashboard();

  private final MotorKrakenX60 m_KrakenX60 = new MotorKrakenX60();

  private final NetworkTable elastic = NetworkTableInstance.getDefault().getTable("Elastic");

  private double checkSum = 0.0;

  public Robot() {
    m_robotContainer = new RobotContainer();
  }

  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();

    if(checkSum != m_Dashboard.getSlider3() + m_Dashboard.getSlider4() + m_Dashboard.getSlider5()){
      m_KrakenX60.configMotionMagic(m_Dashboard.getSlider3(), m_Dashboard.getSlider4(), m_Dashboard.getSlider5());
    }

    checkSum = m_Dashboard.getSlider3() + m_Dashboard.getSlider4() + m_Dashboard.getSlider5();
    // m_KrakenX60.setSpeed(m_Dashboard.getSlider1());
    // m_KrakenX60.setPosition(m_Dashboard.getSlider1());
    // m_KrakenX60.setMotionMagic(m_Dashboard.getSlider1());
    m_KrakenX60.setRPM(m_Dashboard.getSlider1());
    
    
    elastic.getEntry("Plots/Current").setDouble(m_KrakenX60.getCurrent());
    elastic.getEntry("Plots/Velocity").setDouble(m_KrakenX60.getVelocity() * 60);
    elastic.getEntry("Plots/Position").setDouble(m_KrakenX60.getPosition());

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
