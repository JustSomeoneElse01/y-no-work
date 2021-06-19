
public class Main   {

	public static void main(String[] args) {

		Logic logic = new Logic();
		
		System.out.println("select a gamemode");

		while (true) {
			logic.userSetGamemode();
			int gamemode = logic.getGamemode();
			if (gamemode == 1) {
				logic.playerSetTarget();
				logic.hideTarget();
				break;
				
			} else if (gamemode == 2) {
				logic.computerSetTarget();
				break;
				
			}
			
		}

		logic.guessLoop();

	}

}