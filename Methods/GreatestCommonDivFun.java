import java.util.*;
public class GreatestCommonDivFun {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        GreatestCommonDivFun(num1,num2);
        sc.close();
    }
    static void GreatestCommonDivFun(int num1,int num2){
        int max = num1>num2?num1:num2;
        for(int i=max;i>0;i--){
            if(num1%i==0 && num2%i==0) {
                System.out.println("The Greatest Common Divisor of the two numbers are : "+ i);
                break;
            }
        }
        
    }
}
