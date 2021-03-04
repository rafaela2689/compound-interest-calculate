package br.com.learning.compoundinterestcalculate;

import java.math.BigDecimal;

public class Calculate {
    private BigDecimal capital;
    private Long quantityMonths;
    private double fee;

    public Calculate(final BigDecimal capital, final Long quantityMonths, final double fee) {
        this.capital = capital;
        this.quantityMonths = quantityMonths;
        this.fee = fee;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public double getFee() {
        return fee;
    }

    public Long getQuantityMonths() {
        return quantityMonths;
    }

    public BigDecimal calculateCompoundInterest() {
        // M = C (1 + i)**t

        final double multiplyValue = Math.pow(1+fee, quantityMonths);
        final BigDecimal amount = BigDecimal.valueOf(capital.doubleValue() * multiplyValue);

        return amount;
    }
}
