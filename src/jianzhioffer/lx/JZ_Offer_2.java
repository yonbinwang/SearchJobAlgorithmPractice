package jianzhioffer.lx;

public class JZ_Offer_2 {

/*    public String replaceSpace(StringBuffer str) {
        char[] ss = str.toString().toCharArray();
        StringBuffer result =new StringBuffer();
        for(int i=0;i<ss.length;i++)
        {
            if(ss[i]==' ')
            {
                result.append("%20");
            }
            else
                result.append(ss[i]);
        }
        return result.toString();
    }*/
/*    public void JavaStudyTest(){


        String s="sss";

        System.out.println(s.toCharArray());

    }*/
public String replaceSpace2(StringBuffer str) {
    String result = str.toString();
    String s = result.replaceAll("\\s", "%20");
    return s;
}
    public static void main(String[] args) {
        JZ_Offer_2 jz_offer_2 = new JZ_Offer_2();
        System.out.println(jz_offer_2.replaceSpace2(new StringBuffer(" We Are Happy.")));
//        jz_offer_2.JavaStudyTest();
    }
}
