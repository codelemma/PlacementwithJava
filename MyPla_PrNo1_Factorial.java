import java.util.*;
public class MyPla_PrNo1_Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long res = factorial(num);
        System.out.println("The factorial of "+ num +" is: " + res);
        sc.close();
    }
    public static long factorial(int num) {
        long facto = 1;
        if(num == 0)
        {
            return 1;
        }
        while(num!=1){
            facto *= num;
            num--;
        }
        return facto;
    }
    
}
