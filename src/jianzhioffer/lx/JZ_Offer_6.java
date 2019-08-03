package jianzhioffer.lx;

public class JZ_Offer_6 {

    //暴力求解
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0)
            return 0;
        int min = array[0];
        for (int x : array) {
            if (min >= x)
                min = x;
        }
        return min;
    }

    //寻找分界点
    /*public int minNumberInRotateArray(int[] array) {
        if (array.length == 0)
            return 0;
        int min = array[0];
        for (int x : array) {
            if (min <= x)
                min = x;
            else {
                min = x;
                break;
            }

        }
        return min;
    }*/
}
