package kadai;

import java.util.Scanner;

public class Ensyu01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("名前を入力");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("趣味を入力");
		String hobby = sc.nextLine();
		System.out.println("特技を入力");
		String tokugi = sc.nextLine();
		System.out.printf("名前は,%sで、趣味は%sです。特技は、%sです。",name,hobby,tokugi);
		sc.close();
	}

}
