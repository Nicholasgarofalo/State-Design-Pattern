//Written by Nicholas Garofalo
public class NintendoState implements State {
	private GameConsole gameConsole;
	private String[] games = new String[5];
	
	@Override
	public void pressHomeButton() {
		System.out.println("Displaying Home Screen...");
	}

	@Override
	public void pressNintendoButton() {
		System.out.println("You are already viewing Nintendo.");
	}

	@Override
	public void pressXBoxButton() {
		System.out.println("Starting XBox...");
	}

	@Override
	public void pressGameButton() {
		System.out.println("You have the following games:");
		for(int i = 0; i < games.length; i++) {
			if(i == 0)
				games[i] = "Mario Kart";
			else if(i == 1)
				games[i] = "Super Mario Bros.";
			else if(i == 2)
				games[i] = "Super Smash Bros.";
			else if(i == 3)
				games[i] = "Pokemon";
			else if(i == 4)
				games[i] = "Zelda";
			System.out.println(games[i]);
		}
		System.out.println("\n");
	
	}
}
