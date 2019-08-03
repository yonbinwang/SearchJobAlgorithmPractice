package javastudy.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

public class Test_Swap<E extends Map<String,String>> {

    public static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    public static void swap(SW x){
        int temp;
        temp=x.a;
        x.a=x.b;
        x.b=temp;
    }
    public static void main(String[] args) {
        SW sw = new SW(1, 2);
        swap(sw.a,sw.b);
        System.out.println(sw.a+":"+sw.b);
        swap(sw);
        System.out.println(sw.a+":"+sw.b);
        JSONArray objects = JSONObject.parseArray("");
        List<String> strings = JSONObject.parseArray("", String.class);

    }
}
class SW{
    int a ;
    int b;
    SW(int a ,int b){
        this.a=a;
        this.b=b;
    }
}