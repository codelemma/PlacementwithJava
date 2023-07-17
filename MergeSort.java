
public static int[] MergeSort(int a[],int low,int high){
        if(low == high){
         int[] ba = new int[1];
         ba[0] = a[low];
         return ba;
        }
        int mid = (low + high)/2;
        int[] fsh = MergeSort(a,low,mid);
        int[] ssh = MergeSort(a,mid+1,high);
        int[] fsa = MergeTwoSortedArray(fsh,ssh);
        return fsa;
    }
    public static int[] MergeTwoSortedArray(int a[],int b[]){
        int[] res = new int[a.length +b.length];
        int i=0;
        int j=0;
        int k=0;
        while((i<a.length) && (j < b.length)){
            if(a[i] < b[j]){
                res[k] = a[i];
                i++;
                k++;
            }
            else{
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < a.length){
                res[k] = a[i];
                i++;
                k++;
        }
        while(j < b.length){
                res[k] = b[j];
                j++;
                k++;
        }
        return res;
    }