import java.util.Scanner;
public class MyGame {
	
	Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	String playerName;
	int choice;
	int playerHP;
	int pirateHP;
	String playerFound;
	String playerWeapon;
	int goldKey;
	int playerDamage;
	
	
	
	
	public static void main(String[] args) {
		MyGame game;
		game = new MyGame();
		game.createPlayer();
		game.randomForest();
	
		
		
	}
	
	public void createPlayer() {
		
		playerHP= 100;
		pirateHP= 150;
		
		System.out.println("Please enter your name:");
		
		playerName = myScanner.nextLine();
		
		System.out.println("Hello " + playerName + ", let's start your adventure!");
	}
	
	public void randomForest() {
		
		System.out.println("");
		System.out.println("__________________________________________");
		System.out.println("");
		System.out.println("You have spawned in a random forest.");
		System.out.println("");
		System.out.println("As you spawned in, you hit your head on the side of a tree and got knocked out.");
		System.out.println("");
		System.out.println("__________________Three Hours Later_____________________");
		System.out.println("");
		System.out.println("You wake up with your head ringing like you've just gone 5 minutes in a boxing ring with prime Mike Tyson.");
		System.out.println("It takes you a few seconds to realise where you are, except you have no clue how you got there but all you see as you spin around in awe is a");
		System.out.println("forest like no other, There range of colours that bounce of your retina is nothing like the dark gloumy forests you see in real life, this is something else...");
		System.out.println("");
		System.out.println("THIS IS SOMETHING MAGICAL");
		System.out.println("__________________________________________");
		System.out.println("");
		System.out.println("You gradually compose yourself and start searching for your phone, You reach into the left pocket of your tracksuit bottoms, then your right.. NOTHING.");
		System.out.println("You then notice a strange looking watch on your left wrist, it looks nothing like a watch in the real world.");
		System.out.println("It has two hands but not like a normal watch more like..like.. a..comp..");
		System.out.println("(BLEARING SOUND FROM WATCH)");
		System.out.println("Watch: WELCOME TO THE WORLD OF SWORD ART ONLINE");
		System.out.println("");
		System.out.println("Watch: What is your name?");
		System.out.println("You: You talk? Why is this watch talking!?");
		System.out.println("Watch: What is your Name?");
		playerName = myScanner.nextLine();
		System.out.println("Watch: Hello " + playerName + " My name is Katakuri, I will be your assistant throughout this game.");
		System.out.println("You: A..a..ga..game?");
		System.out.println("Katakuri: Yes the purpose of this game is to find the One Piece(Treasure),");
		System.out.println("Katakuri: ahh thats right you got knocked out as soon as you spawned in so you don't remember how you got here or what game you are playing,");
		System.out.println("you are currently playing Sword Art Online are you ready to begin?");
		System.out.println("You: Erm.. sure..i guess");
		System.out.println("Katakuri: Great lets start");
		System.out.println("__________________________________________");
		System.out.println("");
		System.out.println("Katakuri: What direction would you like to go to in search of the One Piece");
		System.out.println("1:Go North");
		System.out.println("2:Go East");
		System.out.println("3:Go South");
		System.out.println("4:Go West");
		
		
		choice = myScanner.nextInt();
		
		if(choice==1) {
			north();
		}
		if(choice==2) {
			east();
		}
		if(choice==3) {
			south();
		}
		if(choice==4) {
			west();
		}
		else {
			randomForest();
		}
		
		
			
		}
	public void north() {
		System.out.println("Katakur: This is the North.. We call it Ghost Town.");
		System.out.println("\n");
		System.out.println("Katakuri: There is an empty castle, Do you want to search inside for the One Piece.");
		System.out.println("");
		System.out.println("1: Yes let's search the castle!");
		System.out.println("2: No that looks very scary!");
		
		choice = myScanner.nextInt();
		
		if(choice==1) {
			emptyCastle();
		}
		if(choice==2) {
			randomForest();
		}
		
	}
	
	public void east() {
		System.out.println("Katakuri: This is the East.. We call it Wailing Woods.");
		System.out.println("\n");
		System.out.println("Katakuri: There is a town nearby.. Should we look for the One Piece there?");
		System.out.println("");
		System.out.println("1: Yes lets go into the nearby town!");
		System.out.println("2; No that is a waste of time!");
		
choice = myScanner.nextInt();
		
		if(choice==1) {
			nearbyTown();
		}
		if(choice==2) {
			randomForest();
		}
		
	}
	
	
	
	public void south() {
		System.out.println("Katakuri: This is the West.. We call it Moisty Mires.");
		System.out.println("\n");
		System.out.println("Katakuri: There is a weapon shop just ahead.. Should we go there? ");
		System.out.println("");
		System.out.println("1: Yes I would like a weapon");
		System.out.println("2: I won't get into any fights i don't need a weapon.");
		
choice = myScanner.nextInt();
		
		if(choice==1) {
			weaponShop();
		}
		if(choice==2) {
			randomForest();
		}
		
		
	}
	
	public void west() {
		System.out.println("Katakuri: This is the South.. We call it Paradise Palms.");
		System.out.println("\n");
		System.out.println("Katakuri: There is a pirate ship.. I think we should explore it for the One Piece.");
		System.out.println("");
		System.out.println("1: Yes lets explore the ship!");
		System.out.println("2. No there could be bad guys inside!");
		
choice = myScanner.nextInt();
		
		if(choice==1) {
			pirateShip();
		}
		if(choice==2) {
			randomForest();
		}
		
		
		
	}
	public void emptyCastle() {
		System.out.println("__________________________________________");
		System.out.println("");
		System.out.println("You walked into an empty castle and found a silver bracelet.");
		playerFound = "Silver Bracelet";
		System.out.println("Your Backpack: " + playerFound);
		System.out.println("\n\n1: Go back to the random forest");
		System.out.println("__________________________________________");
		
		choice = myScanner.nextInt();
		if(choice==1) {
			randomForest();
		}
		else {
			east();
		}
		
		
	}
	
	public void nearbyTown() {
		System.out.println("__________________________________________");
		System.out.println("");
		System.out.println("Katakuri: There is a guard by the gate.. Lets talk to him");
		
		System.out.println("You: Hello Guard,I am looking for the One Piece can you help me?" );
		System.out.println("Guard: Hello, Many come in search of the One Piece but many leave often disappointed.. The One Piece is neither North, East, South, West.");
		System.out.println("You: Stupid old guard, how can it not be North, East, South, West.. Thats impossible!");
		System.out.println("\n\n1: Go back to random forest");
		
		choice = myScanner.nextInt();
		if(choice==1) {
			randomForest();
		}
		else {
			south();
		}
		
		
	}
	
	

	public void weaponShop() {
		System.out.println("__________________________________________");
		System.out.println("");
		System.out.println("Katakuri: Lets talk to the shop keeper");
		System.out.println("You: Hello Sir, I am new here and would like a strong weapon.");
		System.out.println("Shop Keeper: Hello, I will give you one of my finest swords free of charge.. I see something special in you");
		System.out.println("You: Thank you so much Sir, I will look after it with my life.");
		playerWeapon = "Katana";
		playerFound = "Bracelet";
		System.out.println("Your Backpack:" + playerFound + playerWeapon);
		System.out.println("\n\n1: Go back to random forest");
		
		choice = myScanner.nextInt();
		if(choice==1) {
			randomForest();
		}
		else {
			west();
		}
		
	}
	
	public void pirateShip() {
		System.out.println("__________________________________________");
		System.out.println("");
		System.out.println("You encountered a raged pirate.");
		System.out.println("1: Fight");
		System.out.println("2: Run");
		System.out.println("__________________________________________");
		
		choice = myScanner.nextInt();
		
		if(choice==1) {
			fight();
		}
		if (choice==2) {
			randomForest();
		}
		else {
			randomForest();
		}
		
		
	}
	
	public void fight() {
		System.out.println("__________________________________________");
		System.out.println("Your HP: " + playerHP);
		System.out.println("Pirate HP:" + pirateHP);
		System.out.println("\n1: Attack!!");
		System.out.println("2. Run");
		System.out.println("__________________________________________");
		
		choice = myScanner.nextInt();
		
		if(choice==1) {
			attack();
		}
		if(choice==2) {
			randomForest();
		}
		else {
			fight();
		}
	}
	
	public void attack() {
		int playerDamage=30;
		
		
		if(playerWeapon.equals("Katana")) {
			playerDamage = new java.util.Random().nextInt(40);
		
		}
		
		System.out.println("You attack the pirate and gave " + playerDamage + " damage");
		
		pirateHP = pirateHP - playerDamage;
		
		System.out.println("Pirate HP: " + pirateHP);
		
		if(pirateHP<1) {
			beat();
		
		}
		if(pirateHP>0) {
			int pirateDamage =0;
			
			pirateDamage = new java.util.Random().nextInt(25);
			
			System.out.println("The pirate attacked you and gave " + pirateDamage + " damage");
			
			playerHP = playerHP - pirateDamage;
			
			System.out.println("Player HP: " + playerHP);
			
			if(playerHP<1) {
				dead();
			}
			if(playerHP>0) {
				fight();
			}
			
		}
		
		
		

	}
	
	public void beat() {
		System.out.println("__________________________________________");
		System.out.println("YOU KILLED THE PIRATE!!!");
		System.out.println("The pirate dropped a key!");
		System.out.println("You obtained a gold key!\n\n");
		System.out.println("1:Go new world");
		System.out.println("__________________________________________");
		
		goldKey = 1;
		
		choice = myScanner.nextInt();
		if(choice==1) {
			newWorld();
		}
		else {
			newWorld();
		}
		
	}
	
	public void dead() {
		
		System.out.println("__________________________________________");
		System.out.println("You are dead!!!");
		System.out.println("\n\nGAME OVER");
		System.out.println("__________________________________________");
		choice = myScanner.nextInt();
			
			
		}
		
	public void newWorld() {
		System.out.println("__________________________________________");
		System.out.println("");
		System.out.println("YOU HAVE SPAWNED IN NEW WORLD");
		System.out.println("Katakuri: Wow killing that pirate and getting that gold key brought us to a new world, my compass doest work in this new world.");
		
		System.out.println("TREASURE SLOWLY DESCENDS ON YOU");
		System.out.println("Katakuri: Its the ONE PIECE!!!, I cant believe this we finally found it.");
		System.out.println("You: This is the best game ever!, Thanks so much Katakuri.. I'll see you soon");
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("GAME COMPLETED YOU WON");
		choice = myScanner.nextInt();
			
		}
		
		
	}
	
	
	
	

	

		
		
		
	
	


