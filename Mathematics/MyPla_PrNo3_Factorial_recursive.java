import java.util.*;
public class MyPla_PrNo3_Factorial_recursive {
    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int res  = factorialrecursive(num);
        System.out.println("The factorial of "+num+" is: "+res);
    }
    public static int factorialrecursive(int num) {
        if(num == 1){
            return 1;
        }
        int facto =  num * factorialrecursive(num-1);
        return facto;
    }
}
