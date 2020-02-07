package org.mycode.univ.network.l1.formulas;

import org.mycode.univ.network.l1.AiMas;
import org.mycode.univ.network.l1.IterationFormula;

public class V9Formula extends IterationFormula {
    public V9Formula(AiMas mas) {
        super(mas);
    }
    @Override
    public double calculate() {
        double sumInner = 0;
        for (int i = 0; i < 11; i++) {
            sumInner += mas.getByIndex(i).doubleValue();
        }
        sumInner = sumInner/11;
        double sumOuter = 0;
        for (int i = 0; i < 11; i++) {
            sumOuter += Math.pow(mas.getByIndex(i).doubleValue()-sumInner, 2);
        }
        return Math.sqrt(sumOuter/10);
    }
}
