package javastudy.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static void findMinPreIndex(String input, ArrayList<String> result) {
        String [] inputs=input.split(",");
        ArrayList<String> exp=new ArrayList<>();

        for (String x:inputs)
        {
            exp.add(x);
        }
        int len=inputs.length;
        for (int i = 0; i <len; i++) {
                for (int j = 0; j <inputs[i].length() ; j++) {
                     int flag=0;

                     if(j==0) {
                         ArrayList<String> x=exp;
                     }
                     for (int k = 0; k <exp.size(); k++) {

                              if(inputs[i].substring(j,j+1)==inputs[k].substring(j,j+1))
                                {
                                   flag=1;
                                   exp.add(inputs[i]);
                                }

                     }

                     if(flag==0) {
                            result.add(inputs[i].substring(0,j+1));
                            break;
                     }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();
        ArrayList<String> result=new ArrayList<>();
               findMinPreIndex(input,result);
        for (int i = 0; i <result.size() ; i++) {
            if(i!=result.size()-1){
                System.out.print(result.get(i)+",");
            }
            else
                System.out.print(result.get(i));
        }
    }

}
