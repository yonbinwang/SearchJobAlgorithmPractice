package jianzhioffer.lx;

/**
 * @author yonbinwang
 * @date 2019年7月10日下午10:05:41
 * @problem
 * @answer
 * @action
 */
public class JZ_Offer_1 {
    //穷举法
    public boolean Find(int target, int[][] array) {
        int lines = array.length;
        int cols = array[0].length;
        for (int i = 0; i < lines; i++)
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        return false;
    }

    //对行或列进行二分查找
    public boolean Find2(int target, int[][] array){
        int lines = array.length;
        int high;
        int low;
        int mid;
        for (int i = 0; i < lines; i++) {
            high = array[0].length - 1;
            low = 0;
            while (low < high) {
                mid = (low + high) / 2;
                if (target > array[i][mid])
                    low = mid + 1;
                else if (target < array[i][mid])
                    high = mid - 1;
                else
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(2 / 3);

    }
}
	

