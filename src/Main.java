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

    Player player = new Player();
    static Random random = new Random();

    public static void main(String[] args)
    {
        System.out.println("1. Create new random stats");
        System.out.println("2. Settings");
        System.out.println("0. Exit programme");

        mainMenuInput();
    }

    public static void mainMenuInput()
    {
        Scanner input = new Scanner(System.in);

        String mainMenu = input.nextLine();
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
                break;
            case -1:
                mainMenuInput();
                break;

        }
    }

    public static void test()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println(random.nextInt(0,5));

        }
    }

    public static void generateNewStatsScript()
    {
        aquireGame();
    }

    public static void aquireGame()
    {

    }

    public static void getConditions()
    {

    }

    public static void generateRandomNumbers()
    {
        player.setMaxPoints([5] = 5);

    }
}