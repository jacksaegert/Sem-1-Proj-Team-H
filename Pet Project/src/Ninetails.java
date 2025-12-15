public class Ninetails extends Pokemon {

    // Small flavor stat: how silky its fur is today
    private int fluff;

    public Ninetails() {
        super("Ninetails", 90, 80, 60, 0); 
        this.fluff = 5;   // default fluffiness
    }

    @Override
    public void train() {
        super.train();
        this.fluff -= 2;  
        System.out.println(name + " practices gracefully. Fluff -2.");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(name + " trots around happily, tails swishing. Fluffiness -1");
        this.fluff -= 1;
    }

    @Override
    public void feed() {
        super.feed();
        this.fluff += 1;  // good diet = shinier fur
        System.out.println(name + " enjoys a snack and looks fluffier. Fluff +1");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(name + " curls up into a soft pile of tails.");
    }

    @Override
    public void battle() {
        super.battle();
        System.out.println(name + " maintains elegant poise, even in battle. Fluff -3");
        this.fluff -= 3;
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Fluffiness: " + fluff);
        System.out.println("=======================\n");
    }

    public void groom() {
        System.out.println("You give Ninetails a little rub! Fluff +7");
        this.fluff += 7;
    }

    @Override
    public void tick() {
        super.tick();
        fluff -= 1;
    }
}
