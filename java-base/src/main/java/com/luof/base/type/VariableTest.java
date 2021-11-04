package com.luof.base.type;


/*public class VariableTest {
    public static  void main(String[] args){
        int var1;
        var1 = 10;
        System.out.println(var1);
        int var2 = var1;
        System.out.println(var2);
        var2 = var1 + var2;
        System.out.println(var2);

    }
}*/

public class VariableTest {

    public static void main(String[] args) {
        int a;
        a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);

        int b = a;
        System.out.println(b);
        a = a * b; // 赋值语句的从右向左的思维. 右面的值必须是确定的时候, 才能给左边的变量写入.
        System.out.println(a);
        // 变量.  常量: 字面量和被final修饰的量.

        //50 = 50; =左面必须是变量.
    }
}


class VariableTest2 {

    public static void main(String[] args) {
        // 整数字面量默认使用int型来保存. 整数地位高于浮点数
        // 浮点数字面量默认使用double型来保存.
        byte b1 = 10; // 编译器检查常量时, 发现它的值在byte范围内. 作优化处理.
        byte b2 = 20;
        b2 = b1;

        short s1 = 30;
        short s2 = 40;
        s2 = s1;

        int i1 = 50;
        int i2 = 600;

        i1 = b1;
        //b1 = i2; // 不能直接赋值, 原因是左面的变量的范围小于右面的值
        b1 = (byte)i2; // 如果使用强制类型转换就可以把大的存到小的里面
        System.out.println(b1);

        long l1 = 5000000000L; // 后缀L的作用是告诉编译器, 这个整数字面量不要使用默认的int型来保存, 要使用8字节的Long型来保存
        l1 = i1;
        i1 = (short)l1; // 左面的变量的范围要大于等于右面的值的范围.

        double d1 = 3.22;
        l1 = (long)d1;

        float f1 = 2.12F; // F的作用是告诉编译器, 此字面量使用float型来保存.
        float f2 = (float)0.32;

        l1 = (long)f1; // 范围大的量值不能直接给范围小的变量赋值.

        f2 = l1;

        d1 = f1; // float
        d1 = i1; // int
        d1 = l1; // long
        // 兼容性最好的是double, 最差的是byte
        // 范围从小到大排序:
        //byte < short < int < long < float < double
    }
}



class VariableTest3 {

    public static void main(String[] args) {
        byte b1 = 10;
        short s1 = 20;
        // b1 + s1是两个整数作运算, 结果总是int型.
        // 任意非long整数作运算, 结果总是int型
        s1 = (short)(b1 + s1);
        int i1 = 30;
        b1 = (byte)(s1 + i1);

        i1 = s1 * b1;

        long l1 = 40L;

        // 如果有不同类型的混合运算, 结果总是范围最大的那个类型
        i1 = (int)(l1 / b1 + i1 - s1);
        float f1 = 20.22F;

        //l1 = f1 * l1 + i1;
        double d1 = 2.33D;

        f1 = (float)d1 / i1 + s1;
    }
}


class VariableTest4 {

    public static void main(String[] args) {
        //1) 先声明, 后使用.
		/*
		System.out.println(n);
		int n = 20;
		*/
        //3) 变量必须要有名字和数据类型.
        //4) 变量有其作用范围, (变量的声明语句所隶属的一对{}内有效)
		/*
		{
			int n = 20;
		}
		System.out.println(n);
		*/
        //5) 变量还有其数据范围, (原因是空间有限)

        //2) 变量必须初始化
        int n; // 此时n代表的空间中有值, 是未知危险值!!!!, 所以应该马上对其进行初始化.
        //System.out.println(n);
        n = 20; // 初始化赋值就是刚声明好就马上赋的值
        n = 30; // 普通赋值
        System.out.println(n);

        int n2 = 40; // 这种写法最好, 声明和初始化合体.
    }
}


