import java.io.File;
import java.util.Scanner;
import java.util.Random;
/**
 * The Main.main() method is used as the main menu
 * @author CentreMetre
 * @version 0.1
 * @since init
 */

public class Main {
    /**
     * The Main.main() method is used as the main menu. Only used to print main menu options
     * @author CentreMetre
     * @param args
     * @since init
     */

    static Player player = new Player();
    User user = new User();
    static Random random = new Random();
    static Scanner menuChoice = new Scanner(System.in);
    public static void main(String[] args)
    {


        System.out.println("1. Generate new random stats");
        System.out.println("2. Settings");
        System.out.println("0. Exit programme");

        mainMenuInput();
    }

    public static void initialise()
    {
        User user = new User();

    }

    public static void mainMenuInput()
    {


        String mainMenu = menuChoice.nextLine();
        int choice = Validate.numberRange(mainMenu,0,9);

        switch (choice)
        {
            case 0:
                System.exit(0);
                break;
            case 1:
                generateNewStatsScript();
                main(null);
                break;
            case 9:
                test();
                main(null);
                break;
            case -1:
                mainMenuInput();
                break;

        }
    }

    public static void test()
    {
//        for(int i = 0; i < 5; i++)
//        {
//            System.out.println(random.nextInt(0,5));
//
//        }

//        String os = System.getProperty("os.name");
//        System.out.println("Your os is: " + os);



    }

    public static void generateNewStatsScript()
    {
        aquireGame();
    }

    public static void aquireGame()
    {
        System.out.println("What game are you playing?");
        System.out.println("1. Fallout 3");
        System.out.println("2. Fallout: New Vegas");
        System.out.println("3. Fallout 4");

        String input = menuChoice.nextLine();

        int choice = Validate.numberRange(input,1,3);

        switch (choice)
        {
            case 1:
                player.setGame(FalloutEnum.FALLOUT3);
                break;
            case 2:
                player.setGame(FalloutEnum.FALLOUTNV);
                break;
        }
    }

    public static void getConditions()
    {

    }

    public void generateRandomNumbers()
    {
        //player.setMaxPoints();

    }
}