package jianzhioffer.lx;

import java.util.ArrayList;

public class JZ_Offer_18 {

        public ArrayList<Integer> printMatrix(int [][] matrix) {
            ArrayList<Integer> result= new ArrayList<Integer>();
            int columns=matrix[0].length;
            int rows=matrix.length;
            int start=0;
            if(matrix==null||columns<=0||rows<=0)
                return null;
            while(columns>2*start&&rows>2*start){
                int endX=columns-start-1;
                int endY=rows-start-1;
                //从左到右打印
                for(int i=start;i<=endX;i++)
                    result.add(matrix[start][i]);
                //从上往下打印
                if(start<endY)//至少两行才打印
                    for(int i=start+1;i<=endY;i++)
                        result.add(matrix[i][endX]);
                //从右往左打印
                if(start<endY&&start<endX)//至少两行两列才打印
                    for(int i=endX-1;i>=start;i--)
                        result.add(matrix[endY][i]);
                //从下网上打印
                if(start+1<endY&&start<endX)//至少三行两列才打印
                    for(int i=endY-1;i>=start+1;i--)
                        result.add(matrix[i][start]);
                start++;
            }
            return result;
        }

}
