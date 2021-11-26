class OperatorExer2 {

	public static void main(String[] args) {
		//获取三个数中的较大数
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);

		// 找出n1和n2中的最大值
		int max = n1 > n2 ? n1 : n2;
		max = max > n3 ? max : n3;
		System.out.println("最大值 : " + max);
	}
}

public class OperatorExer {

	public static void main(String[] args) {
		//获取三个数中的较大数
		int n1 = 10;
		int n2 = 20;
		int n3 = 50;

		// 找出n1和n2中的最大值
		int max = n1 > n2 ? n1 : n2;
		max = max > n3 ? max : n3;
		System.out.println("最大值 : " + max);
	}
}