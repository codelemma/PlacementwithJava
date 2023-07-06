import java.util.*;
public class PrintNtoOne{
    public static void main(String[] args){
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNos(n);
    }
    static void printNos(int n){
        if(n==0){
            return;
        }
        else{
            System.out.print(n+" ");
            printNos(n-1);
        }
    }
}