package step2;

import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		int year;
		Scanner s = new Scanner(System.in);
		year = s.nextInt();// 不要删除前8行代码
		if (year % 400 == 0) {
			System.out.println(year + "年是闰年");
		} else if (year % 100 == 0) {
			System.out.println(year + "年不是闰年");
		} else if (year % 4 == 0) {
			System.out.println(year + "年是闰年");
		} else {
			System.out.println(year + "年不是闰年");
		}
	}
}