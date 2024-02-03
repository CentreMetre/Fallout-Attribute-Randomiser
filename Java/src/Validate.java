/**
 * @author CentreMetre
 * @since 0.1
 */
public class Validate {

    public static boolean canParseInteger(String input)
    {
        try
        {
            int integer = Integer.parseInt(input);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public static int numberRange(String input, int minInput, int maxInput)
    {
        System.out.println(" ");
        if(!canParseInteger(input))
        {
            System.out.println("Your input is invalid, only input digits. Try again.");
            return -1;
        }

        int choice = Integer.parseInt(input);

        if(choice >= minInput && choice <= maxInput)
        {
            return choice;
        }
        else
        {
            System.out.println("Your choice is invalid. Try again.");
            return -1;
        }
    }
}
