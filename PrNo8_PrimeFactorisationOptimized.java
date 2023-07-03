import java.util.*;
public class PrNo8_PrimeFactorisationOptimized {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The Prime numbers are: ");
        primeFactor(num);
        sc.close();
    }
    public static void primeFactor(int num)
    {
        if(num == 1)
        {
            System.out.println(num +" is not a prime number");
        }
        while(num % 2 == 0){
                System.out.print(" "+2+" ");
                num = num/2;
            }
        while(num % 3 ==0){
            System.out.print(" "+3+" ");
            num = num/3;
        }
        for(int i=5; i*i <= num;i=i+6)
        {
            while(num % i == 0){
                System.out.print(" "+i+" ");
                num = num / i;
            }
            while(num %(i+2) == 0){
                System.out.print(" "+i+2+" ");
                num = num / (i+2);
            }
        }
        if(num > 3){
            System.out.print(" "+num+" ");
        }
    }
}
