public class Bellsprout implements Pokemon {

    // Gameplay attributes
    private String name;
    private int level;
    private int play;
    private double battle;
    private double train;
    private int waterPlant;
    private int energy;

    // FULL CONSTRUCTOR
    public Bellsprout(String theName, int theLevel, int thePlay, double theBattle, double theTrain, int theWaterPlant, int theEnergy) {

        name = theName;
        level = theLevel;
        play = thePlay;
        battle = theBattle;
        train = theTrain;
        waterPlant = theWaterPlant;
        energy = theEnergy;
    }

    // DEFAULT CONSTRUCTOR
    public Bellsprout() {
        name = "Bellsprout";
        level = 1; //Initial 
        play = 0; //Initial 
        battle = 0.0; //Initial 
        train = 0.0; //Initial 
        waterPlant = 0; //Initial 
        energy = 100; //Inital
    }

    //Method #1: Play
    public void play(int amount) {
        play += amount;

        // Playing increases motivation to train
        train += amount * 0.3;

        // Playing gives tiny experience
        level += amount * 0.05;

        System.out.println(name + " played! Play: " + play + ", Train: " + train + ", Level: " + level);
    }

    //Method #2: Battle
    public void battle(double amount) {
        battle += amount;
        // Battle gives strong experience
        level += amount * 0.2;
        // Battle improves training slightly
        train += amount * 0.1;
        //Battle decreases energy 
        energy -= 20;

        System.out.println(name + " battled! Battle: " + battle + ", Train: " + train + ", Level: " + level + ", Energy: " + energy);
    }

    //Method #3: Train
    public void train(double amount) {
        train += amount;

        // Better training → better battle performance
        battle += amount * 0.15;

        // Training adds experience (moderate)
        level += amount * 0.1;

        System.out.println(name + " trained! Train: " + train + ", Battle: " + battle + ", Level: " + level);
    }

    //Method #4: Watering the plant
    public void feed() {
        waterPlant++;

        // Watering boosts happiness/play
        play += 2;

        // Happiness increases training energy
        train += 0.5;

        System.out.println(name + " was watered! WaterPlant: " + waterPlant + ", Play: " + play + ", Train: " + train);
    }
    
    // Updated battle method
    public void sleep (double amount) {
    if (energy <= 0) {
        System.out.println(name + " has no energy left and has passed away...");
        System.out.println("Game Over for " + name + ".");
    }else {
        System.out.println(name + "has" + energy + "energy left!");
        
    }
    } 
}