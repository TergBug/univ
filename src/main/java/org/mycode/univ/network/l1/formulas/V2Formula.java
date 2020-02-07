package org.mycode.univ.network.l1.formulas;

import org.mycode.univ.network.l1.AiMas;
import org.mycode.univ.network.l1.IterationFormula;

public class V2Formula extends IterationFormula {
    public V2Formula(AiMas mas) {
        super(mas);
    }
    @Override
    public double calculate() {
        double sumNumerator = 0;
        for (int i = 0; i < 11; i++) {
            sumNumerator += Math.sin(1-3*Math.pow(Math.sin(mas.getByIndex(i).doubleValue()), 3));
        }
        double sumDenominator = 0;
        for (int i = 0; i < 11; i++) {
            sumDenominator += Math.pow(Math.cos(Math.pow(mas.getByIndex(i).doubleValue(), 5)), 2);
        }
        return sumNumerator/(3*sumDenominator);
    }
}
