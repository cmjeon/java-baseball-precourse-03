package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class AwayTeamTest {

	@Test
	public void makeNewRandomNumbersTest() {
		AwayTeam at = new AwayTeam();
		at.makeNewRandomNumbers();
		assertThat(at.getRandomNumbers()).hasSize(3);
	}

	@Test
	public void isPreparingRandomNumbersTest() {
		AwayTeam at = new AwayTeam();
		at.makeNewRandomNumbers();
		assertThat(at.isPreparingRandomNumbers()).isFalse();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		at.setRandomNumbers(list);
		assertThat(at.isPreparingRandomNumbers()).isTrue();
	}

	@Test
	public void getListWithUnduplicatedNumbersTest() {
		AwayTeam at = new AwayTeam();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		assertThat(at.getListWithUnduplicatedNumbers(list, 2)).containsExactly(1, 2, 3);
		assertThat(at.getListWithUnduplicatedNumbers(list, 4)).containsExactly(1, 2, 3, 4);
	}
}
