import java.util.*;
public class MPL_PrNo7_CheckPrimeOptimzed {
    public static void main(String[] args) {
        System.out.println("Give the input as a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = CheckPrimeOptimized(num);
        System.out.println(result);
        sc.close();
    }
    public static boolean CheckPrimeOptimized(int num) {
        int flag = 0;
        int counter = 0;
        if(num == 1){
            return false;
        }
        if(num ==2 || num==3){
            return true;
        }
        if(num%2==0 || num%3==0)
        {
            return false;
        }
        for(int i=5;i<=Math.sqrt(num);i+=6)
        {
            if(num%i==0)
            {
                flag++;
                break;
            }
            counter++;
        }
        System.out.println("("+counter+")");
        if(flag==0)
            {
                return true;
            }
            else{
                flag = 0;
                return false;
            }
    }

}
