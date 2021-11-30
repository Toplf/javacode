package stu11.array;

/**
 * 二维数组 : 数组的数组, 元素都是子数组
 */
public class ArrayArrayTest {

    public static void main(String[] args) {
        // 创建一个拥有10个子数组的二维数组, 每个子数组的长度是随机的2~5, 里面的数据是随机的100以内的整数
        int[][] arrarr = new int[10][];
        for (int i = 0; i < arrarr.length; i++) {
            int randLen = (int)(Math.random() * 4 + 2);
            arrarr[i] = new int[randLen];
            for (int j = 0; j < arrarr[i].length; j++) {
                arrarr[i][j] = (int)(Math.random() * 100);
            }
        }
        // 遍历
        for (int[] child : arrarr) {
            for (int tmp : child) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
        // 找出最大值
        int max = arrarr[0][0];
        for (int[] child : arrarr) {
            for (int tmp : child) {
                if (tmp > max) {
                    max = tmp;
                }
            }
        }
        System.out.println("max : " + max);
    }

    public static void main1(String[] args) {
        int[][] arrarr = new int[5][]; // 创建了具有5个子数组的二维数组, 子数组都是空
        for (int i = 0; i < arrarr.length; i++) {
            arrarr[i] = new int[i + 2]; // 每个子数组必须创建新的, 否则是空洞
            for (int j = 0; j < arrarr[i].length; j++) { // 子数组的长度有可能不同, 动态根据子数组的长度来遍历
                arrarr[i][j] = (int)(Math.random() * 100);
            }
        }

        // 遍历二维数组
        for (int[] child : arrarr) {
            for (int tmp : child) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
        // 求和
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arrarr.length; i++) {
            count += arrarr[i].length;
            for (int j = 0; j < arrarr[i].length; j++) {
                sum += arrarr[i][j];
            }
        }
        // 求平均值
        int avg = sum / count;
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}
