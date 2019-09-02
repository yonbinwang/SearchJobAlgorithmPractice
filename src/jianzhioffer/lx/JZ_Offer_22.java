package jianzhioffer.lx;




public class JZ_Offer_22 {

    public static   boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0||sequence==null)
            return false;
        return verify(sequence,0,sequence.length-1);
    }
    public static boolean verify(int [] sequence,int first,int last){
        if(last-first<1) return true;
        int root=sequence[last];
        int i=first;
        for(;i<last;i++)
            if(sequence[i]>root)
                break;
        //判断根节点右子树是否有小于根节点的节点
        for(int j=i;j<last;j++)
            if(sequence[j]<root)
                return false;
        return  verify(sequence,first,i-1)&&verify(sequence,i,last-1);
    }

    public static void main(String[] args) {
        int [] x={2,5,4,8,10,9};
        System.out.println(VerifySquenceOfBST(x));

        }
    }


