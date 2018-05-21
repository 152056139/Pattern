package com.gray.operation;


public class Add implements Strategy {
    @Override
    public int doOperation(int numA, int numB) {
        return numA + numB;
    }
}
