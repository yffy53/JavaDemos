package step3;

public class Test4 {
	public static void main(String[] args) {
		int i, j;

		for (i = 0; i < 5; i++) { // 定义外循环条件
			for (j = 0; j <= i; j++) { // 定义内循环条件
				System.out.print("* "); // 定义循环体
			}
			System.out.println(); // 换行
		}

	}
}