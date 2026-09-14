package frc.robot.SubSystems;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.ControlRequest;
import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

public class MotorKrakenX60 {
    
    private final TalonFX KrakenX60 = new TalonFX(3);
    private final PositionVoltage KrakenX60PV = new PositionVoltage(0).withSlot(0);
    private final MotionMagicVoltage KrakenX60MMV = new MotionMagicVoltage(0).withSlot(0);
    private final VelocityVoltage KrakenX60VV = new VelocityVoltage(0).withSlot(0);


    public MotorKrakenX60(){
        // var slot0 = new Slot0Configs();

        // slot0.kP = 2.0;
        // slot0.kI = 0.0;
        // slot0.kD = 0.0;

        // KrakenX60.getConfigurator().apply(slot0);
        
        // var config = new TalonFXConfiguration();

        // config.Slot0.kP = 2.0;
        // config.Slot0.kI = 0.0;
        // config.Slot0.kD = 0.0;

        // config.MotionMagic.MotionMagicCruiseVelocity = 10;
        // config.MotionMagic.MotionMagicAcceleration = 20;
        // config.MotionMagic.MotionMagicJerk = 100;

        var slot0 = new Slot0Configs();

        slot0.kS = 0.1;
        slot0.kV = 0.12;
        slot0.kP = 0.11;
        slot0.kI = 0.0;
        slot0.kD = 0.0;

        KrakenX60.getConfigurator().apply(slot0);

        KrakenX60.setPosition(0);
    }

    public void configMotionMagic(double CruiseVelocity, double Acceleration, double Jerk){
        var config = new TalonFXConfiguration();

        config.Slot0.kP = 2.0;
        config.Slot0.kI = 0.0;
        config.Slot0.kD = 0.0;

        config.MotionMagic.MotionMagicCruiseVelocity = CruiseVelocity;
        config.MotionMagic.MotionMagicAcceleration = Acceleration;
        config.MotionMagic.MotionMagicJerk = Jerk;

        KrakenX60.getConfigurator().apply(config);
    }

    public void setSpeed(double speed){
        KrakenX60.set(speed);
    }

    public void setPosition(double position){
       KrakenX60.setControl(KrakenX60PV.withPosition(position));
    }

    public void setMotionMagic(double position){
        KrakenX60.setControl(KrakenX60MMV.withPosition(position));
    }

    public void setRPM(double RPM){
        double RPS = RPM / 60;
        KrakenX60.setControl(KrakenX60VV.withVelocity(RPS));
    }

    public double getCurrent(){
        return KrakenX60.getSupplyCurrent().getValueAsDouble();
    }

    public double getVelocity(){
        return KrakenX60.getVelocity().getValueAsDouble();
    }

    public double getPosition(){
        return KrakenX60.getPosition().getValueAsDouble();
    }
}
