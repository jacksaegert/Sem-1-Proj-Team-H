import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Pokemon Simulator");
        System.out.println("The One-Stop-Shop fo all Your Pokemon Training Needs!");
        System.out.println("Press Enter to Begin");
        input.nextLine();
        System.out.println("Choose your Pokemon:");
        System.out.println("\n 1.) Charizard: Manage temperature! \n 2.) Bellsprout: Manage sunlight! \n 3.) Ninetails: Make sure they're well goroomed! \n 4.) Ditto: Swaps to a random pokemon occasionally. Manage everything! \n");
        int choice = input.nextInt();
        if (choice == 1){
            //Charizard Constructor
        } else if (choice == 2) {
            //Bellsprout Constructor
        } else if (choice == 3) {
            //Ninetails Constructor
        } else {
            //Ditto Constructor
        }





    }
}
