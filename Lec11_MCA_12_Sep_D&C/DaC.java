//given a sorted array, use Binary Search to find if element x exists,
//return true or false;
public class DaC{
   
   static  boolean BSHelper(int arr[], int target, int low, int high){
            int mid =(low+high)/2;
            //base case
            if(low > high){
                return false; 
            }
            if(arr[mid]== target){
                return true;
            }
            //cal
            if(arr[mid]>target){
                high = mid-1;
                return BSHelper(arr, target, low, high);
            }else{
                low = mid+1;
                 return BSHelper(arr, target, low, high);
            }
    }
    static boolean BinarySearch(int arr[], int target){
        return BSHelper(arr, target, 0,arr.length-1);
    }

    //*********************************HW**********************
    //find the index at which my target exists using binary search
    public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6};
            int a = 5/3;
            System.out.println(BinarySearch(arr,2));
            // int arr[][];
            // System.out.println( BinarySearch(arr,0,arr.length-1, 7));
    }
}

/*
 * 
 *  arr[] ={ 12, 18, 23, 45, 48, 66, 72, 78, 79, 83, 85,89}
 */