import java.util.Arrays;
import java.util.Collection;

public class MergeSort{

    public static void mergeSortedArrays(int arr[], int low, int mid, int high){ //leetcode problem 82
        //low-> mid array is sorted
        // mid+1 -> high arrays is sorted
        //we have to merge the complete arrays
        int n = high-low+1;
        int newArr[]= new int[n]; //
        int ind =0;
        int a=low,b =mid+1;
        while(a<=mid && b<=high){
            if(arr[a]<arr[b]){
                newArr[ind] = arr[a];
                a++;
                ind++;
            } else{
                newArr[ind]= arr[b];
                b++;
                ind++;
            }
        }

        while(a<=mid){
            newArr[ind]=arr[a];
            a++;ind++;
        }

        while(b<=high){
            newArr[ind]=arr[b];
            b++;ind++;
        }
        ind=0;
        for(int i=low;i<=high;i++,ind++){
            arr[i]=newArr[ind];
        }

    }

    public static void mergeSort(int arr[],int low, int high){
        //base case
        if(low>=high)return;
        //cal
        int mid =(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        //assume we have received arrays sorted from low to mid and mid+1 to  high
        //merge function, it will merge the sorted arrays
        mergeSortedArrays(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int arr[] ={5,8,1,7,10,13};
         System.out.println("unsorted array is: "+Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("sorted array is: "+Arrays.toString(arr));

    }

}