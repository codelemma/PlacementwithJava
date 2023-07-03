import java.util.*;
public class PrNo9_All_Divisors {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        all_divisors(num);
        sc.close();
    }
    public static void all_divisors(int num) {
        int temp = num;
        int i;
         int count = 0;
        for(i=1; i*i<=num; i++) {
            if(temp % i == 0){
                System.out.print(" "+i+" ");
            }
            temp = num;
            count++;
        }
        for(;i>=1 ;i--)
        {
            if(temp % i == 0){
                int div = temp/i;
                if(i!=temp/i) {
                    System.out.print(" "+div+" ");
                }
            }
        }
        System.out.println("("+count+")");
        // System.out.println("("+temp+")");
    }
}
