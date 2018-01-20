package GWCRPS;

import java.util.Scanner;

public class RPS{

	static Scanner scanner;
	Player player;

	int wins = 0;
	int opponentWins = 0;

	public RPS(String name){
		player = new Player(this,name);
	}

	public void run(){
		do{
			play();
		} while(askPlayAgain());
	}

	public void play(){
		int play = player.doTurn();
		int opponent = (int)(Math.random()*3);
		// rock = 0
		// paper = 1
		// scissors = 2

		System.out.println();

		if(play == 0){
			System.out.println(player.getName()+" played rock!");
			switch(opponent){
				case 0: System.out.println("Computer played rock!");
						System.out.println("It's a draw!");
						break;
				case 1: System.out.println("Computer played paper!");
						System.out.println(player.getName()+" lost!");
						break;
				case 2: System.out.println("Computer played scissors!");
						System.out.println(player.getName()+" wins!");
						break;
			}
		} else if(play == 1){
			System.out.println(player.getName()+" played paper!");
			switch(opponent){
				case 0: System.out.println("Computer played rock!");
						System.out.println(player.getName()+" wins!");
						break;
				case 1: System.out.println("Computer played paper!");
						System.out.println("It's a draw!");
						break;
				case 2: System.out.println("Computer played scissors!");
						System.out.println(player.getName()+" lost!");
						break;
			}
		} else if(play == 2){
			System.out.println(player.getName()+" played scissors!");
			switch(opponent){
				case 0: System.out.println("Computer played rock!");
						System.out.println(player.getName()+" lost!");
						break;
				case 1: System.out.println("Computer played paper!");
						System.out.println(player.getName()+" wins!");
						break;
				case 2: System.out.println("Computer played scissors!");
						System.out.println("It's a draw!");
						break;
			}
		}
	}

	public boolean askPlayAgain(){
		boolean playAgain = false;

		System.out.println("\nPlay again? ['yes' or 'no']");
		String input = "";
		try{
			input = scanner.next();
		} catch (Exception e){}
		if(input.toLowerCase().equals("yes")){
			playAgain = true;
		}

		return playAgain;
	}

	public static void main(String[] args){
		scanner = new Scanner(System.in);

		System.out.println("What is your name? ");
		String name = scanner.next();

		RPS rps = new RPS(name);
		rps.run();
	}
}