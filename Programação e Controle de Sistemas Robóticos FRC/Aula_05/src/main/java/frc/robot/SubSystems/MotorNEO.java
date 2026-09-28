package frc.robot.SubSystems;

import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.math.MathUtil;

public class MotorNEO {

    private final SparkMax motorNEO = new SparkMax(1, MotorType.kBrushless);
    private final SparkMaxConfig motorNEOConfig = new SparkMaxConfig();
    private final SparkClosedLoopController motorNEOPID = motorNEO.getClosedLoopController();

    public MotorNEO(boolean inverted, IdleMode kMode, int current) {
        motorNEOConfig.inverted(inverted).idleMode(kMode).smartCurrentLimit(current);
        motorNEOConfig.closedLoop.pid(0.0001, 0.0, 0.0);
        motorNEOConfig.closedLoop.feedForward.kV(0.0021);

        motorNEOConfig.closedLoop.maxMotion
                .cruiseVelocity(3000)
                .maxAcceleration(1500)
                .allowedProfileError(1);

        motorNEO.configure(motorNEOConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

        motorNEO.getEncoder().setPosition(0);
    }

    /**
     * Método para configurar o PID
     * 
     * @param kP Ganho proporcional.
     * @param kI Ganho integral.
     * @param kD Ganho derivativo.
     */
    public void setPID(double kP, double kI, double kD) {
        MathUtil.clamp(kP, 0, 4.0);
        MathUtil.clamp(kI, 0, 0.1);
        MathUtil.clamp(kD, 0, 0.1);

        motorNEOConfig.closedLoop.pid(kP, kI, kD);
        motorNEO.configure(motorNEOConfig, ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
    }

    /**
     * Método para configurar o MaxMotion
     * 
     * @param cruiseVelocity Velocidade de cruseiro, velocidade maxima que o nosso sistema pode chegar.
     * @param maxAcceleration Aceleração maxima do nosso sistema.
     * @param allowedProfileError Erro permitido.
     */
    public void setMaxMotionVar(double cruiseVelocity, double maxAcceleration, double allowedProfileError) {
        motorNEOConfig.closedLoop.maxMotion
                .cruiseVelocity(cruiseVelocity)
                .maxAcceleration(maxAcceleration)
                .allowedProfileError(allowedProfileError);
        motorNEO.configure(motorNEOConfig, ResetMode.kNoResetSafeParameters, PersistMode.kNoPersistParameters);
    }

    /**
     * Método para controlar a velocidade do motor NEO
     * 
     * @param speed Suporta valores de 1 a -1
     */
    public void setSpeed(double speed) {

        MathUtil.clamp(speed, -1.0, 1.0);

        motorNEO.set(speed);
    }

    /**
     * Método para controlar a posição do motor NEO
     * 
     * @param position Suporta valores do tipo double
     */
    public void setPosition(double position) {
        motorNEOPID.setSetpoint(position, ControlType.kPosition);
    }

    /**
     * Método para controlar a posição do motor NEO com MaxMotion
     * 
     * @param position Suporta valores do tipo double
     */
    public void setMaxMotion(double position){
        motorNEOPID.setSetpoint(position, ControlType.kMAXMotionPositionControl);
    }

    public void setRPM(double RPM){
        motorNEOPID.setSetpoint(RPM, ControlType.kVelocity);
    }

    /**
     * Método para pegar a velocidade do motor NEO
     * 
     */
    public double getVelocity() {
        return motorNEO.getEncoder().getVelocity();
    }

    /**
     * Método para pegar a posição do motor NEO
     * 
     */
    public double getPosition() {
        return motorNEO.getEncoder().getPosition();
    }

    /**
     * Método para retornar a corrente do motor.
     * 
     */
    public double getCurrent() {
        return motorNEO.getOutputCurrent();
    }
}
