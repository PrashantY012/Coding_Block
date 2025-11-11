import java.util.ArrayList;

public class Graph{
    /*0-> 2,3,5
     * 1->4,5
     * 2->0
     * 3
     * 4->5
     * 5->0
     */

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        // al.get(0)//arrayList
        for(int i=0;i<6;i++)al.add(new ArrayList<>());
        System.out.println(al.size());
        al.get(0).add(2);
        al.get(0).add(3);
        al.get(0).add(5);


        al.get(1).add(4);
        al.get(1).add(5);

        al.get(2).add(0);

        al.get(4).add(5);

        al.get(5).add(0);

        for(int i=0;i<6;i++){
            System.out.print(i);
            for(int x:al.get(i)){
                System.out.print(" -> "+x);
            }
            System.out.println();
        }





        
        
        
    }
}