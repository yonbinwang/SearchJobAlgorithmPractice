package javastudy.test;

import java.io.Serializable;

public class  Student implements Serializable {

    String name="张山";
    int age=20;
    transient  float  error=232f;

    @Override
    public String toString() {
        return name+"-"+age+"-"+error;
    }
}