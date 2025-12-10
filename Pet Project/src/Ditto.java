
import java.util.Random;
public class Ditto implements Pokemon {

          //initialize random
    Random random = new Random();

    //initializes the stats
       private int health;
  
     private int energy;
    @SuppressWarnings("FieldMayBeFinal")
     private int level;
    
      @SuppressWarnings({"FieldMayBeFinal"})
     private int mood;
     @SuppressWarnings("FieldMayBeFinal")
     private double xp;
  //create constructor
      public Ditto() {
          this.health = 100;
          this.energy = 100;
          this.level = 1;
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
  
     
  
      public int getMood(){
          return mood;
      }
  
      //behavior methods
  
      //the method sleep, increases energy and health, and decreases temperature slightly
      @Override
      public void sleep() {
          this.energy+=25;
        this.health+=10;
        
      }
  //the method train, decreases energy and health, increases xp, decreases mood, and increases temperature slightly
      @Override
      public void train() {
          this.energy-=15;
        this.health-=5;
        this.xp+=random.nextInt(20,30);
        this.mood-=5;
        
      }
  //the method play, decreases energy, increases health and mood, and decreases temperature slightly
      @Override
      public void play() {
  this.energy-=10;
  this.health+=5;
  this.mood+=15;
      }
  //the method feed, increases energy, health, mood, and increases temperature slightly
      @Override
      public void feed() {
          this.energy+=20;
        this.health+=15;
        this.mood+=10;
      }
  //the method battle, decreases energy and health, increases xp, decreases mood, and increases temperature slightly
      @Override
      public void battle() {
          this.energy-=random.nextInt(15,45);
        this.health-=20;
        this.xp+=50;
        this.mood-=10;
       
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
}
