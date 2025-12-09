public class Ditto implements Pokemon{
    
    private int energy;
    private int level;
    private int mood;
    private int xp;
    private int health;
    public Ditto() {
        this.energy = 100;
        this.health = 100;
        this.level = 1;
        this.mood = 100;
        this.xp = 0;

    }
        public void sleep(){
            this.energy += 20;
            this.mood += 5;
        }
        public void train(){
            this.xp += 15;
            this.energy -=10;

        }
        public void play(){

        }
        public void feed(){

        }
        public void battle(){

        }
        //Write Getter and Setter methods
        write
}
