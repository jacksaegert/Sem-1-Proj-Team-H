
import java.util.Random;

public abstract class Pokemon {
    Random random = new Random();
    protected int health;
    protected int energy;
    protected int mood;
    protected String name;
    protected int xp;

    public Pokemon(String name, int h, int e, int m, int xp) {
        this.name = name;
        this.health = h;
        this.energy = e;
        this.mood = m;
        this.xp = xp;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getEnergy() { return energy; }
    public int getMood() { return mood; }

    public void modifyHealth(int amount) { health += amount; }
    public void modifyEnergy(int amount) { energy += amount; }
    public void modifyMood(int amount) { mood += amount; }

    public void sleep() {energy += 20; mood += 5;}
    public void feed() {health += 15;}
    public void play() {mood += 20; energy -= 5;}
    public void train() {xp += 15; energy -= 10;}
    public void battle() {xp += 30; health -= random.nextInt(5,26); energy -= random.nextInt(5,26); mood -= random.nextInt(5,26);}
    public void displayStats() {
        System.out.println("\n=== " + name + " Stats ===");
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
        System.out.println("XP: " + xp);
        System.out.println("=======================\n");
    }

    // Simulates passage of time
    public void tick() {
        this.energy -= 5;
        this.mood -= 5;
        this.health -= 5;
    }

    public void options(int choice) {
        switch (choice) {
            case 1 -> this.sleep();
            case 2 -> this.feed();
            case 3 -> this.play();
            case 4 -> this.train();
            case 5 -> this.battle();
            case 6 -> this.displayStats();
            default -> System.out.println("Invalid choice.");
    }
        public void displayOptions() {
            System.out.println("\nWhat do you want to do?");
            System.out.println("""
                    1.) Sleep
                    2.) Feed
                    3.) Play
                    4.) Train
                    5.) Battle
                    6.) Display Stats
                    """);
        }
}
    

}
