import java.util.*;

public class isKthBitIsSet {
    public static void main(String[] args) {
        System.out.println("The function Checks whether the bit at Kth position is set or not.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the Kth position");
        int pos = sc.nextInt();
        isKthBitSet(num, pos);
        sc.close();
    }

    public static void isKthBitSet(int num, int k) {
        int pos = num >> k - 1;
        if ((num & pos) != 0) {
            System.out.println("Yes The " + k + "th bit is set");
        } else {
            System.out.println("NO The " + k + "th bit is not set");
        }

    }
}