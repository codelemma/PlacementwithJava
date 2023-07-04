import java.util.*;

public class MyApporachPowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        if (num == 1) {
            System.out.println("The number is a power of 2");
        } else if (num % 2 == 0) {
            while (num > 0) {
                num = num & (num - 1);
                count += 1;
            }
            if (count == 1) {
                System.out.println("The number is a power of 2");
            } else {
                System.out.println("The numbre is NOT a power of 2");
            }
        } else {
            System.out.println("NOT Possible!");
        }
        sc.close();
    }
}
