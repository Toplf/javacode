package stu19.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void test4() {
		LocalDate date = LocalDate.now(); //new LocalDate(2019, 12, 18);
		System.out.println(date);
		int year = date.getYear();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		System.out.println(year + "," + month + "," + day);

		// 2002, 11, 8
		/*
		LocalDate withYear = date.withYear(2002);
		System.out.println(withYear);
		LocalDate withMonth = withYear.withMonth(11);
		System.out.println(withMonth);
		LocalDate withDayOfMonth = withMonth.withDayOfMonth(8);
		System.out.println(withDayOfMonth);
		*/
		LocalDate date2 = date.withYear(2002).withMonth(11).withDayOfMonth(8);
		System.out.println(date2);

		LocalDate date3 = date2.plusDays(200);

		System.out.println(date3);

	}

	// 获取当前日历对象, 把它改成你的生日, 推算你的百日

	@Test
	public void exer1() {
		Calendar calendar = Calendar.getInstance();
		// 1978, 6, 9
		calendar.set(Calendar.YEAR, 1978);
		calendar.set(Calendar.MONTH, 5);
		calendar.set(Calendar.DAY_OF_MONTH, 9);

		System.out.println(calendar.getTime());

		calendar.add(Calendar.DAY_OF_MONTH, 100);

		System.out.println(calendar.getTime());
	}

	@Test
	public void test3() {
		// 内部使用数组保存所有数据
		Calendar calendar = Calendar.getInstance();//new Calendar();
		System.out.println(calendar);
		//calendar.getYear();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH); // 存储的月比实际小1
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);

		// 2002, 11, 8
		calendar.set(Calendar.YEAR, 2002);
		calendar.set(Calendar.MONTH, 10);
		calendar.set(Calendar.DAY_OF_MONTH, 8);

		System.out.println(calendar.getTime());

		calendar.add(Calendar.YEAR, -10);

		System.out.println(calendar.getTime());
	}

	@Test

	public void testName2() {
		Date date = new Date(2008, 8, 8, 10, 20, 30);
		System.out.println(date);
	}

	@Test
	public void testName() {
		long currentTimeMillis = System.currentTimeMillis();// 1970-01-01 00:00:00.000
		System.out.println(currentTimeMillis);

		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(date);
		System.out.println(format);

		String string = "2002-12-05 10:20:30";
		try {
			Date parse = sdf.parse(string);
			System.out.println(parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String format2 = sdf.format(currentTimeMillis); // 格式化毫秒
		System.out.println(format2);
		// 写一个小时钟
	}
}
