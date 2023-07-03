import java.util.*;
public class MyPla_PrNo6_LCM_with_GCD {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        int res =  gcd(x,y);
        int temp = x*y;
        int lcm = temp/res;
        System.out.println("The LCM of the two number's : "+ lcm);
        sc.close();
    }
    public static int gcd(int num1,int num2) {
        if(num2==0){
            return num1;
        }
        else{
            return gcd(num2,num2%num1);
        }
    }
}
