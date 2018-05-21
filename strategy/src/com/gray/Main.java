package com.gray;

import com.gray.operation.Add;
import com.gray.operation.Context;

public class Main {

    public static void main(String[] args) {
        Context context = null;
        context = new Context(new Add());
        int result = context.executeStrategy(4, 8);
        System.out.println("结果是：" + result);
    }
}
