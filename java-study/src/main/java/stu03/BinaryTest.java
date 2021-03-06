package stu03;
class BinaryTest2 {

	public static void main(String[] args) {
		int n1 = 0xA5; // 1010 0101
		int n2 = 0xC7; // 1100 0111
		// 0000 0000 0000 0000 0000 0000 1010 0101 &
		// 0000 0000 0000 0000 0000 0000 1100 0111 =
		// 0000 0000 0000 0000 0000 0000 1000 0101 => 0x85 => 16*8 + 5 = 133
		System.out.println(n1 & n2);
		// 0000 0000 0000 0000 0000 0000 1010 0101 |
		// 0000 0000 0000 0000 0000 0000 1100 0111 =
		// 0000 0000 0000 0000 0000 0000 1110 0111 => 0xE7 => 14*16 + 7 = 231
		System.out.println(n1 | n2);
		// 0000 0000 0000 0000 0000 0000 1010 0101 ^
		// 0000 0000 0000 0000 0000 0000 1100 0111 =
		// 0000 0000 0000 0000 0000 0000 0110 0010 => 0x62 => 98
		System.out.println(n1 ^ n2);

		// 0000 0000 0000 0000 0000 0000 1010 0101
		// 1111 1111 1111 1111 1111 1111 0101 1010 => 这是一个负数, 负多少?
		// -1 => 1111 1111 1111 1111 1111 1111 0101 1001
		// 取反 => 0000 0000 0000 0000 0000 0000 1010 0110 => 0xA6 => 166
		System.out.println(~n1); // -166
	}
}

public class BinaryTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0x10;// 0001 0000 => 0000 0100
		//int n3 = 08; // 0开始表示这是8进制.
		n1 = n1 << 3;
		System.out.println(n1);

		System.out.println(n2 >> 2);

		System.out.println(-1 >> 5); // 有符号右移
		System.out.println(-1 >>> 1); // 无符号右移
	}
}