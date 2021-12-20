package stu19.string;

import org.junit.Test;

/**
 * StringBuilder : 内容可以改变的Unicode字符序列, 任何的修改都不会产生新对象, 内部的数据变化. 效率高. 是一个容器,
 * 是一个可以保存字符的容器. 底层仍然使用数组.
 *
 * StringBuilder append(...) 在字符串末尾追加任意数据. StringBuilder insert(int index, ...)
 * 在指定位置处插入任意新数据 StringBuilder delete(int begin, int end) 删除指定区间的所有字符
 *
 * StringBuffer是线程安全的, 效率低 StringBuilder是线程不安全的, 效率高.
 */
public class StringBufferTerst {

	@Test
	public void test3() {
		String text = "";
		long startTime = 0L;
		long endTime = 0L;
		StringBuffer buffer = new StringBuffer("");
		StringBuilder builder = new StringBuilder("");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			buffer.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer的执行时间：" + (endTime - startTime));
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			builder.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder的执行时间：" + (endTime - startTime));
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {
			text = text + i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("String的执行时间：" + (endTime - startTime));

	}

	@Test
	public void test2() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("abc").append(100).append(false).append(3.22).append('X').insert(3, "一些汉字").insert(0,true);
		System.out.println(stringBuilder);
		// 声明3个字符串, 用第一个为参数创建StringBuffer对象, 第2个串串接在末尾, 再把第3个串插入到最前面.
		String s1 = "abcdef";
		String s2 = "12423423";
		String s3 = "来些汉字";
		StringBuffer stringBuffer = new StringBuffer(s1);
		stringBuffer.append(s2).insert(0, s3);
		System.out.println(stringBuffer);
	}

	@Test
	public void test1() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("abc");
		stringBuilder.append(100);
		stringBuilder.append(false);
		stringBuilder.append(3.22);
		stringBuilder.append('X'); // "abc100false3.22X"

		stringBuilder.append('Y'); // 会引起扩容, 新容量 = 老容量*2+2

		stringBuilder.insert(3, "一些汉字"); // "abc一些汉字100false3.22X"
		stringBuilder.insert(0, true); // "trueabc一些汉字100false3.22X"

		stringBuilder.setCharAt(1, 'R'); // "tRueabc一些汉字100false3.22X"
		stringBuilder.delete(4, 7); // "tRueabc一些汉字100false3.22X"

		String string = stringBuilder.toString();
		System.out.println(string);
	}
}
