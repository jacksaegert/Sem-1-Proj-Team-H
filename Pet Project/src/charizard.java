import java.util.Random;
public class charizard implements  Pokemon {
    //initialize random
    Random random = new Random();

  //initializes the stats
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
//create constructor
    public charizard() {
        this.health = 100;
        this.energy = 100;
        this.level = 1;
        this.temperature = 38;
        this.mood=100;
         this.xp = 0;
    }
    //getter methods for the variable
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

    //behavior methods

    //the method sleep, increases energy and health, and decreases temperature slightly
    @Override
    public void sleep() {
        this.energy+=25;
      this.health+=10;
      this.temperature-=random.nextInt(0,2);
    }
//the method train, decreases energy and health, increases xp, decreases mood, and increases temperature slightly
    @Override
    public void train() {
        this.energy-=15;
      this.health-=5;
      this.xp+=random.nextInt(20,30);
      this.mood-=5;
      this.temperature+=random.nextInt(0,4);
    }
//the method play, decreases energy, increases health and mood, and decreases temperature slightly
    @Override
    public void play() {
this.energy-=10;
this.health+=5;
this.mood+=15;
this.temperature-=random.nextInt(0,3);
    }
//the method feed, increases energy, health, mood, and increases temperature slightly
    @Override
    public void feed() {
        this.energy+=20;
      this.health+=15;
      this.mood+=10;
      this.temperature+=random.nextInt(0,2);
    }
//the method battle, decreases energy and health, increases xp, decreases mood, and increases temperature slightly
    @Override
    public void battle() {
        this.energy-=random.nextInt(15,45);
      this.health-=20;
      this.xp+=50;
      this.mood-=10;
      this.temperature+=random.nextInt(0,5);
    }
//the method lvlup, increases level if xp is greater than or equal to 100, increases health, energy, and mood, and decreases xp by 100
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
//the method fire, decreases energy and health, increases temperature significantly, and increases mood, need to change the name
    @Override
    public void fire(){
        this.energy-=20;
        this.health-=10;
        this.temperature+=random.nextInt(5,15);
        this.mood+=10;
    }

    //things for jack
    public void displaystats() {
        System.out.println("Charizard's Stats:" +"Health: " + this.health + ", Energy: " + this.energy + ", Level: " + this.level + ", Temperature: " + this.temperature + "°C" + ", Mood: " + this.mood + ", Experience: " + this.xp);
     
    }
    public void checkTemperature() {
        if(this.temperature>100){
            this.temperature=100;
        if (this.temperature < 20) {
            System.out.println("Charizard is too cold! Temperature: " + this.temperature + "°C "+"please raise immediately");
        }
        else if(this.temperature< 35){
            System.out.println("Charizard's temperature is normal and has gained a mood boost. Temperature: " + this.temperature + "°C ");
            this.mood+=5;
        }
        else if (this.temperature >= 15) {
            System.out.println("Charizard has become too cold and passed out! Temperature: " + this.temperature + "°C "+"next time check their temperature more often and keep it above 15°C");
            this.health-=100; 
        }
        if(this.temperature>100){
            this.temperature=100;
        }
    }
}
        public void checkHealth() {
            if(this.health>100){
                this.health=100;
            if (this.health <= 0) {
                System.out.println("Charizard has fainted! Health: " + this.health + " maintain their vitals effectively to prevent this in the future.");
                System.exit(1);
            }
            
            }
        }
    
    
    public void checkMood() {
        if(this.mood>100){
            this.mood=100;
        
        if (this.mood < 25) {
            System.out.println("Charizard is feeling very sad! Mood: " + this.mood + " please play with them to cheer them up.");
        }
        if (this.mood >= 80) {
            System.out.println("Charizard is feeling very happy! Mood: " + this.mood + " keep up the good work!");
            this.health+=5;
            this.energy+=10;
        }
        if (this.mood <= 0) {
            System.out.println("Charizard is extremely depressed and has lost the will to live! Mood: " + this.mood + " please take better care of their emotional well-being.");
            this.health-=100;
        }
    }
      
    }
    public void checkEnergy() {
        if(this.energy>100){
            this.energy=100;
        if (this.energy < 20) {
            System.out.println("Charizard is extremely tired! Energy: " + this.energy + " please let them rest.");
        }
        if (this.energy > 80) {
            System.out.println("Charizard is full of energy! Energy: " + this.energy + " great job keeping them active!");
            this.mood+=5;
        }
        if (this.energy <= 0) {
            System.out.println("Charizard has collapsed from exhaustion! Energy: " + this.energy + " please manage their energy levels better.");
            this.health-=100;
        }
        if(this.energy==100){
            System.out.println("Charizard's energy is at maximum capacity! Energy: " + this.energy + " and has gained a health boost.");
            this.health+=5;
        }
       
        }
    }
}