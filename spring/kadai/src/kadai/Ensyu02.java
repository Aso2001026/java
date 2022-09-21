package kadai;
import java.util.Scanner;
public class Ensyu02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("trueかfalseを入力してください");
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();
		Boolean y = Boolean.parseBoolean(x);
		System.out.printf("入力したのは%b",y);
		scanner.close();
	}

}
