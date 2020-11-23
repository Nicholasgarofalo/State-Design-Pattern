//Written by Nicholas Garofalo

public class GameConsole {
	private State homeState;
	private State nintendoState;
	private State XBoxState;
	private State state;
	
	//GameConsole
	public GameConsole() {
		homeState = new HomeState();
		nintendoState = new NintendoState();
		XBoxState = new xBoxState();
		state = new HomeState();
		System.out.println("Starting up the game console.\n");
	}
	
	//set State to user input
	public void setState(State state) {
		this.state = state;
	}
	
	//return states
	public State getHomeState() {
		return homeState;
	}
	public State getNintendoState() {
		return nintendoState;
	}
	public State getXBoxState() {
		return XBoxState;
	}
	
	//press home button then change state to home
	public void pressHomeButton() {
		state.pressHomeButton();
		state = homeState;
	}
	//press nintendo button then change state to nintendo
	public void pressNintendoButton() {
		state.pressNintendoButton();
		state = nintendoState;
	}
	//press XBox button then change state to XBox
	public void pressXBoxButton() {
		state.pressXBoxButton();
		state = XBoxState;
	}
	//don't have to change state, but press game button
	public void pressGameButton() {
		state.pressGameButton();
	}
}
