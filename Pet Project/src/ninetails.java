public class Ninetails implements Pokemon{
    private String name;
    private int level = 0;
    private double xp = 0;
    private int energy = 50;
    private int health = 50;
    private int mood = 50;
    public Ninetails(n)
    {
        name = n;
    }
    public void sleep()
    {
        energy += 20;
        mood += 5;
    }
    public void train()
    {
        xp += 15;
        energy -=10;
    }
    public void play()
    {
        mood += 20;
        energy -= 5;
    }
    public void feed()
    {
        health += 15;
    }
    public void battle()
    {
        xp += 30;
        health -= 6;
        energy -= 15;
        mood -= 3;
    }
    public void lvlup()
    {
        level += 1;
    }
    public String getName()
    {
<<<<<<< Updated upstream
        return name;
    }
    public int getLevel()
    {
        return level;
    }
    public int getXP()
    {
        return xp;
    }
    public int getEnergy()
    {
        return energy;
    }
    public int getHealth()
    {
        return health;
    }
    public int getMood()
    {
        return mood;
=======
        return name
    }
    public int getLevel()
    {
        return level
    }
    public int getXP()
    {
        return xp
    }
    public int getEnergy()
    {
        return energy
    }
    public int getHealth()
    {
        return health
    }
    public int getMood()
    {
        return mood
>>>>>>> Stashed changes
    }

    
}
