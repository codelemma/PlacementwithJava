import java.util.*;
public class Optimizedapproach {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        GreatestCommonDivFun fun = new GreatestCommonDivFun();
        fun.GreatestCommonDivFun(num1,num2);
        sc.close();
    }
     void GreatestCommonDivFun(int num1 ,int num2) {
        boolean temp = true;
        while(temp) {
            if(num1 == num2){
                temp = false;
                System.out.println("The GCD is :"+ num1);
            }
            else if(num1>num2){
                num1 = num1-num2;
            }
            else if(num2>num1){
                num2 = num2-num1;
            }
        }
        
    }
}
