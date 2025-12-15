public class Bellsprout extends Pokemon {

    
    private int sun;      
    private int hydration;   

    // Default constructor
    public Bellsprout() {
        super("Bellsprout", 80, 70, 50, 0);
        this.sun = 0;
        this.hydration = 0;
    }


    // Bellsprout loves sunlight and simple training
    @Override
    public void train() {
        super.train();   // XP gain and energy cost
        sun += 2;     // Gets a little stronger
        System.out.println(name + " Got some sun! Sunlight is now " + sun + ".");
    }

    // Bellsprout REALLY loves water
    @Override
    public void feed() {
        super.feed();    // Health boost
        hydration += 2;
        System.out.println(name + " drank deeply! Hydration: " + hydration);
    }

    // Cute sleep flavor
    @Override
    public void sleep() {
        super.sleep();
        System.out.println(name + " curls its leaves and rests peacefully.");
        this.sun -= 2;
    }
    @Override
    public void displayStats(){
        super.displayStats();
        System.out.println("Sunlight:" + sun);
        System.out.println("Hydration:" + hydration);
    }
    @Override
    public void tick() {
        super.tick();
        this.hydration -= 2;
        this.sun -= 1;
    }
}
