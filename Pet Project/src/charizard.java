public class Charizard {
@SuppressWarnings("FieldMayBeFinal")
private  int health;
@SuppressWarnings("FieldMayBeFinal")
private  int energy;
@SuppressWarnings("FieldMayBeFinal")
private  int level;
@SuppressWarnings("FieldMayBeFinal")
private  int temperature;
@SuppressWarnings("FieldMayBeFinal")
public int mood;

    public Charizard(int Health, int Energy, int Level, int Temperature, int Mood) {
     
        this.health=Health;
     
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



public double getTemperature() {

    return temperature;

}

  
public int getMood() {

    return mood;

}
    

}
