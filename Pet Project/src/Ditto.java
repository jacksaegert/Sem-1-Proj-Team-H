public class Ditto extends Pokemon {

    public Ditto() {
        super("Ditto", 70, 70, 70, 0);
    }

    @Override
    public void battle() {
        System.out.println("Ditto transforms into its opponent before attacking!");
        super.battle();
    }

}
