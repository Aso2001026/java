package kadai;

import java.util.Scanner;

public class Ensyu04 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int x = scanner.nextInt();
		System.out.printf("1乗=%d%n2乗=%d%n3乗=%d%n", x,x*x,x*x*x);
		scanner.close();
	}
}
