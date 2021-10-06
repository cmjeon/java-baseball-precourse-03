package baseball;

import java.util.ArrayList;

public class View {

	public void startMessage() {
		System.out.println("게임시작");
	}

	public void endMessage() {
		System.out.println("게임종료");
	}

	public void winMessage() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
	}
	
	public void askReGameMessage() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
	}

	public void inputNumberMessage() {
		System.out.print("숫자를 입력해주세요 : ");
	}

	public void resultMessage(ArrayList<Integer> resultNumbers) {
		if (resultNumbers.get(0) == 0 && resultNumbers.get(1) == 0) {
			System.out.print("낫싱");
		}
		if (resultNumbers.get(0) != 0) {
			System.out.print(resultNumbers.get(0) + "스트라이크");
		}
		if (resultNumbers.get(0) != 0 && resultNumbers.get(1) != 0) {
			System.out.print(" ");
		}
		if (resultNumbers.get(1) != 0) {
			System.out.print(resultNumbers.get(1) + "볼");
		}
		System.out.println();
	}

	public void inputErrorMessage() {
		System.out.println("[ERROR] 입력값 오류. 재입력해주세요.");
	}

}
