package pl.msendyka.examples.callback;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class Service {

    // This is fixed value to help illustrate how this can work.
    // In reality method load will return some computed value.
    private final String value;

    public Service(String value) {
        this.value = value;
    }

    public void load(Consumer<String> callback) {
        System.out.println(this + " Scheduling work");

        System.out.println(this + "Doing computation");
        callback.accept(value);

    }

}
