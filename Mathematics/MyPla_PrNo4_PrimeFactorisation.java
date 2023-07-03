import java.util.*;
public class MyPla_PrNo4_PrimeFactorisation 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        if(num == 1){
            System.out.println(num);
        }
        for(int i=2;i*i<=temp;i++)
        {
            while(temp%i==0)
            {
                System.out.print(i); 
                temp = temp/i;
                System.out.print("x");
            }
        }    
        if(temp>1)
        {
            System.out.print(temp+" ");
        }
        sc.close();
    }
     
}    


