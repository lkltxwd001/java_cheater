package lkltxwd.java_cheater;

import day1.Calculator;
import day1.OverloadPriority;

public class Main {
    public static void main(String[] args) {

        // 测试整数加法
        Number result1 = Calculator.calculateModern("add", 10, 20);
        System.out.println("10 + 20 = " + result1);

        // 测试整数减法
        Number result2 = Calculator.calculateModern("subtract", 20, 5);
        System.out.println("20 - 5 = " + result2);

        // 测试整数乘法
        Number result3 = Calculator.calculateModern("multiply", 7, 6);
        System.out.println("7 × 6 = " + result3);

        // 测试浮点数加法
        Number result4 = Calculator.calculateModern("add", 3.5, 2.5);
        System.out.println("3.5 + 2.5 = " + result4);

        // 测试浮点数减法
        Number result5 = Calculator.calculateModern("subtract", 10.5, 3.2);
        System.out.println("10.5 - 3.2 = " + result5);

        // 测试传统方式
        Number result6 = Calculator.calculateTraditional("add", 100, 200);
        System.out.println("传统方式: 100 + 200 = " + result6);

        OverloadPriority o = new OverloadPriority();
        o.show(42);
    }
}