import java.util.Arrays;
import java.util.Collections;
public class AllUniquePairs{


    void getAllUniquePair(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }

    void getAllPair(int arr[]){
         int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue; //exclude cases like 5,5 11,11
                }
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }

    void sortArrayAsc(int [] arr){
        //sort in ascending order
        Arrays.sort(arr);//sort complete array

        Arrays.sort(arr, 0,3); 

        // Arrays.sort(arr, 0, 3, Collections.reverseOrder()); //when using comparator, need to use Integer and not int
    }

    static void sortArrayDesc(Integer [] arr){

        //when using reverse order, we can not use int, Need to use Integer(almost same, can use irreplacably as beginner)
        Arrays.sort(arr, 0,4 , Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        Integer a =12;
        System.out.println(Integer.rotateRight(a,2));
    }
    public static void main(String args[]){
        int [] arr = {5,6,7,8};
        Integer [] Arr = {5,6,7,8};
        sortArrayDesc(Arr);

    }

}