import  java.util.*;
public class PlacementsArrays {
    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int  size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements");
        for(int i= 0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for(int i=0;i<array.length;i++) 
        {
            
            if(array[i] > max){
                 max = array[i];
                 
             }
             else if(array[i] < min){
                 min = array[i];
                 
             }
         }
         System.out.println("Max is : "+ max);
         System.out.println("Min is : "+ min);
    }
    
}

