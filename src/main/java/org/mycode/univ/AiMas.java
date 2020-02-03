package org.mycode.univ;

public abstract class AiMas<V extends Number> {
    protected V[] mas;
    protected abstract void initMas();
    public V getByIndex(int index){
        if(mas==null || mas.length==0){
            initMas();
        }
        return mas[index];
    }
}
