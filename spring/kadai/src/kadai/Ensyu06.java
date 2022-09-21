package kadai;

import java.util.Scanner;

public class Ensyu06 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int num = scanner.nextInt();
		if(num%2==0) {
			System.out.print("入力された数値は、偶数です。");
		}else {
			System.out.print("入力された数値は、奇数です。");
		}
		scanner.close();
	}

}
