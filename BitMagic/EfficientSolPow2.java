import java.util.*;
public class EfficientSolPow2
{
    public static void main(String [] args){
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = SolPow2(num);
        System.out.println(res);
    }
    static boolean SolPow2(int n){
        // if(n==0){
        //     return false; 
        // }
        // else
        return ((n & ((n & n-1)))==0);
        
    }
}