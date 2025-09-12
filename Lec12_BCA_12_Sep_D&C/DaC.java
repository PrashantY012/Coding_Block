//given a sorted array, use Binary Search to find if element x exists,
//return true or false;
public class DaC{
    static boolean BinarySearch(int arr[], int low, int high, int target){
        //base case
        if(high < low){
            return false;
        }
        //cal
        int mid = (low+high)/2;
        if(arr[mid]==target)return true;

        if(arr[mid]>target){
            int newH = mid-1;
            return BinarySearch(arr,low,newH,target );
        }else{
            int newL = mid+1;
            return BinarySearch(arr,newL,high,target);
        }
    }

    //find the index at which my target exists using binary search
    public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6};
            // int arr[][];
            System.out.println( BinarySearch(arr,0,arr.length-1, 7));
    }
}

/*
 * 
 *  arr[] ={ 12, 18, 23, 45, 48, 66, 72, 78, 79, 83, 85,89}
 */