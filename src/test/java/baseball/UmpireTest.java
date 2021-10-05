package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class UmpireTest {

	@Test
	public void resetResultNumbersTest() {
		Umpire um = new Umpire();
		um.resetResultNumbers();
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(0, 0);
	}

	@Test
	public void checkGuesssedNumberTest() {
		Umpire um = new Umpire();
		ArrayList<Integer> goalList = new ArrayList<Integer>();
		goalList.add(1);
		goalList.add(2);
		goalList.add(3);
		um.setGoalNumbers(goalList);
		ArrayList<Integer> guessList = new ArrayList<Integer>(); 
		guessList.add(1);
		guessList.add(2);
		guessList.add(3);
		assertThat(um.checkGuesssedNumber(guessList)).hasSize(2).containsExactly(3, 0);
		guessList.clear();
		guessList.add(1);
		guessList.add(4);
		guessList.add(5);
		assertThat(um.checkGuesssedNumber(guessList)).hasSize(2).containsExactly(1, 0);
		guessList.clear();
		guessList.add(2);
		guessList.add(4);
		guessList.add(5);
		assertThat(um.checkGuesssedNumber(guessList)).hasSize(2).containsExactly(0, 1);
		guessList.clear();
		guessList.add(1);
		guessList.add(3);
		guessList.add(5);
		assertThat(um.checkGuesssedNumber(guessList)).hasSize(2).containsExactly(1, 1);
		guessList.clear();
		guessList.add(3);
		guessList.add(1);
		guessList.add(2);
		assertThat(um.checkGuesssedNumber(guessList)).hasSize(2).containsExactly(0, 3);
	}

	@Test
	public void checkNumberInRandomNumbersTest() {
		Umpire um = new Umpire();
		ArrayList<Integer> goalList = new ArrayList<Integer>();
		goalList.add(1);
		goalList.add(2);
		goalList.add(3);
		um.setGoalNumbers(goalList);
		um.resetResultNumbers();
		um.checkNumberInRandomNumbers(0, 1);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 0);
		um.checkNumberInRandomNumbers(1, 3);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 1);
		um.checkNumberInRandomNumbers(3, 2);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 2);
	}

	@Test
	public void checkStrikiOrBallTest() {
		Umpire um = new Umpire();
		ArrayList<Integer> goalList = new ArrayList<Integer>();
		goalList.add(1);
		goalList.add(2);
		goalList.add(3);
		um.setGoalNumbers(goalList);
		um.resetResultNumbers();
		um.checkStrikiOrBall(0, 1, 0);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 0);
		um.checkStrikiOrBall(1, 2, 1);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(2, 0);
	}

	@Test
	public void isStrikeOrBallTest() {
		Umpire um = new Umpire();
		ArrayList<Integer> goalList = new ArrayList<Integer>();
		goalList.add(1);
		goalList.add(2);
		goalList.add(3);
		um.setGoalNumbers(goalList);
		um.resetResultNumbers();
		um.isStrikeOrBall(0, 0);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 0);
		um.isStrikeOrBall(1, 2);
		assertThat(um.getResultNumbers()).hasSize(2).containsExactly(1, 1);
	}

}
