public class ninetails implements Pokemon{
    private String name;
    private int level;
    double xp;
    int energy;
    int health;
    int mood;
    public ninetails(n)
    {
        mood = 50;
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
}
