package com.gray.operation;

public class Add extends Operation {

    @Override
    public double getResult() {
        return this.getNumberA() + this.getNumberB();
    }
}
