public class charizard implements Pokemon {

    @SuppressWarnings("FieldMayBeFinal")
    private int health;
   

    @SuppressWarnings("FieldMayBeFinal")
    private int energy;
    @SuppressWarnings("FieldMayBeFinal")
    private int level;
    @SuppressWarnings("FieldMayBeFinal")
    private int temperature;
    @SuppressWarnings({"FieldMayBeFinal"})
    private int mood;

    public charizard(int Health, int Energy, int Level, int Temperature,int Mood) {
        this.health = Health;
        this.energy = Energy;
        this.level = Level;
        this.temperature = Temperature;
        this.mood=Mood;
    }

    public int getHealth() {
        return health;
    }

    public int getEnergy() {
        return energy;
    }

    public int getLevel() {
        return level;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getMood(){
        return mood;
    }
    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sleep'");
    }

    @Override
    public void train() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'train'");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public void feed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'feed'");
    }

    @Override
    public void battle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'battle'");
    }

    @Override
    public void lvlup() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lvlup'");
    }

 
}
