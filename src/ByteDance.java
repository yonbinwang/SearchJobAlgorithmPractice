
import java.util.LinkedList;
import java.util.Scanner;
/*
6
20 50 22 74 9 63
*/

public class ByteDance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] a = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
        }
        int[][] briMatrix = new int[x][x];
        for (int i = 0; i <x ; i++)
            for (int j = i; j <x ; j++) {
                if (i == j)
                    briMatrix[i][j] = 1;
                else
                    briMatrix[i][j] = isBridge(a[i], a[j]);
            }
         //填充对称矩阵下三角
        for (int i = 0; i <x ; i++)
            for (int j = 0; j <i ; j++)
               briMatrix[i][j]=briMatrix[j][i];
        //寻找每个节点连通子图
        int sum []=new int[x];
        for (int i = 0; i <x; i++) {
            sum[i]=BFS(briMatrix,x,i);
        }
        //寻找极大连通子图
        int max=sum[0];
        for (int i = 0; i <x ; i++) {
            if(max<sum[i]) max=sum[i];
        }
        System.out.println(max);

    }
    public static int BFS(int [][] a,int n,int x){
        int count =0;
        LinkedList<Integer>  queue=new LinkedList<>();
        boolean visit [] =new boolean[n];
        for (int i = 0; i <n ; i++) {
            visit[i]=false;
        }
        queue.offer(x);
        count++;
        visit[x]=true;
        while (!queue.isEmpty()){
            int head =queue.poll();
            //该节点邻接点入队
            for (int i = 0; i <n ; i++) {
                if(visit[i]=false&&a[head][i]==1)
                {
                   queue.offer(a[head][i]);
                   count=count+1;
                }
            }
        }
        return count;
    }
    public static int isBridge(int i, int j) {
        int gys;
        if(i<j){
            int temp=i;
            i=j;
            j=temp;
            }
        int r=i%j;
        while (r!=0)
        {
            i=j;
            j=r;
            r=i%j;
        }
        gys=j;
        System.out.println(j);
        if(gys>1)
            return  1;
        else
            return  0;
    }
}