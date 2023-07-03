import java.util.*;
public class MyPla_CountdigitsPrNo1 {
    public static void main(String[] args) {
        System.out.println("Enyter the number");
        Scanner sc=  new Scanner(System.in);
        int num  =  sc.nextInt();
        int res = countdigits(num);
        System.out.println("The number of digits are : "+ res);
    }
    public static int countdigits(int x) {
        byte counter= 0;
        while(x > 0) {
            int digit = x % 10;
            x = x / 10;
            counter++;
        }
        return counter;
    }
}
