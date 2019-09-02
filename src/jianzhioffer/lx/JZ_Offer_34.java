package jianzhioffer.lx;


import java.util.Arrays;

public class JZ_Offer_34 {
    //暴力求解
  /*  public int InversePairs(int [] array) {
        int count=0;
        for(int i=array.length-1;i>0;i--)
            for(int j=i-1;j>=0;j--)
            {
                if(array[j]>array[i]){
                    count++;
                }
            }
        return count;
    }*/
    //利用归并排序求解
    public int InversePairs(int [] array) {
        int low=0;
        int high=array.length-1;
        if(array==null || high<=0)
            return 0;
        int [] array_clone=array.clone();

        return InversePairsCount(array,low,high,array_clone)%1000000007;
    }
    public int  InversePairsCount(int [] array,int low ,int high,int [] array_clone){
        int left=0,right=0,count=0;
        if(low<high)
        {
            int mid=(low+high)/2;
            left=InversePairsCount(array,low,mid,array_clone);
            right=InversePairsCount(array,mid+1,high,array_clone);
            count=InverseMerge(array,low,mid,high,array_clone);
        }
        return (left+right+count)%1000000007;
    }
    public  int InverseMerge(int [] array,int low,int mid ,int high,int [] array_clone){
        int k=high;
        int count=0;
        int i,j;
        for(i=mid,j=high;i>=low&&j>mid;k--){
            if(array_clone[i]>array_clone[j])
            {
                count+=j-mid;
                if(count>1000000007)
                    count%=1000000007;
                array[k]=array_clone[i--];
            }
            else
                array[k]=array_clone[j--];
        }
        while(i>=low) array[k--]=array_clone[i--];
        while(j>mid)  array[k--]=array_clone[j--];
        while(low<=high)//将每次归并排序结果复制进入辅助数组
        {
            array_clone[low]=array[low];
            low+=1;
        }
        return count%1000000007;
    }
}


