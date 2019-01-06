
public class guessgame {

	player p1 ; // p1 - 3 instance variable for 3 player object
	player p2 ; 
	player p3 ;
	
	
	public void startgame ()  {
		
		p1 = new player(); // Create 3 player object and assign them to the three player instance variable
		p2 = new player();
		p3 = new player();
		
		int guessp1 = 0; //declare 3 variable to hold the three guesses the player make
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isright = false; // declare 3 variable to hold a true or false based on the player's answer
		boolean p2isright = false;
		boolean p3isright = false;
		
		int targetnumber = (int) (Math.random()*10); // target number player has to guess
		System.out.println("i am thinking of a number between 0 and 9...");
		
		while(true) {
		System.out.println("number to guess is "+ targetnumber);
		
		p1.guess(); // guess method calling
		p2.guess();
		p3.guess();
		
		guessp1 = p1.number; // get each player's guess (the result of their guess() method running) by accessing the 
		System.out.println("player1 guessed.."+guessp1); // number variable of each player
		
		guessp2 = p2.number;
		System.out.println("player2 guessed.."+guessp2);
		
		guessp3 = p3.number;
		System.out.println("player3 guessed.."+guessp3);	
		
		if (guessp1 == targetnumber) { // check each player's guess to see if it matches the target number if a player is 
			p1isright = true;          // right, then set that player's variable to be true (remember we set it false by default)
		}
		
		if (guessp2 == targetnumber) {
			p2isright = true;
		}
		
		if (guessp3 == targetnumber) {
			p3isright = true;
		}
		
		if (p1isright || p2isright || p3isright) { // if player one OR player two OR player three is right 
		
		System.out.println("we have a winner");
		System.out.println("Player1 got it right?.."+ p1isright);
		System.out.println("Player2 got it right?.."+ p2isright);
		System.out.println("Player2 got it right?.."+ p3isright);
		System.out.println("Game is over");
		break;
		
		}
		else { //else stay in loop and ask the players for another guess
			System.out.println("players will have to try again");
		}					
			}	
	}	
}