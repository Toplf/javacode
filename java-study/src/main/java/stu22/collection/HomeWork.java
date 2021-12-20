package stu22.collection;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class HomeWork {

	@Test
	public void test3() {
		// 给定一个字符串, 统计每个字符出现的次数
		String string = "ablakjdsflkajf;alksjf;alksjf我是汉字,qlkfjdakjflskj我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字";
		int[] arr = new int[65535];
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println((char)i + " : " + arr[i]);
			}
		}
	}

	@Test
	public void test2() {
		//给定一个字符串, 统计每个字符出现的次数
		String string = "ablakjdsflkajf;alksjf;alksjf我是汉字,qlkfjdakjflskj我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字我是汉字";
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			Integer count = map.get(ch);
			if (count == null) { // 如果之前没有put过, 返回的是null
				count = 0;
			}
			map.put(ch, count + 1);
		}
		System.out.println(map);
	}

	@Test
	public void testName() throws Exception {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(5, "five");
		map.put(15, "15...");
		map.put(25, "25...");
		map.put(35, "35...");
		map.put(2, "2...");
		map.put(4, "4...");

		map.put(21, "21...");
		map.put(37, "37...");
		map.put(53, "53...");

		map.put(3, "3...");
		map.put(1, "1...");
		map.put(6, "6...");

		map.put(100, "100..");
	}

	@Test
	public void test1() {
		//请把学生名与考试分数录入到Map中，并按分数显示前三名成绩学员的名字。
		Map<String,Integer> map1 = new HashMap<String, Integer>();
		map1.put("小明", 80);
		map1.put("小刚", 90);
		map1.put("小丽", 100);
		map1.put("小花", 20);
		map1.put("小方", 30);
		map1.put("小帅", 100);
		map1.put("小健", 99);
		map1.put("小特", 40);

		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int n = o2 - o1;
				if (n == 0) {
					n = 1;
				}
				return n;
			}
		};

		Map<Integer,String> map2 = new TreeMap<Integer, String>(comparator);

		Set<String> keySet = map1.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map1.get(key);
			map2.put(value, key);
		}

		Set<Entry<Integer, String>> entrySet = map2.entrySet();
		int count = 0;
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getValue() + " 分数 : " + entry.getKey());
			if (++count == 3) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Integer[] datas = {1,2,3,4,5};
		List<Integer> list = Arrays.asList(datas);
		list.add(5);
		System.out.println(list.size());
	}
}
