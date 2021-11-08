package com.luof.base.type;

public class StudentTest {

    public static void main(String[] args) {
        Student[] stuArr = new Student[20];
        String[] names1 = {"王", "李", "赵", "张", "杨", "刘", "邓"};
        String[] names2 = {"强", "伟", "丽", "芳", "刚", "建", "光", "娜", "锋", "超", "洋"};
        for (int i = 0; i < stuArr.length; i++) {
            int id = i + 1;
            int index1 = (int)(Math.random() * names1.length);
            int index2 = (int)(Math.random() * names2.length);
            String name = names1[index1] + names2[index2];
            int grade = (int)(Math.random() * 6 + 1);
            double score = (int)(Math.random() * 101);
            stuArr[i] = new Student(id, name, grade, score);
        }

        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");
        // 取3年级同学
        // 1) 创建新数组, 容量和老数组一样
        Student[] newArr = new Student[stuArr.length]; // 新数组是结构良好的, 前面都是连续的有效元素, 后面都是连续的空洞
        // 2) 声明计数器变量, 初值为0
        // 计数器功能 : 计数, 新数组插入元素的下标控制
        int count = 0;
        // 3) 遍历老数组, 找满足条件的元素
        for (int i = 0; i < stuArr.length; i++) {
            // 4) 如果找到了满足条件的元素
            if (stuArr[i].getGrade() == 3) {
                // 5) 把元素保存在新数组中, 下标就是计数器的当前值
                newArr[count] = stuArr[i];
                // 6) 调整计数器
                count++;
            }
        }
        // 7) 创建最终数组, 长度是计数器
        Student[] finalArr = new Student[count]; // 最终数组就是完美数组, 全是有效元素, 没有空洞
        // 8) 循环遍历新数组, 把所有有效元素复制到最终数组中, 依次复制, 复制计数器个
        for (int i = 0; i < count; i++) {
            finalArr[i] = newArr[i];
        }

        // 遍历最终数组
        for (Student tmp : finalArr) {
            System.out.println(tmp.say());
        }

    }

    public static void main4(String[] args) {
        Student[] stuArr = new Student[20];
        String[] names1 = {"王", "李", "赵", "张", "杨", "刘", "邓"};
        String[] names2 = {"强", "伟", "丽", "芳", "刚", "建", "光", "娜", "锋", "超", "洋"};
        for (int i = 0; i < stuArr.length; i++) {
            int id = i + 1;
            int index1 = (int)(Math.random() * names1.length);
            int index2 = (int)(Math.random() * names2.length);
            String name = names1[index1] + names2[index2];
            int grade = (int)(Math.random() * 6 + 1);
            double score = (int)(Math.random() * 101);
            stuArr[i] = new Student(id, name, grade, score);
        }

        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");
        // 学生对象数组扩容
        Student[] newArr = new Student[stuArr.length * 3 / 2];
        for (int i = 0; i < stuArr.length; i++) {
            newArr[i] = stuArr[i];
        }
        stuArr = newArr;
        // 遍历
        for (Student tmp : stuArr) {
            if (tmp != null) {
                System.out.println(tmp.say());
            } else {
                System.out.println(tmp);
            }
        }
        System.out.println("****************************************************************");
    }

    public static void main3(String[] args) {
        Student[] stuArr = new Student[20];
        String[] names1 = {"王", "李", "赵", "张", "杨", "刘", "邓"};
        String[] names2 = {"强", "伟", "丽", "芳", "刚", "建", "光", "娜", "锋", "超", "洋"};
        for (int i = 0; i < stuArr.length; i++) {
            int id = i + 1;
            int index1 = (int)(Math.random() * names1.length);
            int index2 = (int)(Math.random() * names2.length);
            String name = names1[index1] + names2[index2];
            int grade = (int)(Math.random() * 6 + 1);
            double score = (int)(Math.random() * 101);
            stuArr[i] = new Student(id, name, grade, score);
        }

        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");
        // 把对象数组也缩减一半
        Student[] newArr = new Student[stuArr.length / 2];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = stuArr[i];
        }
        stuArr = newArr;

        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");
    }

    public static void main2(String[] args) {
        Student[] stuArr = new Student[20];
        String[] names1 = {"王", "李", "赵", "张", "杨", "刘", "邓"};
        String[] names2 = {"强", "伟", "丽", "芳", "刚", "建", "光", "娜", "锋", "超", "洋"};
        for (int i = 0; i < stuArr.length; i++) {
            int id = i + 1;
            int index1 = (int)(Math.random() * names1.length);
            int index2 = (int)(Math.random() * names2.length);
            String name = names1[index1] + names2[index2];
            int grade = (int)(Math.random() * 6 + 1);
            double score = (int)(Math.random() * 101);
            stuArr[i] = new Student(id, name, grade, score);
        }

        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");

        // 尝试把学生对象的数组也反转了
        for (int i = 0; i < stuArr.length / 2; i++) {
            // 交换i下标和length - 1 - i下标
            Student tmp = stuArr[i];
            stuArr[i] = stuArr[stuArr.length - 1 - i];
            stuArr[stuArr.length - 1 - i] = tmp;
        }
        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");
    }

    public static void main1(String[] args) {
        Student[] stuArr = new Student[20];
        String[] names1 = {"王", "李", "赵", "张", "杨", "刘", "邓"};
        String[] names2 = {"强", "伟", "丽", "芳", "刚", "建", "光", "娜", "锋", "超", "洋"};
        for (int i = 0; i < stuArr.length; i++) {
            int id = i + 1;
            int index1 = (int)(Math.random() * names1.length);
            int index2 = (int)(Math.random() * names2.length);
            String name = names1[index1] + names2[index2];
            int grade = (int)(Math.random() * 6 + 1);
            double score = (int)(Math.random() * 101);
            stuArr[i] = new Student(id, name, grade, score);
        }

        // 遍历
        for (Student tmp : stuArr) {
            System.out.println(tmp.say());
        }
        System.out.println("****************************************************************");
        // 找出谁最牛
        Student maxStudent = stuArr[0];
        for (Student tmp : stuArr) {
            if (tmp.getScore() > maxStudent.getScore()) {
                maxStudent = tmp;
            }
        }
        System.out.println("最牛 : " + maxStudent.say());
        // 找出谁最牛, 找下标
        int maxIndex = 0;
        for (int i = 0; i < stuArr.length; i++) {
            if (stuArr[i].getScore() > stuArr[maxIndex].getScore()) { // 如果i位置的学生的分数大于maxIndex位置的学生的分数
                maxIndex = i;
            }
        }
        System.out.println("最牛 : " + stuArr[maxIndex].say());
        // 找出3年级谁最牛, 用下标
        int maxIndex3 = -1;
        for (int i = 0; i < stuArr.length; i++) {
            if (stuArr[i].getGrade() == 3) {
                if (maxIndex3 == -1) {
                    maxIndex3 = i;
                } else if (stuArr[i].getScore() > stuArr[maxIndex3].getScore()) {
                    maxIndex3 = i;
                }
            }
        }
        if (maxIndex3 != -1) {
            System.out.println("3年级最牛 : " + stuArr[maxIndex3].say());
        } else {
            System.out.println("没有3年级");
        }
    }
}
