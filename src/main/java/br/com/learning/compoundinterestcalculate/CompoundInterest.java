package br.com.learning.compoundinterestcalculate;

import java.math.BigDecimal;

public class CompoundInterest {

    private BigDecimal capital;
    private Long quantityOfMonths;
    private double fixedRate;

    public CompoundInterest(final BigDecimal capital, final Long quantityMonths, final double fee) {
        this.capital = capital;
        this.quantityOfMonths = quantityMonths;
        this.fixedRate = fee;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public double getFixedRate() {
        return fixedRate;
    }

    public Long getQuantityOfMonths() {
        return quantityOfMonths;
    }

    public BigDecimal calculate() {
        // calculate compound interest formula
        // M = C (1 + i)^t
        // M: total amount
        // C: initial capital
        // i: fixed rate
        // t: time period

        final double multiplyValue = Math.pow(1+ fixedRate, quantityOfMonths);
        final BigDecimal amount = BigDecimal.valueOf(capital.doubleValue() * multiplyValue);

        return amount;
    }
}
