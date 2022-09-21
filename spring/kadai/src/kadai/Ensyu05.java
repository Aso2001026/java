package kadai;

import java.util.Scanner;

public class Ensyu05 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[3];
		int max = -1;
		int index = 0;
		for(int i = 1;i<4;i++) {
			System.out.println(i+"つ目の数字を入力してください");
			num[i-1] = scanner.nextInt();
			if(max<num[i-1]) {
				max = num[i-1];
				index = i;
			}
		}
		System.out.printf("最大値は%dつ目の%dです。", index,max);
		scanner.close();
	}
}
