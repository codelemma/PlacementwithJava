import java.util.*;

public class MostEffiSolForCountSetBits {
    public static void main(String[] args) {
        System.out.println("This approach gives the number of set bits in any integer in orderof Log(n) time");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        // setting the bits for the 8 bits
        int res = countSetbits(num);
        System.out.println("The number bits are : " + res);
    }

    public static int countSetbits(int num) {
        int table[] = new int[256];
        table[0] = 0;
        for (int i = 1; i <= 255; i++) {
            table[i] = table[i & (i - 1)] + 1;
        }
        return table[num & 255] + table[(num >> 8) & 255] + table[(num >> 16) & 255] + table[(num >> 24)];
    }
}
