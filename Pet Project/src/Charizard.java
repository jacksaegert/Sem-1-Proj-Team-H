import java.util.Random;
public class Charizard extends Pokemon {
    Random random = new Random();
    private int temperature;

    public Charizard() {
        super("Charizard", 100, 80, 70, 0); // name, health, energy, mood
        this.temperature = 38;
    }

    // Charizard-specific ability (optional)
    @Override
    public void train() {
        super.train();
        System.out.println("Charizard breathes fire during training!");
        this.temperature += 2;
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Charizard snoozes peacefully");
        this.temperature -= 3;
    }

    @Override
    public void tick() {
        super.tick();
        this.temperature -= 2;
    }
    @Override
    public void displayOptions() {
        super.displayOptions();
        System.out.println("Pokemon-Specific actions:");
        System.out.println("7.) Ignite");
    }
    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Charizard Specific Stats:");
        System.out.println("Temperature: " + this.temperature);
        System.out.println("=======================");
    }
    @Override
    public void options(int choice) {
        switch (choice) {
            case 1 -> this.sleep();
            case 2 -> this.feed();
            case 3 -> this.play();
            case 4 -> this.train();
            case 5 -> this.battle();
            case 6 -> this.displayStats();
            case 7 -> this.ignite();
            default -> System.out.println("Invalid choice.");
        }
    }
    public void ignite() {
        int rand = random.nextInt(5, 11);
        this.temperature += rand;
}
}
