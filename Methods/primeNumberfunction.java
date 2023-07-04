import java.util.*;
public class primeNumberfunction {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPrime(num);
        sc.close();
    }
    static void checkPrime(int n) {
        if(n==1){
            System.out.println("Not A prime");
        }
        else if(n==2 || n==3) {
            System.out.println("Is A prime");
        }
        else if(n%2==0 || n%3==0) {
            System.out.println("Not A prime");
        }
        else{
            int flag=0;
            for(int i= 5;i*i < n;i+=6 ) {
                flag=0;
                if(n%i==0 || n%(i+2)==0) {
                    flag++;
                    break;
                }
             }
             if(flag ==0) {
                System.out.println("Is a prime");
            }
        }
    }
}