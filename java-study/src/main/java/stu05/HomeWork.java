package stu05;

class Work4 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                //if (第一行或最后行或第一列或最后列) {
                if (i == 0 || i == n - 1 || j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class Work3 {

    public static void main(String[] args) {
		/*
		打印高度为n的等腰3角形
						i 		空格     *
			*			0		 4		 1
		   ***			1		 3		 3
		  *****			2		 2		 5
		 *******		3		 1       7
		*********		4		 0       9
		*/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class HomeWork2 {

    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int day = Integer.parseInt(args[2]);

        int days = day;
        switch (month) {
            case 12 :
                days += 30;
            case 11 :
                days += 31;
            case 10 :
                days += 30;
            case 9 :
                days += 31;
            case 8 :
                days += 31;
            case 7 :
                days += 30;
            case 6 :
                days += 31;
            case 5 :
                days += 30;
            case 4 :
                days += 31;
            case 3 :
                days += 28;
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days++;
                }
            case 2 :
                days += 31;
        }
        System.out.println("经过了" + days + "天");
    }
}

public class HomeWork {

    public static void main(String[] args) {
        //接收命令行参数年、月、日，判断这一天是当年的第几天
		/*
		注：判断一年是否是闰年的标准：
		   1）可以被4整除，但不可被100整除
		   2）可以被400整除
		*/
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int day = Integer.parseInt(args[2]);

        int days = 0;

        switch (month) {
            case 1 :
                break;
            case 2 :
                days += 31;
                break;
            case 3 :
                days += 31 + 28;
                break;
            case 4 :
                days += 31 + 28 + 31;
                break;
            case 5 :
                days += 31 + 28 + 31 + 30;
                break;
            case 6 :
                days += 31 + 28 + 31 + 30 + 31;
                break;
            case 7 :
                days += 31 + 28 + 31 + 30 + 31 + 30;
                break;
            case 8 :
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9 :
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10 :
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11 :
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12 :
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
        }
        days += day;

        if (month > 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ) {
            days++;
        }

        System.out.println("经过了" + days + "天");
    }
}