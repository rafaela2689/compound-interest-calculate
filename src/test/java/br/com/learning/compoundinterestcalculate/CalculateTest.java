package br.com.learning.compoundinterestcalculate;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    @Test
    public void calculateCompoundInterestAmount() {
        final Calculate calculate = new Calculate(BigDecimal.valueOf(5000), 6L, 0.01);

        final BigDecimal amount = calculate.calculateCompoundInterest().setScale(2, RoundingMode.HALF_DOWN);

        assertThat(amount).isEqualByComparingTo(BigDecimal.valueOf(5307.60));
    }

    @Test
    public void calculateCompoundInterestAmountFourMonths() {
        final Calculate calculate = new Calculate(BigDecimal.valueOf(20000), 4L, 0.02);

        final BigDecimal amount = calculate.calculateCompoundInterest().setScale(2, RoundingMode.HALF_DOWN);

        assertThat(amount).isEqualByComparingTo(BigDecimal.valueOf(21648.64));
    }

    @Test
    public void calculateCompoundInterestAmountFourMonthsTwelvePointFivePercent() {
        final Calculate calculate = new Calculate(BigDecimal.valueOf(500), 4L, 0.125);

        final BigDecimal amount = calculate.calculateCompoundInterest().setScale(2, RoundingMode.HALF_DOWN);

        assertThat(amount).isEqualByComparingTo(BigDecimal.valueOf(800.90));
    }
}
