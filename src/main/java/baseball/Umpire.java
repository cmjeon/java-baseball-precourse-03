package baseball;

import java.util.ArrayList;

public class Umpire {

	private ArrayList<Integer> goalNumbers = new ArrayList<Integer>();
	private ArrayList<Integer> resultNumbers = new ArrayList<Integer>();

	public ArrayList<Integer> getGoalNumbers() {
		return goalNumbers;
	}

	public void setGoalNumbers(ArrayList<Integer> randomNumbers) {
		this.goalNumbers = randomNumbers;
	}

	public ArrayList<Integer> getResultNumbers() {
		return resultNumbers;
	}

	public void setResultNumbers(ArrayList<Integer> resultNumbers) {
		this.resultNumbers = resultNumbers;
	}

	private void resetResultNumbers() {
		resultNumbers.clear();
		resultNumbers.add(0);
		resultNumbers.add(0);
	}

	public ArrayList<Integer> checkGuesssedNumber(ArrayList<Integer> guessedNumbers) {
		resetResultNumbers();
		for (int i = 0; i < guessedNumbers.size(); i++) {
			checkNumberInRandomNumbers(i, guessedNumbers.get(i));
		}
		return resultNumbers;
	}

	private void checkNumberInRandomNumbers(int index, int num) {
		for (int i = 0; i < goalNumbers.size(); i++) {
			checkStrikiOrBall(index, num, i);
		}
	}

	private void checkStrikiOrBall(int index, int num, int randomIndex) {
		if (num == goalNumbers.get(randomIndex)) {
			isStrikeOrBall(index, randomIndex);
		}
	}

	private void isStrikeOrBall(int index, int randomIndex) {
		if (index == randomIndex) {
			resultNumbers.set(0, resultNumbers.get(0) + 1);
		} else {
			resultNumbers.set(1, resultNumbers.get(1) + 1);
		}
	}

}
