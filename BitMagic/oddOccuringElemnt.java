// This solution contains both logics of 1 odd occuring and the 2 odd occuring
import java.util.*;
public class oddOccuringElemnt
{
    public static void main(String [] args){
        System.out.println("Array is containing an element in odd Occurences");
        int arr[] = {5,6,10,10,10,6,3,3};
        int res = arr[0];
        for(int i =0;i<arr.length;i++){
            res  = res ^ arr[i];
        }
        System.out.println("The results is :"+res);
        // int x = arr[0];
        // int k = (x & (~(x-1)));
        // int res1 = 0,res2 = 0;
        // for(int i = 0;i<arr.length;i++){
        //     if((arr[i] & k)!=0){
        //         res1 = res1^arr[i];
        //     }
        //     else{
        //         res2 = res2 ^ arr[i];
        //     }
        // }
        // System.out.println("The two numbers are : "+res1+" "+res2);
    }
}