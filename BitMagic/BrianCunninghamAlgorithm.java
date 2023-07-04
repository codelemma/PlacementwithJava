import java.util.*;
public class BrianCunninghamAlgorithm {
    public static void main(String[] args) {
        System.out.println("This algorithm checks the total number of set bits in any number in order of setbits time");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BriansAlgo(num);
        sc.close();
    }

    public static void BriansAlgo(int num) {
        int count = 0;
        while (num > 0) {
            num = num & (num - 1);
            count += 1;
        }  
        System.out.println("The total number of bits are : "+count);
    }

}
