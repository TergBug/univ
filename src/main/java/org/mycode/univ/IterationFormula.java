package org.mycode.univ;

public abstract class IterationFormula {
    protected AiMas mas;
    public IterationFormula(AiMas mas){
        this.mas = mas;
    }
    public abstract double calculate();
}
