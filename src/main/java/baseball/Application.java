package baseball;

import java.util.ArrayList;

import nextstep.utils.Console;

public class Application {

	public static void main(String[] args) {
		Application app = new Application();
		boolean isGameContinue;

		do {
			app.runGame();
			isGameContinue = app.askReGame();
			//    		System.out.println("isGameEnded" + isGameContinue);
		} while (isGameContinue);
		System.out.println("게임종료");
	}

	private boolean askReGame() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		String answerString = Console.readLine();
		if (Integer.valueOf(answerString) == 1) {
			return true;
		}
		return false;
	}

	private boolean runGame() {
		System.out.println("게임시작");
		AwayTeam awayTeam = new AwayTeam();
		HomeTeam homeTeam = new HomeTeam();
		Umpire umpire = new Umpire();
		boolean isMatch = true;

		awayTeam.makeNewRandomNumbers();
		do {
			umpire.setGoalNumbers(awayTeam.getRandomNumber());
			ArrayList<Integer> guessedNumbers = homeTeam.getGuessedNumber();
			isMatch = umpire.checkGuesssedNumber(guessedNumbers);
		} while (!isMatch);
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
		return isMatch;
	}

}