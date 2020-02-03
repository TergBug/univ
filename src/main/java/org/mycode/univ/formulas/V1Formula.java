package org.mycode.univ.formulas;

import org.mycode.univ.AiMas;
import org.mycode.univ.IterationFormula;

public class V1Formula extends IterationFormula {
    public V1Formula(AiMas mas) {
        super(mas);
    }
    @Override
    public double calculate() {
        double sumNumerator = 0;
        for (int i = 0; i < 5; i++) {
            sumNumerator += Math.sin(Math.abs(1-Math.log(mas.getByIndex(i).doubleValue())));
        }
        double sumDenominator = 0;
        for (int i = 0; i < 11; i++) {
            sumDenominator += Math.pow(Math.sin(18*Math.pow(mas.getByIndex(i).doubleValue(), 3)), 2);
        }
        return sumNumerator/sumDenominator;
    }
}
