package baseball;

import java.util.ArrayList;

import nextstep.utils.Console;

public class Controller {

	View view;
	AwayTeam awayTeam;
	HomeTeam homeTeam;
	Umpire umpire;

	public Controller(View view, AwayTeam awayTeam, HomeTeam homeTeam, Umpire umpire) {
		this.view = view;
		this.awayTeam = awayTeam;
		this.homeTeam = homeTeam;
		this.umpire = umpire;
	}

	public void startGame() {
		boolean isGameContinue;

		do {
			runGame();
			isGameContinue = askReGame();
		} while (isGameContinue);
		view.endMessage();
	}

	private boolean runGame() {
		view.startMessage();
		boolean isMatch = false;

		awayTeam.makeNewRandomNumbers();
		do {
			umpire.setGoalNumbers(awayTeam.getRandomNumber());
			view.inputNumberMessage();
			ArrayList<Integer> guessedNumbers = homeTeam.getGuessedNumber();
			ArrayList<Integer> resultNumbers = umpire.checkGuesssedNumber(guessedNumbers);
			view.resultMessage(resultNumbers);
			isMatch = checkIsWin(resultNumbers);
		} while (!isMatch);
		view.winMessage();
		return isMatch;
	}

	private boolean checkIsWin(ArrayList<Integer> resultNumbers) {
		if(resultNumbers.get(0) == 3) {	
			return true;
		}
		return false;
	}

	private boolean askReGame() {
		view.askReGameMessage();
		String answerString = Console.readLine();
		if (Integer.valueOf(answerString) == 1) {
			return true;
		}
		return false;
	}

}