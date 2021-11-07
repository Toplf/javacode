package com.luof.base.syntax;
/*
*
break语句用于终止某个语句块的执行
 		{    ……
		     break;
		     ……
		}
break语句出现在多层嵌套的语句块中时，可以通过标签指明要终止的是哪一层语句块
	label1: {   ……
	label2:	{   ……
	label3:	{   ……
               break label2;
               ……
            }
              }
     }

continue 语句
continue语句用于跳过某个循环语句块的一次执行
continue语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环


return：并非专门用于结束循环的，它的功能是结束一个方法。当一个方法执行到一个return语句时，这个方法将被结束。

与break和continue不同的是，return直接结束整个方法，不管这个return处于多少层循环之内

break只能用于switch语句和循环语句中。
continue 只能用于循环语句中。
二者功能类似，但continue是终止本次循环，break是终止本层循环。
break、continue之后不能有其他的语句，因为程序永远不会执行其后的语句。
标号语句必须紧接在循环的头部。

*
* */

class LoopTest0010 {

    public static void main(String[] args) {
        l1 : for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue l1;
                }
            }
            System.out.println(i + "是质数");
        }
    }
}

class LoopTest009 {

    public static void main(String[] args) {
        l1 : for (int i = 0; i < 10; i++) {
            l2 : for (int j = 0; j < 5; j++) {
                if (j % 2 != 0) {
                    //continue; // 默认中断离我最近的循环, 内循环的当次循环, 直接进入下一次
                    continue l1; // 中断的是指定标签对应的循环的当次循环, 直接进行
                    //System.out.println("after continue");
                }
                System.out.println("j : " + j);
            }
            System.out.println("i : " + i);
        }
    }
}

class LoopTest008 {

    public static void main(String[] args) {
        // continue中断当次循环, 直接进入下一次循环(迭代语句)
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i : " + i);
        }
    }
}

class LoopTest007 {

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean flag = true; // 假定i是质数
            // 从2~i-1中任意找到一个反例, 就可以推翻假设
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // 测试某个值是否可以整除i
                    flag = false; // 推翻假设
                    break; // 找到一个反例就足矣, 直接结束找反例的过程
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}

class LoopTest006 {

    public static void main(String[] args) {
        l1 : for (int i = 0; i < 10; i++) {
            l2 : for (int j = 0; j < 5; j++) {
                System.out.println("j : " + j);
                if (j == 2) {
                    //break; // 默认中断离我最近的循环
                    break l1; // 中断的是指定标签对应的语句块.
                }
            }
            System.out.println("i : " + i);
        }
    }
}

class LoopTest005 {

    public static void main(String[] args) {
        l1 : {
            System.out.println("1");
            if (1 == 1) {
                break l1;
            }
            System.out.println("2");
        }

        System.out.println("3");
    }
}

class LoopTest004 {

    public static void main(String[] args) {
        // break中断循环, 中断力度很大
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 3) {
                break; // 中断某个语句块, 中断循环
            }
        }
        System.out.println("after loop");
    }
}

class LoopTest003 {

    public static void main(String[] args) {
        // 死循环, 无限循环
        boolean loopFlag = true;
        while (loopFlag) {
            System.out.println("while1");
        }
        System.out.println("after loop");

        do {
            System.out.println("do while");
        } while (loopFlag);

        System.out.println("after loop2");

		/*
		for (int i = 0; i < 100; ) {
		}
		for (int i = 0; ; i++) {
		}
		for (int i = 0; true; i++) {
		}
		for (;;) {
		}
		*/
    }
}

class LoopTest002 {

    public static void main(String[] args) {
        // 区别, while 和 do while 循环次数不确定, 适用于循环次数不确定的循环
        boolean loopFlag = true;
        while (loopFlag) { // 执行0~N次
            System.out.println("循环体1");
        }

        do { // 执行1-N次, 至少有一次
            System.out.println("循环体2");
        } while (loopFlag);

        // for 循环天生的适用于控制循环次数
        for (int i = 0; i < 9; i++) {
            System.out.println("循环体3");
        }
    }
}


public class LoopTest1 {

    public static void main(String[] args) {
        //求1000以内所有质数的平均值
        int sum = 0;
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            boolean flag = true; // 假定i是质数
            // 从2~i-1中任意找到一个反例, 就可以推翻假设
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // 测试某个值是否可以整除i
                    flag = false; // 推翻假设
                }
            }
            if (flag) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }

        int avg = sum / count;
        System.out.println("avg : " + avg);
    }
}