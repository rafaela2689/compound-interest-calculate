package br.com.learning.compoundinterestcalculate;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Assertions.assertThat;

public class CompoundInterestTest {

    @Test
    public void calculateCompoundInterestAmountWithCapital5000In6MonthsAndFixedRate0_01() {
        final CompoundInterest calculate = new CompoundInterest(BigDecimal.valueOf(5000), 6L, 0.01);

        final BigDecimal amount = calculate.calculate().setScale(2, RoundingMode.HALF_DOWN);

        assertThat(amount).isEqualByComparingTo(BigDecimal.valueOf(5307.60));
    }

    @Test
    public void calculateCompoundInterestAmountWithCapital2000In4MontsAndFixedRate0_02() {
        final CompoundInterest calculate = new CompoundInterest(BigDecimal.valueOf(20000), 4L, 0.02);

        final BigDecimal amount = calculate.calculate().setScale(2, RoundingMode.HALF_DOWN);

        assertThat(amount).isEqualByComparingTo(BigDecimal.valueOf(21648.64));
    }

    @Test
    public void calculateCompoundInterestAmountWithCapital500In4MonthsAndFixedRate0_125() {
        final CompoundInterest calculate = new CompoundInterest(BigDecimal.valueOf(500), 4L, 0.125);

        final BigDecimal amount = calculate.calculate().setScale(2, RoundingMode.HALF_DOWN);

        assertThat(amount).isEqualByComparingTo(BigDecimal.valueOf(800.90));
    }
}
