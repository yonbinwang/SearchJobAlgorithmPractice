package javastudy.test;

public class InnerClassTest {
    InnerClassTest(){
        System.out.println();
    }
   void  p(){
       System.out.println("outer-p");
       oo();
   }
   static  void oo(){

   }
    static class  inner{
        inner(){

        }
        static void  p(){
           p();
            System.out.println("inner-p");
        }
    }
}
