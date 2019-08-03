package jianzhioffer.lx;


import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStudyTest {
    //测试正则表达式
    public void testRegex() {
        String line = "This order was placed for QT3000! OK?";

        String pattern = "(\\D+)(\\d+)(.*)O";
        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(line);
        if (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.matches());
        } else
            System.out.println("No Match");
    }
  //
    public static void  fileTest() throws Exception{
        File f=new File("file/xxx");
        System.out.println(f.exists());
        FileInputStream in=new FileInputStream(f);
        int x;
        while ((x=in.read())!=-1)
        {
            System.out.println((char)x);
    }
    }
    public static void  scannerTest() {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            System.out.println(scanner.next());
        }
    }
    public static void main(String[] args) throws Exception {
//     JavaStudyTest.scannerTest();
        System.out.println("sdsd".contains("sd"));
    }

    }


