package jianzhioffer.lx;

public class JZ_Offer_12 {

    public double Power(double base, int exponent) {

        if(exponent==0)
            return 1;
        //当exponent为负数时，每次乘以（base）并把指数-1
        if(exponent>0)
            return base*Power(base,exponent-1);
            //当exponent为负数时，每次乘以（1/base）并把指数+1
        else
            return (1/base)*Power(base,exponent+1);
    }
    public static void main(String[] args) {
    }
}
