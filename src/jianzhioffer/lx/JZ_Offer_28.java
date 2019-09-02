package jianzhioffer.lx;


import java.util.ArrayList;
import java.util.Collections;

public class JZ_Offer_28 {


       public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

            ArrayList<Integer> list=new ArrayList<>();
            int length=input.length;
            for(int i=0;i<k;i++)
            {
              buildMinHeap(input,length-i-1);
              list.add(input[0]);
              input[0]=input[length-i-1];
            }
            Collections.sort(list);
            return list;
        }
        public void buildMinHeap(int [] arr,int length){
            for(int i=length/2-1;i>=0;i--)
                downAdjust(arr,i,length);
        }
        public void downAdjust(int [] arr, int node,int length){
            int temp=arr[node];
            for(int i=2*node+1;i<length;i=2*i+1)
            {
                if(i<length-1&&arr[i]>arr[i+1])
                    i=i+1;
                if(arr[i]<temp)
                {
                    arr[node]=arr[i];
                    node=i;
                }
                else{
                    break;
                }
            }
            arr[node]=temp;
        }

    public static void main(String[] args) {
           int [] in= {4,5,1,6,2,7,3,8};
      ArrayList<Integer> arr =new JZ_Offer_28().GetLeastNumbers_Solution(in,8);
        for (int x: arr) {
            System.out.println(x);
        }
    }

    }


