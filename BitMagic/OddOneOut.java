public class OddOneOut{
public static void oddOneOut(int arr[]){
    for(int i=0;i<arr.length;i++){
        int count = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count+=1;
            }
        }
        if(count%2 != 0){
            System.out.println("This is element "+ count+" occured odd times");
        }
    }
}
public static void main(String [] args){
    int arr = new arr[5];
    arr[0] = 4;
    arr[1] = 7;
    arr[2] = 2;
    arr[3] = 7;
    arr[4] = 7;
    OddOneOut(arr);
}
}