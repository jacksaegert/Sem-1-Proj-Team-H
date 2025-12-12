public class Charizard extends Pokemon {

    public Charizard() {
        super("Charizard", 100, 80, 70, 0); // name, health, energy, mood
    }

    // Charizard-specific ability (optional)
    @Override
    public void train() {
        super.train();
        System.out.println("Charizard breathes fire during training!");
        mood += 1; // Charizard likes training!
    }
}
