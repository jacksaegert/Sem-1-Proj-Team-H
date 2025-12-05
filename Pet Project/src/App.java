public class App {
    public static void main(String[] args) throws Exception {



        System.out.println("Hello, World!");
        Charizard charizard = new Charizard(100,100,1,38);
        System.out.println("Charizard created with health: " + charizard.getHealth() + ", energy: " + charizard.getEnergy() + ", level: " + charizard.getLevel() + ", temperature: " + charizard.getTemperature() + "°C");

    
}
}
