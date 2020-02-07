package org.mycode.univ.network.l1.formulas;

import org.mycode.univ.network.l1.AiMas;
import org.mycode.univ.network.l1.IterationFormula;

public class V8Formula extends IterationFormula {
    public V8Formula(AiMas mas) {
        super(mas);
    }
    @Override
    public double calculate() {
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += Math.cos(2*mas.getByIndex(i).doubleValue())/(1-Math.sin(2*mas.getByIndex(i).doubleValue()));
        }
        return sum;
    }
}
