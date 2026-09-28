package frc.robot.SubSystems;

import com.ctre.phoenix6.configs.CANcoderConfiguration;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.Pigeon2;
import com.ctre.phoenix6.signals.SensorDirectionValue;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.interpolation.InterpolatingDoubleTreeMap;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.StructPublisher;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Dashboard;

public class Sensors extends SubsystemBase {

    private DigitalInput fimDeCurso;
    private DigitalInput IRDifuso;
    private AnalogInput IRSharp;

    private NetworkTable elastic = NetworkTableInstance.getDefault().getTable("Elastic");

    private InterpolatingDoubleTreeMap tableSharp = new InterpolatingDoubleTreeMap();

    // private final DutyCycleEncoder REVEncoder = new DutyCycleEncoder(0, 1,
    // 0.2633615565840389);
    private final Encoder m_Encoder = new Encoder(0, 1);

    // private final CANcoder m_CANcoder = new CANcoder(1);

    private final Pigeon2 m_Pigeon2 = new Pigeon2(2);

    private final StructPublisher<Pose3d> posePublisher = NetworkTableInstance.getDefault()
            .getStructTopic("/Elastic/RobotPose", Pose3d.struct)
            .publish();

    private final Dashboard m_Dashboard = new Dashboard();

    public Sensors(int FC, int Difuso, int Sharp) {
        // fimDeCurso = new DigitalInput(FC);
        // IRDifuso = new DigitalInput(Difuso);
        // IRSharp = new AnalogInput(Sharp);

        tableSharp.put(2542.0, 7.0);
        tableSharp.put(2370.0, 8.0);
        tableSharp.put(2180.0, 9.0);
        tableSharp.put(2000.0, 10.0);
        tableSharp.put(1858.0, 11.0);
        tableSharp.put(1697.0, 12.0);
        tableSharp.put(1573.0, 13.0);
        tableSharp.put(1454.0, 14.0);
        tableSharp.put(1365.0, 15.0);
        tableSharp.put(1300.0, 16.0);
        tableSharp.put(1225.0, 17.0);
        tableSharp.put(1154.0, 18.0);
        tableSharp.put(1110.0, 19.0);
        tableSharp.put(1058.0, 20.0);
        tableSharp.put(1000.0, 21.0);
        tableSharp.put(958.0, 22.0);
        tableSharp.put(925.0, 23.0);

        // CANcoderConfiguration config = new CANcoderConfiguration();

        // config.MagnetSensor.SensorDirection =
        // SensorDirectionValue.CounterClockwise_Positive;
        // config.MagnetSensor.withMagnetOffset(-0.49853515625);

        // m_CANcoder.getConfigurator().apply(config);

        m_Pigeon2.setYaw(0);

    }

    @Override
    public void periodic() {
        /*
         * 2542 = 7cm
         * 783 = 28cm
         */

        // elastic.getEntry("Plots/FimDeCurso").setBoolean(fimDeCurso.get());
        // elastic.getEntry("Plots/IRDifuso").setBoolean(IRDifuso.get());
        // elastic.getEntry("Plots/IRSharp").setDouble(IRSharp.getValue());
        // elastic.getEntry("Plots/Distance").setDouble(map(IRSharp.getValue(), 783,
        // 2542, 28, 7));
        // elastic.getEntry("Plots/DistanceCm").setDouble(getDistance(IRSharp.getValue()));

        // elastic.getEntry("Plots/REVEncoderAbs").setDouble(REVEncoder.get() * 360);
        // elastic.getEntry("Plots/REVEncoderInc").setDouble(m_Encoder.get());

        // elastic.getEntry("Plots/CANcoder").setDouble(m_CANcoder.getAbsolutePosition().getValueAsDouble());

        Pose3d Odometry = new Pose3d(m_Dashboard.getSlider1(), m_Dashboard.getSlider2(), m_Dashboard.getSlider3(),
                new Rotation3d(Math.toRadians(getRoll()), Math.toRadians(getPitch()), Math.toRadians(getYaw())));

        elastic.getEntry("Plots/Pitch").setDouble(getPitch());
        elastic.getEntry("Plots/Roll").setDouble(getRoll());
        elastic.getEntry("Plots/Yaw").setDouble(getYaw());

        posePublisher.set(Odometry);

    }

    double map(double x, double in_min, double in_max, double out_min, double out_max) {
        return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }

    double getDistance(double readSharp) {
        return tableSharp.get(readSharp);
    }

    public double getPitch() {
        return m_Pigeon2.getPitch().getValueAsDouble();
    }

    public double getRoll() {
        return m_Pigeon2.getRoll().getValueAsDouble();
    }

    public double getYaw() {
        return m_Pigeon2.getYaw().getValueAsDouble();
    }

}
