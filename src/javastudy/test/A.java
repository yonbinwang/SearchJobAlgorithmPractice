package javastudy.test;

import java.util.Vector;

public class A {
    String x;

    A(String x) {
        this.x = x;
        System.out.println("A()调用--");
    }

    public void print_x() {
        System.out.println(x);
    }

    public void y() {

        System.out.println(x);
    }

}

class B extends A {
    B(String x) {
        super(x);
    }

    public int print_x(String x) {
        System.out.println("重载方法");
        return 0;
    }
    public static void main(String[] args) {
        B b = new B("2");
        System.out.println(b.print_x("x"));
        b.print_x();
        Vector<String> x=new Vector<>();

    }

}