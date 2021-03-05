package br.com.learning.compoundinterestcalculate.controller;

import br.com.learning.compoundinterestcalculate.CompoundInterest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
public class CompoundInterestController {

    @GetMapping("/calculate-compound-interest")
    public BigDecimal getCalculatedCompoundInterest(@RequestParam(value = "capital") BigDecimal capital,
                                                    @RequestParam(value = "quantityOfMonths") Long quantityOfMonths,
                                                    @RequestParam(value = "fixedRate") double fixedRate) {

        final CompoundInterest compoundInterest = new CompoundInterest(capital, quantityOfMonths, fixedRate);
        return compoundInterest.calculate().setScale(2, RoundingMode.HALF_EVEN);
    }
}
