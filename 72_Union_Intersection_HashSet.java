import java.util.*;
public class Union_Intersection {
    public static void main(String[] args) {
        int arr1[]= {7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> hs = new HashSet<>();
        for(int i : arr1){
            hs.add(i);
        }
        for(int e : arr2)
        {
            hs.add(e);
        }
        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+"  ");

        }
        System.out.println("\n Union count = "+hs.size());
       hs.clear();
        for(int i:arr1)
        {
            hs.add(i);
        }
        int count =0;
        for(int e=0;e<arr2.length;e++)
        {
            if(hs.contains(arr2[e]))
            {
               count++;
               hs.remove(arr2[e]);
            }
        }
        System.out.println("Intersection count = "+count);
    }
}
