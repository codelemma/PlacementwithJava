import java.util.*;
public class MyPla_PrNo7_CheckForPrime {
    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        boolean res =  CheckPrime(x);
        System.out.println(res);
        sc.close();
    }
    public static boolean CheckPrime(int num) {
        int flag = 0;
        int counter = 0;
        if(num==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
             flag = 0;
            if(num % i == 0){
                flag++;
                break;
            }
            counter++;
        }
        System.out.println("("+counter+")");
        if(flag == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
