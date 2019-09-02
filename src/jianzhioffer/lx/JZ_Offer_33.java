package jianzhioffer.lx;

import java.util.HashMap;

public class JZ_Offer_33 {
    public int FirstNotRepeatingChar(String str) {
        char [] str_c= str.toCharArray();
        HashMap<Character,Boolean> map =new HashMap<>(); //利用hashmap记录已经确定不是第一次出现的字符
        int i;
        boolean flag;//记录是否重复出现，如果是则为true
        for (i=0;i<str_c.length;i++)
        { //如果在已确定不是第一次出现，则跳过这个字符寻找下一个
            if(map.get(str_c[i])!=null)
                continue;
            flag=false;
            for(int j=i+1;j<str_c.length;j++)
            {
                //不是只出现一次，退出循环
                if(str_c[i]==str_c[j])
                {
                    flag=true;//表示该字符重复出现
                    map.put(str_c[i],false);
                    break;
                }
            }
            //如果只出现一次，退出外循环，返回该字符位置i
            if(flag==false)
                break;
        }
        if(i==str_c.length) //如果没有找到返回for循环的退出条件，i等于字符数组长度
            return -1;
        else
            return i;

    }
    }


