package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class HomeTeamTest {

	@Test
	public void validateGuessedNumberTest() {
		HomeTeam ht = new HomeTeam();
		assertThat(ht.validateGuessedNumber("123")).isFalse();
		assertThat(ht.validateGuessedNumber("abc")).isTrue();
		assertThat(ht.validateGuessedNumber("111")).isTrue();
		assertThat(ht.validateGuessedNumber("12")).isTrue();
		assertThat(ht.validateGuessedNumber("1234")).isTrue();
	}

	@Test
	public void stringToIntegerGuessedNumberListTest() {
		HomeTeam ht = new HomeTeam();
		assertThatThrownBy(() -> ht.stringToIntegerGuessedNumberList("abc")).isInstanceOf(Exception.class);
	}

	@Test
	public void isDuplicatedNumberInListTest() throws Exception {
		HomeTeam ht = new HomeTeam();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		ht.setGuessedNumbers(list);
		assertThatThrownBy(() -> ht.isDuplicatedNumberInList(2)).isInstanceOf(Exception.class);
		ht.isDuplicatedNumberInList(3);
		assertThat(ht.getGuessedNumbers()).hasSize(3);
	}
}
