package pl.msendyka.examples.patterns.strategy;

import java.math.BigDecimal;

public interface PiComputationStrategy {

    BigDecimal compute(int precision);
}
