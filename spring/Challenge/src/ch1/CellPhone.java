package ch1;

public class CellPhone implements IEmail , Iphone {
	String myNum;
	String myMail;
	public CellPhone(String mail, String num) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.myNum = num;
		this.myMail = mail;
	}
	
	@Override
	public void call(String num) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.printf("%sに%sから電話をかけます。%n",num,myNum );
		
	}
	@Override
	public void sendMail(String mail) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.printf("%sに%sからメールし出します。",mail,myMail );
	}
}
