package com.gray.operation;

public class Mult extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
