import java.util.Scanner;
import java.util.Random;

public class PokemonGame {

    // A single global Pokémon instance the user controls
    private static Pokemon pokemon;

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
                1.) Charizard – Manage temperature!
                2.) Bellsprout – Manage sunlight!
                3.) Ninetales – Keep them well-groomed!
                4.) Ditto – Randomly transforms. Manage everything!
                """);

        int choice = input.nextInt();
        starterChoice(choice);

        int rand;

        // Main game loop
        while (pokemon.getHealth() > 0 && pokemon.getEnergy() > 0 && pokemon.getMood() > 0) {

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

            switch (choice) {
                case 1 -> pokemon.sleep();
                case 2 -> pokemon.feed();
                case 3 -> pokemon.play();
                case 4 -> pokemon.train();
                case 5 -> pokemon.battle();
                case 6 -> pokemon.displayStats();
                case 7 -> {
                    System.out.println("Thanks for playing!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }

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
                case 8 -> {
                    if (pokemon instanceof Ditto) {
                        System.out.println("\nDitto transforms into another Pokémon!");
                        randomTransform();
                    }
                }
                default -> {} // nothing happens
            }
        }

        System.out.println("\nGAME OVER!");
        System.out.println("Your Pokémon has fainted...");
    }

    // Creates starter Pokémon
    public static void starterChoice(int choice) {
        switch (choice) {
            case 1 -> pokemon = new Charizard();
            case 2 -> pokemon = new Bellsprout();
            case 3 -> pokemon = new Ninetales();
            case 4 -> pokemon = new Ditto();
            default -> {
                System.out.println("Invalid choice, defaulting to Charizard.");
                pokemon = new Charizard();
            }
        }
    }

    // Ditto special ability
    public static void randomTransform() {
        Random random = new Random();
        int r = random.nextInt(1, 4);

        switch (r) {
            case 1 -> pokemon = new Charizard();
            case 2 -> pokemon = new Bellsprout();
            case 3 -> pokemon = new Ninetales();
        }

        System.out.println("Ditto transformed into: " + pokemon.getName());
    }
}
