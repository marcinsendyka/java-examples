package pl.msendyka.examples.patterns.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HardcodedPiComputation implements PiComputationStrategy {
    private static final BigDecimal PI = new BigDecimal("3.141592653589793238462643383279502884197169399375105820" +
            "9749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174" +
            "50284102701938521105559644622948954930381964428");
    @Override
    public BigDecimal compute(int precision) {
        return PI.setScale(precision, RoundingMode.HALF_UP);
    }
}
