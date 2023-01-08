
package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean check;
    private int parameter;

    public TemperatureSensor() {
        this.check = false;
    }

    @Override
    public boolean isOn() {
        return this.check;
    }

    @Override
    public void setOn() {
        this.check = true;
    }

    @Override
    public void setOff() {
        this.check = false;
    }

    @Override
    public int read() {
        if (isOn()) {
            this.parameter = new Random().nextInt(61)-30;  
            return this.parameter;
        }     
        throw new IllegalStateException("Il sensore è spento !");
    }

}