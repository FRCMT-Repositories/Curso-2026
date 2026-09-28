package frc.robot.SubSystems;

import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

public class MotorCim {

    private final SparkMax motorCim = new SparkMax(2, MotorType.kBrushed);
    private final SparkMaxConfig motorCimConfig = new SparkMaxConfig();

    public MotorCim() {
        motorCimConfig.inverted(false).idleMode(IdleMode.kBrake).smartCurrentLimit(40);
        motorCim.configure(motorCimConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }

    /** ** Crotole de velocidade do Motor Cim *** */
    /**
     * Common interface for setting the speed of a speed controller.
     *
     * @param speed The speed to set. Value should be between -1.0 and 1.0.
     */
    public void setMotorCim(double speed) {
        if(speed > 1.0){
            speed = 1.0;
        }
        else if(speed < -1.0){
            speed = -1.0;
        }

        motorCim.set(speed);
    }

}
