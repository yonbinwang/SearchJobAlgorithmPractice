package javastudy.test;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Properties;

public class test_peoperties {
    public static void main(String[] args) {
        System.out.println(System.getProperties());
        HashMap<String ,String> x=new HashMap<>();
        x.put("x","xx");
        System.out.println(x.entrySet());
        System.out.println(new ArrayList<>(x.entrySet()));
        Properties capitals = new Properties();
        capitals.entrySet();
    }
}
