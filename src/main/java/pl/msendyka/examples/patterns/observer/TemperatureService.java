package pl.msendyka.examples.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureService {

    private final TemperatureSensor temperatureSensor;
    private final List<TemperatureListener> listeners = new ArrayList<>();

    public TemperatureService(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    public void subscribe(TemperatureListener temperatureListener) {
        listeners.add(temperatureListener);
    }

    public void unsubscribe(TemperatureListener temperatureListener) {
        listeners.remove(temperatureListener);
    }

    public void startMonitoring() {

        while (true) {
            TemperatureData temperatureData = temperatureSensor.read();
            listeners.forEach(obs -> obs.notify(temperatureData));
            try {
                if (Thread.interrupted()) {
                    break;
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted, aborting.");
                break;
            }
        }
    }

}
