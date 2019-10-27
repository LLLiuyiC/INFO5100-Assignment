package Assignment6;

import java.lang.reflect.Array;
import java.util.*;

public class Q4 {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            map.put(i,map.get(i)+1);
        }
        int num ;
        boolean flag;
        List<Integer> list = new ArrayList<>();
        for(int value:map.values()){
            if(list.contains(value)){
                return false;
            }
            list.add(value);
        }

        return true;
    }

    public static void main(String[] args){
        Q4 q =new Q4();
        int[] arr = {1,2,2,1,1,3};
        System.out.println(q.uniqueOccurrences(arr));
    }
}
