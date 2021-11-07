package com.luof.base.syntax;

class LoopExer10 {

    public static void main(String[] args) {
        // 找出100~200之间的所有质数, 要求外循环用i, 内循环用j
        for (int i = 100; i < 200; i++) {
            boolean flag = true;
            // 尝试推翻, 让i尝试去整除2~i-1中所有数, 如果发现有能被整除的情况存在, 则i不是质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}

class LoopExer9 {

    public static void main(String[] args) {
        // 打印n*m的矩形
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class LoopExer8 {

    public static void main(String[] args) {
        // 打印20*8的矩形
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class LoopExer7 {

    public static void main(String[] args) {
        // 求1000以内所有能被13整除的数的平均值, 并打印输出这些数.
        int sum = 0; // 求和
        int count = 0; // 计数器
        for (int i = 0; i < 1000; i++) {
            if (i % 13 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
            //int avg = sum / count;
        }

        int avg = sum / count;
        System.out.println("avg : " + avg);
    }
}

class LoopExer6 {

    public static void main(String[] args) {
        // 打印n*8的矩形
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            System.out.println("********");
        }
    }
}

class LoopExer5 {

    public static void main(String[] args) {
        // 打印20*8的矩形
        for (int i = 0; i < 20; i++) {
            System.out.println("********");
        }
    }
}

class LoopExer4 {

    public static void main(String[] args) {
        // 打印n*8的矩形
        int n = Integer.parseInt(args[0]);

        int i = 0;
        do {
            System.out.println("********");
            i++;
        } while (i < n);
    }
}

class LoopExer3 {

    public static void main(String[] args) {
        // 打印20*8的矩形

        int i = 0;
        do {
            System.out.println("********");
            i++;
        } while (i < 20);
    }
}

class LoopExer2 {

    public static void main(String[] args) {
        // 打印n*8的矩形
        int n = Integer.parseInt(args[0]);

        // 初始语句
        int i = 0;
        while (i < n) { // 循环条件
            System.out.println("********"); // 循环体, 被多次执行的
            i++; // 迭代
        }
    }
}

public class LoopExer {

    public static void main(String[] args) {
        // 打印20*8的矩形
        // 初始语句
        int i = 0;
        while (i < 20) { // 循环条件
            System.out.println("********"); // 循环体, 被多次执行的
            i++; // 迭代
        }
    }
}
