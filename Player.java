package GWCRPS;

public class Player{
	// To keep track of scanner in order to access it here
	private RPS owner;
	private String name;

	public Player(RPS owner,String name){
		this.owner = owner;
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public int doTurn(){
		 System.out.println("\nRock, Paper or Scissors? ");
		 String input = "";
		 try{
		 	input = owner.scanner.next();
		 } catch (Exception e){}

		 String response = input.toLowerCase();
		 boolean isValid = false;
		 while(!isValid){
			 if(!(response.equals("rock") || response.equals("paper") || response.equals("scissors"))){
			 	System.out.println("Not valid input. Please try again.");
				 System.out.println("\nRock, Paper or Scissors? ");

				 try{
				 	input = owner.scanner.next();
				 } catch (Exception e){}

				 response = input.toLowerCase();
			 } else {
			 	isValid = true;
			 }
		 }

		 if(response.equals("rock")){
		 	return 0;
		 } else if(response.equals("paper")){
		 	return 1;
		 } else if(response.equals("scissors")){
		 	return 2;
		 } else {
		 	return -1;
		 }
	}
}