import java.util.Random;
import java.util.Scanner;

public class PokemonGame {

    // A single global Pokémon instance the user controls
    private static Pokemon pokemon;
    static boolean isDitto = false;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Pokémon Simulator!");
        System.out.println("The one-stop-shop for all your Pokémon training needs!");
        System.out.println("Press Enter to begin...");
        input.nextLine();

        // Choose starter
        System.out.println("Choose your Pokémon:");
        System.out.println("""
                1.) Charizard - Manage temperature!
                2.) Bellsprout - Manage sunlight!
                3.) Ninetales - Keep them well-groomed!
                4.) Ditto - Randomly transforms. Manage everything!
                """);

        int choice = input.nextInt();
        starterChoice(choice);

        int rand;

        // Main game loop
        while (pokemon.getHealth() > 0 &&
               pokemon.getEnergy() > 0 &&
               pokemon.getMood() > 0) {

            System.out.println("\nWhat do you want to do?");
            System.out.println("""
                    1.) Sleep
                    2.) Feed
                    3.) Play
                    4.) Train
                    5.) Battle
                    6.) Display Stats
                    7.) Quit
                    """);

            choice = input.nextInt();

            // Method for choices
            pokemon.options(choice);

            // RANDOM EVENT SECTION
            rand = random.nextInt(0, 11);

            switch (rand) {
                case 2 -> {
                    System.out.println("\nA wild Pokémon appears! You are forced into a battle!");
                    pokemon.battle();
                }
                case 3 -> {
                    System.out.println("\nYour Pokémon trips over a Butterfree!");
                    pokemon.modifyHealth(-5);
                }
                case 5 -> {
                    System.out.println("\nYour Pokémon finds a tasty berry and eats it!");
                    pokemon.modifyHealth(+5);
                    pokemon.modifyMood(+2);
                }
                case 6 -> {
                    System.out.println("\nUh-oh... poisonous berry!");
                    pokemon.modifyHealth(-8);
                    pokemon.modifyEnergy(-5);
                }
                default -> {
                    // nothing happens
                }
            }

            if (isDitto) {
                rand = random.nextInt(0, 20);
                if (rand == 1) {
                    System.out.println("\nDitto transforms into another Pokémon!");
                    randomTransform();
                }
            }
        }

        // Game over (after loop)
        System.out.println("\nGAME OVER!");
        System.out.println("Your Pokémon has fainted...");
    }

    // Creates starter Pokémon
    public static void starterChoice(int choice) {
        switch (choice) {
            case 1 -> pokemon = new Charizard();
            case 2 -> pokemon = new Bellsprout();
            case 3 -> pokemon = new Ninetails();
            case 4 -> {
                pokemon = new Ditto();
                isDitto = true;
            }
            default -> {
                System.out.println("Invalid choice, defaulting to Charizard.");
                pokemon = new Charizard();
            }
        }
    }

    public static void randomTransform() {
        Random random = new Random();
        int r = random.nextInt(1, 4);

        switch (r) {
            case 1 -> pokemon = new Charizard();
            case 2 -> pokemon = new Bellsprout();
            case 3 -> pokemon = new Ninetails();
        }

        System.out.println("Ditto transformed into: " + pokemon.getName());
    }
}
