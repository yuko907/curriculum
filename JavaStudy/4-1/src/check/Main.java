package check;

import constants.Constants;

public class Main {
	
	private static String lastName = "aaa";
	private static String firstName= "ddd";

	private static void printName(String firstName, String lastName) {
		firstName = "吉田";
		lastName = "優子";
		System.out.println(firstName+lastName);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.print("printNameメソッド　→　");
		printName(firstName, lastName);
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet robot = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		pet.introduce();
		robot.introduce();

	}

}
