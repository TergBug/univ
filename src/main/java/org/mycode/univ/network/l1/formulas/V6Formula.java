package org.mycode.univ.network.l1.formulas;

import org.mycode.univ.network.l1.AiMas;
import org.mycode.univ.network.l1.IterationFormula;

public class V6Formula extends IterationFormula {
    public V6Formula(AiMas mas) {
        super(mas);
    }
    @Override
    public double calculate() {
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += (1-2*Math.pow(Math.cos(mas.getByIndex(i).doubleValue()), 2))
                    /(Math.abs(Math.sin(mas.getByIndex(i).doubleValue()))*Math.abs(Math.cos(mas.getByIndex(i).doubleValue())));
        }
        return sum;
    }
}
