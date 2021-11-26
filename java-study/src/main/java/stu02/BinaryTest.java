package stu02;
public class BinaryTest {

	public static void main(String[] args) {
		byte b1 = (byte)0x80;// 0000 0000 0000 0000 0000 0000 1000 0000 
		byte b2 = 0x7F; 	 // 0000 0000 0000 0000 0000 0000 0111 1111
		System.out.println(b1);
		System.out.println(b2);

		short s1 = (short)0x8000; // 0000 0000 0000 0000 1000 0000 0000 0000
		short s2 = 0x7FFF;
		System.out.println(s1);
		System.out.println(s2);

		int i1 = 0x80000000;
		int i2 = 0x7FFFFFFF;
		System.out.println(i1);
		System.out.println(i2);

		long l1 = 0x8000000000000000L;
		long l2 = 0x7FFFFFFFFFFFFFFFL;
		System.out.println(l1);
		System.out.println(l2);

		char c1 = 0x0000;
		char c2 = 0xFFFF;
		System.out.println((int)c1);
		System.out.println((int)c2);

		//byte n3 = (byte)-0x80; // 0000 0000 0000 0000 0000 0000 1000 0000
		//System.out.println(n3);
	}
}