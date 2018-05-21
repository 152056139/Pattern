package com.gray.operation;

public class Sub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
