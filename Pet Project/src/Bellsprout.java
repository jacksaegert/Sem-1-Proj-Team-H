public class Bellsprout extends Pokemon {

    // Two small custom flavor stats
    private int growth;      // How much the Bellsprout has grown
    private int hydration;   // How recently it has been watered

    // Default constructor (simple + flavorful)
    public Bellsprout() {
        super("Bellsprout", 80, 70, 50, 0);
        this.growth = 0;
        this.hydration = 0;
    }

    // Optional full constructor
    public Bellsprout(String name, int h, int e, int m, int xp, int growth, int hydration) {
        super(name, h, e, m, xp);
        this.growth = growth;
        this.hydration = hydration;
    }

    // Bellsprout loves sunlight and simple training
    @Override
    public void train() {
        super.train();   // XP gain and energy cost
        growth += 1;     // Gets a little stronger
        System.out.println(name + " swayed happily while training! Growth is now " + growth + ".");
    }

    // Bellsprout REALLY loves water
    @Override
    public void feed() {
        super.feed();    // Health boost
        hydration += 2;
        growth += 1;
        System.out.println(name + " drank deeply! Hydration: " + hydration + ", Growth: " + growth);
    }

    // Cute sleep flavor
    @Override
    public void sleep() {
        super.sleep();
        System.out.println(name + " curls its leaves and rests peacefully.");
    }

    // Simple status check
    public void checkStats() {
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
        System.out.println("XP: " + xp);
        System.out.println("Growth: " + growth);
        System.out.println("Hydration: " + hydration);
    }
}
