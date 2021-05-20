package check;

import constants.Constants;

public class Check {

	//性•名を表すフィールド変数の定義
	private static String firstName = "山川";
	private static String lastName = "太地";

	public static void main(String[] args) {

		//Petクラスのインスタンスの取得•引数に必要な定数をセットしコンストラクタに渡す
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);

		//RobotPetクラスのインスタンスの取得•引数に必要な定数をセットしコンストラクタに渡す
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

		//出力を行うメソッドの呼び出し
		printName(firstName, lastName);
		pet.introduce();
		robotPet.introduce();
	}

	//性•名のデータを受け取り、連結させて表示する
	private static void printName(String firstName, String lastName) {
		System.out.println("printNameのメソッド → " + firstName + lastName);
	}

}
