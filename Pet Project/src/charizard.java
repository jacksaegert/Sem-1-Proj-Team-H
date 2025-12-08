import java.util.Random;
public class charizard implements  Pokemon {
    Random random = new Random();

  
     private int health;

   private int energy;
  @SuppressWarnings("FieldMayBeFinal")
   private int level;
    @SuppressWarnings("FieldMayBeFinal")
    private int temperature;
    @SuppressWarnings({"FieldMayBeFinal"})
   private int mood;
   @SuppressWarnings("FieldMayBeFinal")
   private double xp;

    public charizard(int Health, int Energy, int Level, int Temperature,int Mood, double Xp) {
        this.health = Health;
        this.energy = Energy;
        this.level = Level;
        this.temperature = Temperature;
        this.mood=Mood;
         this.xp = Xp;
    }
    
    public double getXp() {
        return xp;
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
        this.energy+=25;
      this.health+=10;
      this.temperature-=random.nextInt(0,2);
    }

    @Override
    public void train() {
        this.energy-=15;
      this.health-=5;
      this.xp+=random.nextInt(20,30);
      this.mood-=5;
      this.temperature+=random.nextInt(0,4);
    }

    @Override
    public void play() {
this.energy-=10;
this.health+=5;
this.mood+=15;
this.temperature-=random.nextInt(0,3);
    }

    @Override
    public void feed() {
        this.energy+=20;
      this.health+=15;
      this.mood+=10;
      this.temperature+=random.nextInt(0,2);
    }

    @Override
    public void battle() {
        this.energy-=random.nextInt(15,45);
      this.health-=20;
      this.xp+=50;
      this.mood-=10;
      this.temperature+=random.nextInt(0,5);
    }

    @Override
    public void lvlup() {
        if(this.xp>=100){
            this.level+=1;
            this.xp= this.xp - 100;
            this.health+=20;
            this.energy+=20;
            this.mood+=10;
        }
    }

    @Override
    public void fire(){
        this.energy-=20;
        this.health-=10;
        this.temperature+=random.nextInt(5,15);
        this.mood+=10;
    }
 
}
