package kensyuu;

public class Phone {

	String no;

	public String getTel() {
		return this.no;
	}

	public void tel(String to) {
		System.out.println(no + "から" + to + "へ電話しました。");
	}

}
