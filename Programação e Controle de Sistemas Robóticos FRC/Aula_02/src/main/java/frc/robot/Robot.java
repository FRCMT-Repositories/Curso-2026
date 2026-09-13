// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.SubSystems.MotorCim;
import frc.robot.SubSystems.MotorNEO;

public class Robot extends TimedRobot {
  private Command m_autonomousCommand;

  private final RobotContainer m_robotContainer;
  private final MotorCim m_MotorCim = new MotorCim();
  private final MotorNEO m_MotorNEO = new MotorNEO(false, IdleMode.kBrake, 30);

  private final Dashboard m_Dashboard = new Dashboard();

  private final NetworkTable elastic = NetworkTableInstance.getDefault().getTable("Elastic");

  private double lastkP = 0, lastkI = 0, lastkD = 0;

  public Robot() {
    m_robotContainer = new RobotContainer();
  }

  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();

    if((lastkP != m_Dashboard.getSlider3()) || (lastkI != m_Dashboard.getSlider4()) || (lastkD != m_Dashboard.getSlider5())){
      // m_MotorNEO.setPID(m_Dashboard.getSlider3(), m_Dashboard.getSlider4(), m_Dashboard.getSlider5());
      m_MotorNEO.setMaxMotionVar(m_Dashboard.getSlider3(), m_Dashboard.getSlider4(), m_Dashboard.getSlider5());
    }
    
    m_MotorCim.setMotorCim(m_Dashboard.getSlider1());

    // m_MotorNEO.setSpeed(m_Dashboard.getText1());
    // m_MotorNEO.setPosition(m_Dashboard.getSlider2());
    m_MotorNEO.setMaxMotion(m_Dashboard.getSlider2());

    lastkP = m_Dashboard.getSlider3();
    lastkI = m_Dashboard.getSlider4();
    lastkD = m_Dashboard.getSlider5();

    elastic.getEntry("Grafico/Posicao").setDouble(m_MotorNEO.getPosition());
    elastic.getEntry("Grafico/Velocidade").setDouble(m_MotorNEO.getVelocity());
    elastic.getEntry("Grafico/Current").setDouble(m_MotorNEO.getCurrent());

  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void disabledExit() {}

  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    if (m_autonomousCommand != null) {
      CommandScheduler.getInstance().schedule(m_autonomousCommand);
    }
  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void autonomousExit() {}

  @Override
  public void teleopInit() {
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  @Override
  public void teleopPeriodic() {}

  @Override
  public void teleopExit() {}

  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  @Override
  public void testPeriodic() {}

  @Override
  public void testExit() {}
}
