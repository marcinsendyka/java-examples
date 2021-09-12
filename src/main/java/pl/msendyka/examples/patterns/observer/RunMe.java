package pl.msendyka.examples.patterns.observer;

import java.util.concurrent.Executors;

public class RunMe {

    public static void main(String[] args) throws InterruptedException {
        var temperatureService = new TemperatureService(new TemperatureSensor());
        TemperatureListener first = print("first");
        temperatureService.subscribe(first);
        temperatureService.subscribe(print("second"));
        temperatureService.subscribe(print("third"));
        temperatureService.subscribe(print("four"));
        var executorService = Executors.newSingleThreadExecutor();
        executorService.submit(temperatureService::startMonitoring);
        Thread.sleep(5000);
        System.out.println("Unsubscribing observer first");
        temperatureService.unsubscribe(first);
    }

    private static TemperatureListener print(String name) {
        return (data) -> System.out.println("Observer %s reports: %s".formatted(name, data));
    }
}
