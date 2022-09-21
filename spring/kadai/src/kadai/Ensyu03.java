package kadai;

import java.util.Scanner;

public class Ensyu03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("一つ目の数値を入力");
		int x = scanner.nextInt();
		System.out.println("二つ目の数値を入力");
		int y = scanner.nextInt();
		Double z = ((double)(x)+(double)(y))/2;
		System.out.printf("平均値は%.1f",z);
		scanner.close();
	}

}
