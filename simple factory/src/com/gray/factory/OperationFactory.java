package com.gray.factory;

import com.gray.operation.*;

public class OperationFactory {

    public static Operation createOperation(String operationStr) throws Exception {

        Operation operation = null;

        switch (operationStr) {

            case "+" :
                operation = new Add();
                break;

            case "-" :
                operation = new Sub();
                break;

            case "*" :
                operation = new Mult();
                break;

            case "/" :
                operation = new Div();
                break;

            default:

        }
        if (operation == null){
            throw new Exception("非法运算");
        }
        return operation;
    }
}
