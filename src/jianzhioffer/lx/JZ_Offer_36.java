package jianzhioffer.lx;


import java.util.HashMap;

public class JZ_Offer_36 {
    public int GetNumberOfK(int [] array , int k) {
        HashMap<Integer,Integer>  map= new HashMap<>();
        for(Integer x:array)
        {
            if(map.get(x)==null)
                map.put(x,1);
            else
                map.put(x,map.get(x)+1);
        }

        if(map.get(k)==null)
            return 0;
        else
            return map.get(k);


    }
}


