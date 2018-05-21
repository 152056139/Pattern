package com.gray.operation;

abstract public class Operation {

    private int numberA;
    private int numberB;

    protected int getNumberA() {
        return numberA;
    }

    protected int getNumberB() {
        return numberB;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    abstract public double getResult() throws Exception;

}
