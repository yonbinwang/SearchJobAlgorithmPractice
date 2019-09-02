package jianzhioffer.lx;

import java.util.HashMap;

public class JZ_Offer_27 {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int length=array.length;
        for(int i:array)
            if(map.get(i)==null)
                map.put(i,1);
            else
                map.put(i,map.get(i)+1);
        for(int i:map.keySet())
            if(map.get(i)>length/2)
                return i;
        return 0;
    }

    }


