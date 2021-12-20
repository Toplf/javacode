package stu20.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void test4() {
		// 根据给定的数据创建日期时间对象
		LocalDateTime dateTime = LocalDateTime.of(2008, 8, 8, 20, 10, 1);
		System.out.println(dateTime);
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(ofPattern.format(dateTime));
		// 创建一个日期对象, 直接是你的生日, 打印输出成xxxx年xx月xx日
	}

	@Test
	public void test3() {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//System.out.println(sdf.format(dateTime));

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(dtf.format(dateTime));
	}

	@Test
	public void test2() {
		LocalTime time = LocalTime.now();
		System.out.println(time);

		int hour = time.getHour();
		LocalTime time2 = time.withHour(12);
		System.out.println(time2);
	}

	@Test
	public void test1() {
		Date date = new Date(2008 - 1900, 8, 8);
		Calendar calendar = Calendar.getInstance();
		// calendar对象是可以改变的, 并且属性的操作麻烦.

		//获取当前日历对象, 把它改成你的生日, 推算你的百日, 使用新API
		LocalDate date2 = LocalDate.now(); // LocalDate对象是不可以改变的
		LocalDate date3 = date2.withYear(1978).withMonth(6).withDayOfMonth(9);
		System.out.println(date3);
		LocalDate date4 = date3.plusDays(100);
		System.out.println(date4);
	}
}
