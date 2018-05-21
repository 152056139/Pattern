package com.gray;

import com.gray.operation.Operation;
import com.gray.factory.OperationFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true){

            // 用户输入
            double result = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("第一个运算数：");
            String numberA = scanner.next();

            System.out.print("运算符号：");
            String operationChar = scanner.next();

            System.out.print("第二个运算数：");
            String numberB = scanner.next();

            // 获得对应的对象去运算
            Operation operation = null;
            try {
                operation = OperationFactory.createOperation(operationChar);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // 得到结果
            assert operation != null;
            operation.setNumberA(Integer.parseInt(numberA));
            operation.setNumberB(Integer.parseInt(numberB));

            try {
                result = operation.getResult();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("结果为：" + result);
        }

    }
}
