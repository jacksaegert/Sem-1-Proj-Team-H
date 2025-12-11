
import java.util.Scanner;
import java.util.Random;
public class pokemon1 {
    
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        // Introduction Text
        System.out.println("Welcome to Pokemon Simulator");
        System.out.println("The One-Stop-Shop fo all Your Pokemon Training Needs!");
        System.out.println("Press Enter to Begin");
        input.nextLine();
        //User input for choosing "difficulty"
        System.out.println("Choose your Pokemon:");
        System.out.println("\n 1.) Charizard: Manage temperature! \n 2.) Bellsprout: Manage sunlight! \n 3.) Ninetails: Make sure they're well goroomed! \n 4.) Ditto: Swaps to a random pokemon occasionally. Manage everything! \n");
        int choice = input.nextInt();
        starterChoice(choice);

        //Selector
        //if (choice == 1){
            // pokemon1 = new Charizard();
       // } else if (choice == 2) {
            //bellsprout pokemon = new bellsprout();
      //  } //else if (choice == 3) {
          //  ninetails pokemon = new ninetails();
       // } //else {
          //  Ditto pokemon = new Ditto();
      //  }
        int rand = 0;
        //Event loop WHILE pokemon is alive
        while (pokemon1.getHealth() > 0 && pokemon1.getEnergy() > 0 && pokemon1.getMood() > 0){
            System.out.println("What do you want to do with your Pokemon?");
            System.out.println("\n1.) Sleep \n2.) Feed\n 3.) Play\n4.) Train\n5.) Batttle \n 6. display stats" );
            choice = input.nextInt();
            //Primanry choice loop
            switch (choice) {
                case 1 -> pokemon1.sleep();
                case 2 -> pokemon1.feed();
                case 3 -> pokemon1.play();
                case 4 -> pokemon1.train();
                default -> pokemon1.battle();
                case 6 -> pokemon1.displaystats();
                
            }
            //Random Loop
            rand = random.nextInt(0,11);
            switch (rand){
                default-> System.out.println("Nothing happens... Yet.");
                case 2 -> System.out.println("You randomly encounter a wild pokemon! A battle breaks out!");
                case 3 -> System.out.println("Your pokemon stumbles and trips attemptin not to crush a Butterfree! You loose a tiny bit of health!");
                case 5 -> System.out.println("Your pokemon finds a wild berry and eats it! Thankfully, it wasn't poisonous");
                case 6 -> System.out.println("Your pokemon finds a wild berry and eats it! It's poisonous!");
            }

        }



    public static void starterChoice(int choice){
        if (choice == 1){
            pokemon1 = new Charizard();
       } //else if (choice == 2) {
           //bellsprout pokemon = new bellsprout();
     //  } //else if (choice == 3) {
         //  ninetails pokemon = new ninetails();
      // } //else {
         //  Ditto pokemon = new Ditto();
     //  }
    }





    }
}
