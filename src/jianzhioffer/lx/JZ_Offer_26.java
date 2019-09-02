package jianzhioffer.lx;
import java.util.ArrayList;
import java.util.Collections;

public class JZ_Offer_26 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list= new ArrayList<>();
        if(str!=null&&str.length()>0)
        {
            PermutationPartion(str.toCharArray(),0,list);
            Collections.sort(list);
        }

        return list;
    }
    public void PermutationPartion(char [] s,int index ,ArrayList<String> list){
        if(index==s.length-1){
            String val=String.valueOf(s);
            if(!list.contains(val))
                list.add(val);
        }
        else{
            for(int j=index;j<s.length;j++)
            {
                swap(s,index,j);
                PermutationPartion(s,index+1,list);
                swap(s,index,j);
            }
        }
    }
    public void swap(char [] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }

    }


