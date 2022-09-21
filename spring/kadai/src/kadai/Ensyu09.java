package kadai;

import java.util.Scanner;

public class Ensyu09 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("身長をメートルで入力してください");
		double  hight = scanner.nextDouble();
		System.out.println("体重をキロで入力してください");
		double  weight = scanner.nextDouble();
		double  num = weight / (hight * hight);
		
		System.out.println("BMI ="+num);
		
		if(num>=30) {
			System.out.print("高度肥満");
		}else if(num>=25){
			System.out.print("肥満");
		}else if(num>=18.5) {
			System.out.print("標準");
		}else {
			System.out.print("痩せ");
		}
		scanner.close();
	}
}
