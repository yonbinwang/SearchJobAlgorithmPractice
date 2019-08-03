package javastudy.test;

import java.io.*;

public class Serializable_Test {
    public static void  stuToFile(){
        try {
            FileOutputStream out =new FileOutputStream("./file/stu");
            ObjectOutputStream obj_out=new ObjectOutputStream(out);
            obj_out.writeObject(new Student());
            obj_out.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  static  void fileToStu(){
        try {
            FileInputStream in =new FileInputStream("./file/stu");
            ObjectInputStream obj_in=new ObjectInputStream(in);
            Student stu = (Student) obj_in.readObject();
            obj_in.close();
            in.close();
            System.out.println(stu);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        //stuToFile();
        fileToStu();
    }

}
