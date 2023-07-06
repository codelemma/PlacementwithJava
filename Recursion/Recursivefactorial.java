import java.util.*;
public class Recursivefactorial{
    public static void main(String[] args){
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
         int res = fact(num);
         System.out.print(res+" ");
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);
    }
}