package kadai;

import java.util.Scanner;

public class Ensyu07 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int num = scanner.nextInt();
		if(num%6==0) {
			System.out.print("入力された数値は、6の倍数です。");
		}else if(num%3==0){
			System.out.print("入力された数値は、3の倍数です。");
		}else if(num%2==0) {
			System.out.print("入力された数値は、2の倍数です。");
		}else {
			System.out.print("入力された数値は、その他の倍数です。");
		}
		scanner.close();
	}
}
