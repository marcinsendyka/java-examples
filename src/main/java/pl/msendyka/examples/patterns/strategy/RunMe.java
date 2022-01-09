package pl.msendyka.examples.patterns.strategy;

public class RunMe {

    public static void main(String[] args) {
        // provide implementation that can compute the PI number without changing other code
        PiComputationStrategy strategy = new HardcodedPiComputation();

        System.out.println(strategy.compute(10));
    }
}
