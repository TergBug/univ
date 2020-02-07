package org.mycode.univ.network.l1.formulas;

import org.mycode.univ.network.l1.AiMas;
import org.mycode.univ.network.l1.IterationFormula;

public class V5Formula extends IterationFormula {
    public V5Formula(AiMas mas) {
        super(mas);
    }
    @Override
    public double calculate() {
        double sumNumerator = 0;
        for (int i = 0; i < 11; i++) {
            sumNumerator += Math.log(Math.abs(1-Math.pow(Math.cos(mas.getByIndex(i).doubleValue()), 2)));
        }
        double sumDenominator = 0;
        for (int i = 0; i < 11; i++) {
            sumDenominator += Math.cos(Math.abs(1-Math.sin(mas.getByIndex(i).doubleValue())));
        }
        return Math.pow(Math.sin(sumNumerator), 2)/sumDenominator;
    }
}
