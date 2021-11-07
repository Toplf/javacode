package com.luof.base.syntax;

class LoopTest17 {


    public static void main(String[] args) {
        // 找出100以内的所有质数
        for (int j = 2; j < 100; j++) {
            // 判断j是否是质数 只能被1和自身整除
            boolean flag = true; // 假定j就是质数
            // 尝试推翻, 找反例, 从2~j-1中找任意数, 如果j能被某个任意数整除了, j就不是质数.
            for (int i = 2; i < j; i++) { // 循环中i就是用于测试的数
                if (j % i == 0) { // 尝试让j被i整除, 如果整除了.
                    flag = false; // 推翻假设, j不是质数
                }
            }
            // flag中保存的就是结论
            if (flag) {
                System.out.println(j + "是质数");
            }
        }
    }
}

class LoopTest16 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // 判断n是否是质数. 只能被1和自身整除
        boolean flag = true; // 假定n就是质数
        // 尝试推翻, 找反例, 从2~n-1中找任意数, 如果n能被某个任意数整除了, n就不是质数.
        for (int i = 2; i < n; i++) { // 循环中i就是用于测试的数
            if (n % i == 0) { // 尝试让n被i整除, 如果整除了.
                flag = false; // 推翻假设, n不是质数
            }
        }
        // flag中保存的就是结论
        if (flag) {
            System.out.println(n + "是质数");
        }

    }
}

class LoopTest15 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

class LoopTest14 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < -2 * i + 15; j++) { // 内循环的次数 = -2 * i + 15, 是一个负斜率, 内循次数越来越少
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class LoopTest13 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1 * i + 2; j++) { // 内循环次数= 1 * i + 2, 是一个正斜率, 内循环次数越来越多
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class LoopTest12 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) { // 外循环控制行. n行
            for (int j = 0; j < m; j++) { // 内循环控制列, m列
                System.out.print("j");
            }
            System.out.println();
        }
    }
}

class LoopTest11 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // 外循环控制行, 有5行
            for (int j = 0; j < 3; j++) { // 内循环控制列, 有3列
                System.out.print("j"); // 执行了3次 * 5 = 15次
            }
            System.out.println(); // 受外循环控制, 直接输出一个换行
        }
    }
}

class LoopTest10 {

    public static void main(String[] args) {
        // 求100以内所有能被3整除的数的和
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("i : " + i);
                sum += i; // 有条件求和
                count++; // 有条件计数
            }
        }
        // 统计运算(求和, 计数, 最大值, 最小值等) 结果只有一个, 必须在循环结束以后输出.
        System.out.println("sum : " + sum);
        // 求100以内所有能被3整除的数的平均值
        int avg = sum / count;
        System.out.println("avg : " + avg);

    }
}

class LoopTest9 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int result = 0;
        for (int i = 0; i < n; i++) { // 循环体执行了次数 : n - 0
            result += i;
        }
        System.out.println("result : " + result);
    }
}

class LoopTest8 {
    // 使用for循环打印20*8的矩形, 和n*8的矩形
    public static void main(String[] args) {
		/*
		for (初始化语句A; 循环条件B; 迭代语句C) {
			循环体D;
		}
		A B D C B D C B D ... C B D ... B
		迭代语句C 是每次循环的开始
		*/
        int result = 0;

        for (int i = 1; i <= 5; i++) {
            result += i;
        }
        System.out.println("result : " + result);
        //System.out.println("i : " + i);
    }
}

class LoopTest7 {

    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("##");
        } while (n == 10);

        while (n == 10) {
            System.out.println("**");
        }
    }
}

class LoopTest6 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int result = 0;

        int i = 0;
        do {
            result += i;
            i++;
        } while (i < n);

        System.out.println("result : " + result);
        System.out.println("i : " + i);
    }
}

class LoopTest5 {

    public static void main(String[] args) {
		/*
		do while
		初始化语句
		do {
			循环体;
			迭代语句;
		} while (循环条件);
		*/
        int result = 0;

        int i = 1;
        do {
            result += i;
            i++;
        } while (i <= 5);

        System.out.println("result : " + result);
        System.out.println("i : " + i);

    }
}

class LoopTest4 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int result = 0;

        int i = 0;
        while (i < n) { // 命门在条件右面, 强调一件事, 循环因子变量名必须用i
            result += i;
            i++;
        }
        System.out.println("result : " + result);
        System.out.println("i : " + i);
    }
}

class LoopTest3 {

    public static void main(String[] args) {
        int result = 0;
        int i = 0;
        while (i < 10) { //循环次数: 如果初始值为0, 没有=, 是最简单的.循环就是10次
            result += i;
            i++;
        }
        System.out.println("result : " + result);
        System.out.println("i : " + i);
    }
}

class LoopTest2 {

    public static void main(String[] args) {
        int result = 0;

        int i = 20;
        while (i <= 100) { // 循环次数: 条件右面的值 - 初值, 如果有=再加1
            result += i;
            i++;
        }

        System.out.println("result : " + result);
        System.out.println("i : " + i);
    }
}

public class LoopTest {

    public static void main(String[] args) {
        // 循环 : 在某种条件满足的情况下, 反复执行特定的代码的功能.

        // 4个组成部分
        // 1) 初始化语句, 作用是作准备工作.
        // 2) 循环条件部分, 作用是控制循环的生死
        // 3) 循环体部分, 被多次执行的代码
        // 4) 迭代部分, 作用是使循环趋于结束, 如果没有迭代, 循环是无限.


        // while 循环
		/*
		初始化语句
		while (循环条件) {
			循环体;
			迭代语句;
		}
		*/
        int result = 0;

        int i = 1; // 循环因子, 初始化
        while (i <= 5) { // 条件和因子也有关系
            result += i; // 循环体
            i++; // 迭代语句
        }

        System.out.println("result : " + result);
        System.out.println("i : " + i);
    }
}
