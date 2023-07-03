import java.util.*;
public class PrNo10_PrimeNumbers {
     public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        smallerPrime(num);
        sc.close();
    }
    public static void smallerPrime(int num) {
        if(num ==1) {
            System.out.println("1 is not a prime number");
        }
        for(int i=2;i<=num;i++) {
            if(isPrime(i)) {
                System.out.print(" "+i+" ");
            }
        }
    }
    public static boolean isPrime(int num) {
        boolean flag = false;
        if(num == 1){
            return false;
        }
        else if(num == 2 || num == 3)
        {
            return true;
        }
        else if(num % 2 == 0) {
            return false;
        }
        else if(num % 3 == 0) {
            return false;
        }
        else {
             for(int i=5;i*i<=num;i=i+6) {
                flag = false;
                if(num%i==0) {
                    flag = true;
                    break;
                }
            }
        }
        return (flag==false)? (true):(false);
    }
}
