import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Yahyeet
{
    /**
     * Precondition: args[0] is the name of a file and 1 <= args[1] <= 10
     */
    public static void main(String[] args) throws IOException
    {
        File f = new File(args[0]);
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(args[1]);
        if (args.length >= 2)
        {
            System.out.println("You entered\nargs[0]: " + args[0] + "\nargs[1]: " + args[1]);


            // TO DO: Calculate student average scores here
            double avg = 0;
            for (int i = 0; i < n; i++){
                avg += sc.nextInt();
            }
            System.out.println(avg/n);
        }
        else
        {
            System.out.println("Not enough inputs entered.\nFormat: java Yahyeet filename numValues");
        }
    }
}