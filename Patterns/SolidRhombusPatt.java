/*
Hello! Enter the numnber of rows
5
                *  *  *  *  * 
             *  *  *  *  *
          *  *  *  *  *
       *  *  *  *  *
    *  *  *  *  * 
*/

import java.util.*;
public class SolidRhombusPatt {
    
    public static void  main(String [] args){
        System.out.print("Hello! Enter the numnber of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
       {
           for(int j=0;j<n-i;j++)
           {
               System.out.print("   ");
           }
           for(int k=1;k<=n;k++)
           {
            System.out.print(" * ");
           }
           System.out.print("\n");

        }

    }
}
