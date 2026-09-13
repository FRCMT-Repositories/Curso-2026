package frc.robot;

import edu.wpi.first.networktables.BooleanEntry;
import edu.wpi.first.networktables.DoubleEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Dashboard {
    private final BooleanEntry chave1;
    private final BooleanEntry chave2;

    private final DoubleEntry text1;
    private final DoubleEntry text2;

    private final DoubleEntry slider1;
    private final DoubleEntry slider2;
    private final DoubleEntry slider3;
    private final DoubleEntry slider4;
    private final DoubleEntry slider5;


    public Dashboard() {

        chave1 = NetworkTableInstance.getDefault()
                .getBooleanTopic("/Elastic/Chaves/01")
                .getEntry(false);
        chave1.set(false);

        chave2 = NetworkTableInstance.getDefault()
                .getBooleanTopic("/Elastic/Chaves/02")
                .getEntry(false);
        chave2.set(false);

        text1 = NetworkTableInstance.getDefault()
                .getDoubleTopic("/Elastic/Text/01")
                .getEntry(0);
        text1.set(0);

        text2 = NetworkTableInstance.getDefault()
                .getDoubleTopic("/Elastic/Text/02")
                .getEntry(0);
        text2.set(0);

        slider1 = NetworkTableInstance.getDefault()
                .getDoubleTopic("/Elastic/Slider/01")
                .getEntry(0);
        slider1.set(0);

        slider2 = NetworkTableInstance.getDefault()
                .getDoubleTopic("/Elastic/Slider/02")
                .getEntry(0);
        slider2.set(0);

        slider3 = NetworkTableInstance.getDefault()
                .getDoubleTopic("/Elastic/Slider/kP")
                .getEntry(0);
        slider3.set(0);

        slider4 = NetworkTableInstance.getDefault()
                .getDoubleTopic("/Elastic/Slider/kI")
                .getEntry(0);
        slider4.set(0);

        slider5 = NetworkTableInstance.getDefault()
                .getDoubleTopic("/Elastic/Slider/kD")
                .getEntry(0);
        slider5.set(0);

    }

    public boolean getChave1() {
        return chave1.get();
    }

    public boolean getChave2() {
        return chave2.get();
    }

    public double getText1() {
        return text1.get();
    }

    public double getText2() {
        return text2.get();
    }

    public double getSlider1() {
        return slider1.get();
    }

    public double getSlider2() {
        return slider2.get();
    }

    public double getSlider3() {
        return slider3.get();
    }

    public double getSlider4() {
        return slider4.get();
    }

    public double getSlider5() {
        return slider5.get();
    }
}
