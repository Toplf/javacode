package com.luof.base.syntax;

public class SimpleTest {

    // 递归适用的场景是,问题可以分解为一个小问题和另一个子问题.
    // 栈桢
    // 求n的阶乘. 求n*n-1的阶乘
    public static int test(int n) {
        //return test(n); // 递归调用, 无限递归, 死归
        if (n == 1) {
            return 1;
        }
        return n * test(n - 1); // 有限的递归
    }

    public static void main(String[] args) {
        System.out.println(test(10));
    }
}