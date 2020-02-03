package org.mycode.univ.network.l1;

import org.mycode.univ.network.l1.formulas.*;

import java.util.HashMap;
import java.util.Map;

public class FormulaFactory {
    private static Map<Integer, IterationFormula> formulaMap = new HashMap<>();
    public static IterationFormula getFormulaByVariant(int variant){
        if(!formulaMap.containsKey(variant)){
            switch (variant){
                case 1:
                    formulaMap.put(variant, new V1Formula(new IntMas()));
                    break;
                case 2:
                    formulaMap.put(variant, new V2Formula(new FloatMas()));
                    break;
                case 3:
                    formulaMap.put(variant, new V3Formula(new IntMas()));
                    break;
                case 4:
                    formulaMap.put(variant, new V4Formula(new FloatMas()));
                    break;
                case 5:
                    formulaMap.put(variant, new V5Formula(new IntMas()));
                    break;
                case 6:
                    formulaMap.put(variant, new V6Formula(new FloatMas()));
                    break;
                case 7:
                    formulaMap.put(variant, new V7Formula(new IntMas()));
                    break;
                case 8:
                    formulaMap.put(variant, new V8Formula(new FloatMas()));
                    break;
                case 9:
                    formulaMap.put(variant, new V9Formula(new IntMas()));
                    break;
                case 10:
                    formulaMap.put(variant, new V10Formula(new FloatMas()));
                    break;
                case 11:
                    formulaMap.put(variant, new V1Formula(new FloatMas()));
                    break;
                case 12:
                    formulaMap.put(variant, new V2Formula(new IntMas()));
                    break;
                case 13:
                    formulaMap.put(variant, new V3Formula(new FloatMas()));
                    break;
                case 14:
                    formulaMap.put(variant, new V4Formula(new IntMas()));
                    break;
                case 15:
                    formulaMap.put(variant, new V5Formula(new FloatMas()));
                    break;
                case 16:
                    formulaMap.put(variant, new V6Formula(new IntMas()));
                    break;
                case 17:
                    formulaMap.put(variant, new V7Formula(new FloatMas()));
                    break;
                case 18:
                    formulaMap.put(variant, new V8Formula(new IntMas()));
                    break;
                case 19:
                    formulaMap.put(variant, new V9Formula(new FloatMas()));
                    break;
                case 20:
                    formulaMap.put(variant, new V10Formula(new IntMas()));
                    break;
            }
        }
        return formulaMap.get(variant);
    }
}
