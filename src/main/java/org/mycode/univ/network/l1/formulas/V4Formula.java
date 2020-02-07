package org.mycode.univ.network.l1.formulas;

import org.mycode.univ.network.l1.AiMas;
import org.mycode.univ.network.l1.IterationFormula;

public class V4Formula extends IterationFormula {
    public V4Formula(AiMas mas) {
        super(mas);
    }
    @Override
    public double calculate() {
        double sumNumerator = 0;
        for (int i = 0; i < 11; i++) {
            sumNumerator += Math.pow(Math.abs(Math.sin(mas.getByIndex(i).doubleValue())), Math.sin(mas.getByIndex(i).doubleValue()))
                    +Math.pow(Math.abs(Math.cos(mas.getByIndex(i).doubleValue())), Math.cos(mas.getByIndex(i).doubleValue()));
        }
        double sumDenominator = 0;
        for (int i = 0; i < 11; i++) {
            sumDenominator += Math.pow(Math.sin(Math.pow(mas.getByIndex(i).doubleValue(), Math.sin(mas.getByIndex(i).doubleValue()))), 2);
        }
        return Math.log(sumNumerator)/(3*sumDenominator);
    }
}
