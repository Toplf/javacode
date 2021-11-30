package stu08;

class ArrayExer4 {
	
	public static void main(String[] args) {
		// ����һ��36��Ԫ�ص��ַ�����, ǰ26������26����д��ĸ, ��10�����������ַ�'0'~'9'
		char[] arr = new char[36];
		for (int i = 0; i < arr.length; i++) {
			if (i < 26) {
				arr[i] = (char)('A' + i);
			} else {
				arr[i] = (char)('0' + i - 26);
			}
		}
		
		// ����
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

class ArrayExer3 {
	
	public static void main(String[] args) {
		// ����һ��36��Ԫ�ص��ַ�����, ǰ26������26����д��ĸ, ��10�����������ַ�'0'~'9'
		char[] arr = new char[36];
		for (int i = 0; i < 26; i++) {
			arr[i] = (char)('A' + i);
		}
		for (int i = 26; i < arr.length; i++) {
			arr[i] = (char)('0' + i - 26);
		}
		
		// ����
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

class ArrayExer2 {
	
	public static void main(String[] args) {
		// ����һ��26��Ԫ�ص��ַ�����, ����26����д��ĸ
		char[] arr = new char[26];
		char ch = 'A';
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ch++;
		}
		// ����
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}

public class ArrayExer {
	
	public static void main(String[] args) {
		// ����һ������, ����������պͽ��������
		// 1978, 6, 9, 2019, 12, 3
		int[] arr = new int[6];
		arr[0] = 1978;
		arr[1] = 6;
		arr[2] = 9;
		arr[3] = 2019;
		arr[4] = 12;
		arr[5] = 3;
		
		System.out.println("���� : " + arr[0] + "��" + arr[1] + "��" + arr[2] + "��");
		System.out.println("���� : " + arr[3] + "��" + arr[4] + "��" + arr[5] + "��");
		
	}
}