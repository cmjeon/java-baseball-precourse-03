package baseball;

public class Application {

	public static void main(String[] args) {
		AwayTeam awayTeam = new AwayTeam();
		HomeTeam homeTeam = new HomeTeam();
		Umpire umpire = new Umpire();
		View view = new View();
		
		Controller controller = new Controller(view, awayTeam, homeTeam, umpire);
		
		controller.startGame();
	}
}