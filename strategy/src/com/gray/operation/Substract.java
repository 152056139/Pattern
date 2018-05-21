package com.gray.operation;

public class Substract implements Strategy {
    @Override
    public int doOperation(int numA, int numB) {
        return numA - numB;
    }
}
