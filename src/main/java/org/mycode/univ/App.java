package org.mycode.univ;

public class App {
    public static void main( String[] args ) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(FormulaFactory.getFormulaByVariant(i).calculate());
        }
    }
}
