public class Test {
    public static void main(String[] args)throws Exception  {



        System.out.println("Hello, World!");
                charizard charizard = new charizard();
        System.out.println("Charizard created with health: " + charizard.getHealth() + ", energy: " + charizard.getEnergy() + ", level: " + charizard.getLevel() + ", temperature: " + charizard.getTemperature() + "°C" + ", experience: " + charizard.getXp());
        charizard.train();
        System.out.println("After training, Charizard has health: " + charizard.getHealth() + ", energy: " + charizard.getEnergy() + ", level: " + charizard.getLevel() + ", temperature: " + charizard.getTemperature() + "°C" + ", experience: " + charizard.getXp());
        charizard.battle();
        System.out.println("After battling, Charizard has health: " + charizard.getHealth() + ", energy: " + charizard.getEnergy() + ", level: " + charizard.getLevel() + ", temperature: " + charizard.getTemperature() + "°C" + ", experience: " + charizard.getXp());
        charizard.sleep();
        System.out.println("After sleeping, Charizard has health: " + charizard.getHealth() + ", energy: " + charizard.getEnergy() + ", level: " + charizard.getLevel() + ", temperature: " + charizard.getTemperature() + "°C" + ", experience: " + charizard.getXp());
        charizard.feed();
        System.out.println("After feeding, Charizard has health: " + charizard.getHealth() + ", energy: " + charizard.getEnergy() + ", level: " + charizard.getLevel() + ", temperature: " + charizard.getTemperature() + "°C" + ", experience: " + charizard.getXp());
        charizard.play();
        System.out.println("After playing, Charizard has health: " + charizard.getHealth() + ", energy: " + charizard.getEnergy() + ", level: " + charizard.getLevel() + ", temperature: " + charizard.getTemperature() + "°C" + ", experience: " + charizard.getXp());
        charizard.train();
        System.out.println("After training, Charizard has health: " + charizard.getHealth() + ", energy: " + charizard.getEnergy() + ", level: " + charizard.getLevel() + ", temperature: " + charizard.getTemperature() + "°C" + ", experience: " + charizard.getXp());
        charizard.lvlup();
        System.out.println("After leveling up, Charizard has health: " + charizard.getHealth() + ", energy: " + charizard.getEnergy() + ", level: " + charizard.getLevel() + ", temperature: " + charizard.getTemperature() + "°C" + ", experience: " + charizard.getXp());
        charizard.fire();
        System.out.println("After using fire, Charizard has health: " + charizard.getHealth() + ", energy: " + charizard.getEnergy() + ", level: " + charizard.getLevel() + ", temperature: " + charizard.getTemperature() + "°C" + ", experience: " + charizard.getXp());
    
    charizard.checkEnergy();
    charizard.checkHealth();
    charizard.checkTemperature();
    charizard.checkMood();
    charizard.displaystats();
    
}
}
