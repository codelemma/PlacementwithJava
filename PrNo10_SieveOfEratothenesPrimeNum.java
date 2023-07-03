import java.util.*;
public class PrNo10_SieveOfEratothenesPrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        smallerPrime(num);
        sc.close();
    }
    public static void smallerPrime(int num) {
        int counter = 0;
        System.out.println("The prime numbers are :");
        for(int i=2;i<=num;i++) {
            int flag = 0;
            int eflag = 0;
            for(int j=2;j*j<=num;j++) {
                if(i % j==0)
                {
                    flag++;
                    if(i==j){
                        eflag++;
                    }
                    break;
                }
            }
            if(flag == 0 ||eflag!=0) {
                System.out.print(" "+i+" ");
                counter++;
            }
        }
        System.out.println("\nTotal No.of prime numbers smaller than "+num+" are "+counter);
    }
}
