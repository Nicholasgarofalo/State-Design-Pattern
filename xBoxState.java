//Written by Nicholas Garofalo

public class xBoxState implements State {
	private GameConsole gameConsole;
	private String[] games = new String[5];
	
	@Override
	public void pressHomeButton() {
		System.out.println("Displaying Home Screen...");
	}

	@Override
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
	}

	@Override
	public void pressXBoxButton() {
		System.out.println("You are already viewing XBox.");
	}

	@Override
	public void pressGameButton() {
		System.out.println("You have the following games:");
		for(int i = 0; i < games.length; i++) {
			if(i == 0)
				games[i] = "NBA 2K21";
			else if(i == 1)
				games[i] = "Forza";
			else if(i == 2)
				games[i] = "Fortnite";
			else if(i == 3)
				games[i] = "Red Dead Redemption";
			else if(i == 4)
				games[i] = "Madden";
			System.out.println(games[i]);
		}
		System.out.println("\n");
	}
}
