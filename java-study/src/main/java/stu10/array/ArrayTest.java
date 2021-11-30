package stu10.array;

//增强型for, 也称为foreach
//for (元素数据类型 临时变量 : 数组名) {
// 处理临时变量
//}
public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }

        // 遍历
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        //0 1 2  3  4 5 6  7
        //8 4 16 15 7 3 12 11
        //取子数组, 取所有奇数
        //1) 创建新数组, 容量和老数组一样
        int[] newArr = new int[arr.length];
        //2) 声明计数器, 初值是0
        int count = 0;
        // 它有两个作用 : 1) 计数, 2) 控制有效元素插入到新数组的下标
        //3) 循环遍历老数组 找有效元素
        for (int i = 0; i < arr.length; i++) {
            // 4) 如果找到了有效元素
            if (arr[i] % 2 != 0) {
                // 5) 把有效元素保存到新数组中, 下标由计数器的当前值控制
                newArr[count] = arr[i];
                // 6) 调整计数器
                count++;
            }
        }
        //7) 创建最终数组, 长度由计数器控制
        int[] finalArr = new int[count];
        //8) 循环依次把新数组中的所有有效元素复制到最终数组中
        for (int i = 0; i < count; i++) {
            finalArr[i] = newArr[i];
        }
        // 遍历最终数组
        for (int tmp : finalArr) {
            System.out.print(tmp + " ");
        }
        System.out.println();

    }

    public static void main5(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }

        // 遍历
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        //0 1 2  3  4 5 6  7
        //8 4 16 15 7 3 12 11
        //扩容
        //1) 创建新数组
        int[] newArr = new int[(int)(arr.length * 1.5)];
        //2) 依次复制元素
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //3) 老引用指向新数组
        arr = newArr;
        // 遍历
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println();
    }

    public static void main4(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }

        // 遍历
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        //0 1 2  3  4 5 6  7
        //8 4 16 15 7 3 12 11
        //数组的缩减
        //arr.length /= 2
        //1) 创建新数组
        int[] newArr = new int[arr.length / 2];
        //2) 依次把老数组中的相应的数据复制到新数组中
        for (int i = 0; i < newArr.length; i++) { // 以短的为准
            newArr[i] = arr[i];
        }
        //3) 老引用指向新数组, 老数组变垃圾
        arr = newArr;
        // 遍历
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println();

    }

    public static void main3(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }

        // 遍历
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        //0 1 2  3  4 5 6  7
        //8 4 16 15 7 3 12 11
        //反转数组
        for (int i = 0; i < arr.length / 2; i++) {
            // 交换i位置和length - 1 - i位置的值
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }

        // 遍历
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println();

    }

    public static void main2(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }

        // 遍历
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println();
        //0  1 2  3 4 5  6 7
        //14 7 15 0 0 19 4 13
        //找最大值
        int max = arr[0];
        for (int tmp : arr) {
            if (tmp > max) {
                max = tmp;
            }
        }
        System.out.println("max : " + max);
        //找最大值, 找下标
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) { // 如果i位置元素的值大于maxIndex位置元素的值
                maxIndex = i;
            }
        }
        System.out.println("max : " + arr[maxIndex]);
        // 找能被7整除的数的最大值, 用下标的方式
        int maxIndex7 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 7 == 0) {
                if (maxIndex7 == -1) {
                    maxIndex7 = i;
                } else if (arr[i] > arr[maxIndex7]) {
                    maxIndex7 = i;
                }
            }
        }
        if (maxIndex7 == -1) {
            System.out.println("没有能被7整除的数");
        } else {
            System.out.println("能被7整除的数最大 : " + arr[maxIndex7]);
        }
    }

    public static void main1(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 20);
        }

        // 遍历
        for (int i = 0; i < arr.length; i++) { // 经典for循环
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 遍历2
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            System.out.print(tmp + " ");
        }
        System.out.println();
        // 增强型for, 也称为foreach
        //for (元素数据类型 临时变量 : 数组名) {
        // 处理临时变量
        //}

        for (int tmp : arr) { // 增强for很安全, 因为它是只读访问.
            System.out.print(tmp + " ");
        }
        System.out.println();

		/*
		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			tmp *= 10;
			System.out.print(tmp + " ");
		}
		System.out.println();
		*/

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
