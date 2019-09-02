package jianzhioffer.lx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JZ_Offer_31 {

    public String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list= new ArrayList<>();
        for(Integer x:numbers)
            list.add(x);
         //构建新的大小比较规则，若mn<nm则认为m应该排n前面，若mn>nm则认为n应该排m前面，若mn=nm则认为m=n顺序不影响
        //lambda表达式写法
        Collections.sort(list,(a,b)->(a+""+b).compareTo(b+""+a));
        StringBuilder sb=new StringBuilder();
        for(Integer x:list)
            sb.append(x);
        return sb.toString();

    }

   /*  比较器原生写法
   public String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list= new ArrayList<>();
        for(Integer x:numbers)
            list.add(x);
        Collections.sort(list,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1,Integer o2){
                //构建新的大小比较规则，若mn<nm则认为m应该排n前面，若mn>nm则认为n应该排m前面，若mn=nm则认为m=n顺序不影响
                String str1=o1+""+o2;
                String str2=o2+""+o1;
                return str1.compareTo(str2);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(Integer x:list)
            sb.append(x);
        return sb.toString();
    }*/

    }


