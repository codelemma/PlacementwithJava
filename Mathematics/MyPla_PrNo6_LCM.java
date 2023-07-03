import java.util.*;
public class MyPla_PrNo6_LCM 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        int res =  lcm(x,y);
        System.out.println("The LCM of the two number's : "+ res);
        sc.close();
    }
    public static int lcm(int num1, int num2)
    {
        boolean b = true;
        int i=0;
        int counter = 0;
        while(b) 
        {
            i++;
            if((num1*i) % num2 == 0)
            {
                b = false;
                i = num1*i;
            }
            counter++;
        }
        System.out.println("("+counter+")");
        return i;
    }
}
