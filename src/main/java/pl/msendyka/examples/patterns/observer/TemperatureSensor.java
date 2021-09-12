package pl.msendyka.examples.patterns.observer;

public class TemperatureSensor {

    public TemperatureData read() {
        return new TemperatureData((int) (Math.random()*100));
    }
}
