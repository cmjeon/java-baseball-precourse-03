package baseball;

import java.util.ArrayList;

import nextstep.utils.Randoms;

public class AwayTeam {

	private ArrayList<Integer> randomNumbers = new ArrayList<Integer>();

	public void setRandomNumber(ArrayList<Integer> randomNumbers) {
		this.randomNumbers = randomNumbers;
	}

	public ArrayList<Integer> getRandomNumber() {
		return randomNumbers;
	}
	
	public void makeNewRandomNumbers() {
		randomNumbers.clear();
		do {
			int num = Randoms.pickNumberInRange(1, 9);
			randomNumbers.add(num);
		} while (isPreparingRandomNumbers());
	}

	private boolean isPreparingRandomNumbers() {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (Integer i : randomNumbers) {
			newList = getListWithUnduplicatedNumbers(newList, i);
		}
		randomNumbers = newList;
		if (randomNumbers.size() < 3) {
			return true;
		}
		return false;
	}

	private ArrayList<Integer> getListWithUnduplicatedNumbers(ArrayList<Integer> newList, int i) {
		if (!newList.contains(i)) {
			newList.add(i);
		}
		return newList;
	}

	

}
