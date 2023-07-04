import java.util.*;
public class AddingCommandLineArgs {
    public static void main(String[] args) {
        double size = args.length;
        int sum= 0;
        for(String i: args) {
            
            sum += Integer.parseInt(i);
        }
        System.out.println("The sum is : "+sum);
    }
}
