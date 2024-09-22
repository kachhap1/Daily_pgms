import java.util.*;
public class MyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        if(set.contains(2))
        {
            System.out.println("set conatins 2");
        }
        set.remove(2);;
        System.out.println(set);
    }

}
