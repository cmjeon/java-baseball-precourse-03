package baseball;

import java.util.ArrayList;
import java.util.Arrays;

import nextstep.utils.Console;

public class HomeTeam {

	ArrayList<Integer> guessedNumbers = new ArrayList<Integer>();
	
	public void setGuessedNumbers(ArrayList<Integer> guessedNumbers) {
		this.guessedNumbers = guessedNumbers;
	}

	public ArrayList<Integer> getGuessedNumbers() {
		return guessedNumbers;
	}

	public ArrayList<Integer> getGuessedNumberFromReadLine() {
		String guessedNumberString = "";
		do {
			guessedNumbers.clear();
			guessedNumberString = Console.readLine();
		} while (validateGuessedNumber(guessedNumberString));
		return guessedNumbers;
	}

	public boolean validateGuessedNumber(String guessedNumberString) {
		boolean result = false;
		try {
			stringToIntegerGuessedNumberList(guessedNumberString);
		} catch (Exception e) {
			System.out.println("[ERROR] 입력값 오류. 재입력해주세요.");
			result = true;
			return result;
		}
		return false;
	}

	public void stringToIntegerGuessedNumberList(String guessedNumberString) throws Exception {
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(guessedNumberString.split("")));
		for (String str : stringList) {
			isDuplicatedNumberInList(Integer.parseInt(str));
		}
		if (guessedNumbers.size() != 3) {
			throw new Exception();
		}
	}

	public void isDuplicatedNumberInList(int number) throws Exception {
		if (guessedNumbers.contains(number)) {
			throw new Exception();
		}
		guessedNumbers.add(number);
	}
}
