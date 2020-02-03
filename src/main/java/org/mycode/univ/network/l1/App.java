package org.mycode.univ.network.l1;

public class App {
    public static void main( String[] args ) {
        //sdfa
        for (int i = 1; i <= 20; i++) {
            System.out.println(FormulaFactory.getFormulaByVariant(i).calculate());
        }
        
    }
}
