package kadai;

import java.util.Scanner;

public class Ensyu08 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int num = scanner.nextInt();
		if(num>=90 && num<=100) {
			System.out.print("S評価");
		}else if(num>=80 && num<90){
			System.out.print("A評価");
		}else if(num>=70  && num<80) {
			System.out.print("B評価");
		}else if(num>=60 && num<70){
			System.out.print("C評価");
		}else if(num>=0 && num<60){
			System.out.print("D評価");
		}else {
			System.out.print("0~100点の範囲で入力してください");
		}
		scanner.close();
	}
}
