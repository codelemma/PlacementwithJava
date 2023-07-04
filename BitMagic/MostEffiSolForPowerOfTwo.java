import java.util.*;

public class MostEffiSolForPowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = PowerOfTwo(num);
        System.out.println(res);
        sc.close();
    }

    public static boolean PowerOfTwo(int num) {
        if (num == 0) {
            return false;
        }
        else if(num == 1){
            return true;
        }
        else{
            double check = (Math.log(num))/(Math.log(2));
            int val = (int)check;
            check = check - (double)val;
             
             if(check==0){
                return true;
             }
             else{
                return false;
             }
        }
    }
}