package org.mycode.univ.network.l1.formulas;

import org.mycode.univ.network.l1.AiMas;
import org.mycode.univ.network.l1.IterationFormula;

public class V7Formula extends IterationFormula {
    public V7Formula(AiMas mas) {
        super(mas);
    }
    @Override
    public double calculate() {
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += 1+Math.cos(mas.getByIndex(i).doubleValue())+Math.cos(mas.getByIndex(i).doubleValue()/2);
        }
        return sum;
    }
}
