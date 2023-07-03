import java.util.*;
public class MyPla_PrNo1_TrailingZeroesInTheFactorial {
    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = TrailingZeroesInTheFactorial(num);
        System.out.println("Number of zeroes is:"+ res);
        sc.close();
    }
    public static int TrailingZeroesInTheFactorial(int num) {
        int i=5,digits = 0;
        while(i<=num) {
            digits  = digits + num/i;
            i*=5;
        }
        return digits;
    }
}
