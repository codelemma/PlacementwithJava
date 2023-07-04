import java.util.*;

public class CountNumberOfBits {
    public static void main(String[] args) {
        System.out.println("This function checks the total number of set bits in any number");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        numberOfBits(num);
        sc.close();
    }

    public static void numberOfBits(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) !=0 ) {
                count++;
            }
            num = num / 2;
        }
        System.out.println("The number of bits present : " + count);
    }
}
