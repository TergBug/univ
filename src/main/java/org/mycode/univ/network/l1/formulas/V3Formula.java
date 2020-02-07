package org.mycode.univ.network.l1.formulas;

import org.mycode.univ.network.l1.AiMas;
import org.mycode.univ.network.l1.IterationFormula;

public class V3Formula extends IterationFormula {
    public V3Formula(AiMas mas) {
        super(mas);
    }
    @Override
    public double calculate() {
        double sumNumerator = 0;
        for (int i = 0; i < 11; i++) {
            sumNumerator += Math.cos(Math.abs(1-Math.pow(Math.log(mas.getByIndex(i).doubleValue()), 2)));
        }
        double sumDenominator = 0;
        for (int i = 0; i < 11; i++) {
            sumDenominator += Math.pow(Math.sin(18*Math.pow(mas.getByIndex(i).doubleValue(), mas.getByIndex(i).doubleValue())), 2);
        }
        return sumNumerator/sumDenominator;
    }
}
