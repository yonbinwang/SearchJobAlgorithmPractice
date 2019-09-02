package javastudy.test;

public interface TestDefaultMethod {
    int x=5;
    default  void xs(){
        System.out.println("xxx");
    }
     void yy();
     void zz();
}
