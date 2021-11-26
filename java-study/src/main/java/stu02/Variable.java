public class Variable {

	//1 写一个Variable类，main方法中使用double类型声明var1和var2变量，
	//然后用var2保存var1与var2之商。
	//2 声明字符串变量str，用str串接的形式表示上述计算过程并打印输出结果。
	public static void main(String[] args) {
		double var1 = 1000;
		double var2 = 12.0;

		String str = var1 + " / " + var2 + " = ";	// 能用变量的地方绝不用常量.

		var2 = var1 / var2;
		System.out.println(var1);
		System.out.println(var2);
		//String str = var1 + " / " + (var1 / var2) + " = " + var2;
		str = str + var2;

		System.out.println(str);
	}
}