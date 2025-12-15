public class Charizard extends Pokemon {

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
    public void tick() {
        super.tick();
        this.temperature -= 2;
    }
}
