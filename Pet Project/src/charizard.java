public class charizard{

    @SuppressWarnings("FieldMayBeFinal")
    private int Health;
    @SuppressWarnings("FieldMayBeFinal")
    private int Energy;
    @SuppressWarnings("FieldMayBeFinal")
    private int Level;
    @SuppressWarnings("FieldMayBeFinal")
    private int Temperature;

    public charizard(int Health, int Energy, int Level, int Temperature) {
        this.Health = Health;
        this.Energy = Energy;
        this.Level = Level;
        this.Temperature = Temperature;
    }

    public int getHealth() {
        return Health;
    }

    public int getEnergy() {
        return Energy;
    }

    public int getLevel() {
        return Level;
    }

    public int getTemperature() {
        return Temperature;
    }
}
