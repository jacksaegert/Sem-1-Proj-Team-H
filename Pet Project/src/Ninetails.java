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
        fluff += 1;  // exercise keeps the coat healthy
        System.out.println(name + " practices gracefully. Fluff +1.");
    }

    @Override
    public void play() {
        super.play();
        System.out.println(name + " trots around happily, tails swishing.");
    }

    @Override
    public void feed() {
        super.feed();
        fluff += 1;  // good diet = shinier fur
        System.out.println(name + " enjoys a snack and looks fluffier.");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println(name + " curls up into a soft pile of tails.");
    }

    @Override
    public void battle() {
        super.battle();
        System.out.println(name + " maintains elegant poise, even in battle.");
    }

    public void checkStats() {
        super.displayStats();
        System.out.println("Fluffiness: " + fluff);
        System.out.println("=======================\n");
    }
}
