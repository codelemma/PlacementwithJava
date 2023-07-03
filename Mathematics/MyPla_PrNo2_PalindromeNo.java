import java.util.*;
public class MyPla_PrNo2_PalindromeNo {
    public static void main(String[] args) 
    {
        System.out.println("Enter the number ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        boolean  res = palindrome(num);
        System.out.print(res);
        
    }
    public static boolean palindrome(int num) {
        int newnum = 0;
        int temp = num;
        while(num > 0) {
            int digits = num % 10;
            newnum = newnum*10 + digits;
            num = num / 10;
        }
        System.out.println(newnum);
        if(newnum == temp) {
            return true;
        }
        else{
            return false;
        }
    }
}
