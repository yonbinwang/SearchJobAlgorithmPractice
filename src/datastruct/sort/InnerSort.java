package datastruct.sort;



public class InnerSort {
    /*
    注意所有排序都未使用哨兵位减小边界判断
    */
   static int [] init_arr={5,3,1,4,2,10,7,9,12,11};
   /*
   **插入类
   */
    //1.直接插入排序
    public  static  int [] directInsertSort(int [] arr)
    {
        int x,i,j;
        for ( i = 1; i <arr.length ; i++) {
              x=arr[i];
            for ( j = i; j >0 && x <arr[j-1]; j--) {//注意判断是否越界,没有使用哨兵位
                  arr[j]=arr[j-1];
            }
            arr[j]=x;
        }
      return arr;
    }
    //最坏和平均时间复杂度为O(n*n) 空间复杂度为O(1)
    //当序列正向有序时时间复杂度为O（n）
    //2.折半插入排序
    public  static  int [] halfInsertSort(int [] arr)
    {
        int x,i,j,low,high,mid;
        for ( i = 1; i <arr.length ; i++) {
            x=arr[i];
            low=0;
            high=i-1;
            while(low<=high)//必须要取等，否则不知道插入元素是放mid左边还是右边
            {
                mid=(low+high)/2;
                if(x<arr[mid]){
                  high=mid-1;
                }else
                {
                 low=mid+1;
                }
            }
            for ( j = i; j >high+1; j--) {//注意插入的位置等于high+1并不是high,所以移动到high+2就不移动元素了
                arr[j]=arr[j-1];
            }
            //插入位置始终为high+1（很关键）
            arr[high+1]=x;
        }
        return arr;
    }
    //最坏时间复杂度为O(n*n) 空间复杂度为O(1)

    //3.希尔排序（默认shell序列是折半序列）
    public  static  int [] shellInsertSort(int [] arr)
    {   int k,i,j,x;
        for ( k = arr.length/2; k >=1 ; k/=2) {
            for ( i=k; i <arr.length ; i++) {
                x=arr[i];
                for ( j = i; j >0&&x<arr[j-k] ; j+=k) {//注意这儿不能用哨兵位置判断
                    arr[j]=arr[j-k];
                }
                arr[j]=x;
            }
        }
        return arr;
    }
    /*
     **交换类
     */
    //4.冒泡排序
    public  static  int [] maopaoSort(int [] arr)
    {   boolean flag=false;//交换发生标志位
        int temp;
        for (int i=1; i <arr.length; i++) {
            for (int j = arr.length-1; j>=i ; j--) {
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }
            }
            if(!flag) return  arr;//一趟下来没有发生交换说明序列已经有序,直接返回
        }
        return arr;
    }
    //最坏和平均时间复杂度为O(n*n) 空间复杂度为O(1)
    //当序列初始有序时只需要n-1次比较故时间复杂度为O(n)
    //5.快速排序
    public  static  void  fastSort(int [] arr ,int low,int high){
        int pivot;
        if(low < high)//直到只有一个元素为止（递归出口），千万不要用while
        {
            pivot = Partition(arr, low, high);
            fastSort(arr, low, pivot - 1);
            fastSort(arr, pivot + 1, high);
        }
    //不要有返回值
    }
   //划分操作
    private static int Partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low<high) {
            while (low<high&&pivot <= arr[high]) high--;//为防止high越界为负值，加判断条件
            arr[low] = arr[high];
            while (low<high&&pivot >= arr[low]) low++;//为防止low越界超过数组长度，加判断条件
            arr[high] = arr[low];

        }
        arr[low]=pivot;//注意必须要填上枢轴元素这个时候low和high是相等的
        return  low;
    }
    //快排最好和平均时间复杂度为O(n*log(n)) 最坏时间复杂度为O(n*n)
    //快排空间复杂度平均为O(log(n)) 最坏为O(n)
    //快排平均时间复杂度接近于最佳时间复杂度，故快速排序是内部排序中性能最优的算法
    //每一步划分越对称,时间空间消耗越少


    /*
     **选择类
     */
    //6.简单选择排序
    public static int[] simpleSelectSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }
    //空间复杂度为O(1)
    //最好、平均、最坏时间复杂度都是O(n*n),取决于比较次数n(n-1)/2,元素移动次数小于3*(n-1)
    //简单选择排序与序列初始状态无关
    //7.堆排序
    //堆排序用到完全二叉树顺序存储L[1...n]几个性质：
    //(1)左孩子节点2*i(2)右孩子节点等于2*i+1(3)最后一个非叶子节点序号为n/2
    //注意数组下标必须从1开始


    public  static  int [] heapSelectSort(int [] arr,int start,int length){
        //初始化大根堆，arr[0]用作辅助空间位

        //从n/2往上调整
        for (int i =length/2; i >=start ; i--) {
            AdjustDown(arr,i,length);
        }
        //排序并保存排序结果
        int k=length-1;
        int [] result=new int[length];//保存排序输出结果
        for(int i=length;i>=1;i--)//为了保存结果所以运行了n次，实际上只需要运行n-1次
        {
            result[k]=arr[1];
            arr[1]=arr[i];
            AdjustDown(arr,1,i-1);
            k--;//更新存储结果下标
        }
        return  result;
    }
//向下调整算法
    private static void AdjustDown(int[] arr, int i, int length) {
        //i表示要调整的根节点
         arr[0]=arr[i];
        for (int j = 2*i; j <=length ; j*=2) {
             if(j<length&&arr[j]<arr[j+1]) j++;//若j=length必须判断是否越界
             if(arr[0]>=arr[j]) break;
             else
             {
                 arr[i]=arr[j];
                 i=j;
             }
        }
        arr[i]=arr[0];//将调整元素放回一轮向下调整最终位置
    }
    //空间复杂度为O(1)
    //最佳、平均、最差时间复杂度都为nlogn
    //建堆时间复杂度为O(n) 每次向下调整时间复杂度为O(logn)

    /*
     **归并类
     */
    //8.2-路归并排序
    //递归过程与快排相同（基于分治法）但是每次多一步合并
    public  static  void mergeSort(int [] arr,int low,int high) {
        int mid;
        if(low<high){//只有一个元素时递归的出口
            mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            Merge(arr,low,mid,high);
            }

    }

    private static void Merge(int[] arr, int low, int mid, int high) {
        int []arr_clone=arr.clone();//辅助空间复制原表元素,必须与原表等长
        int i,j,k;
        for(i=low,j=mid+1,k=low;i<=mid&&j<=high;k++)//注意这个时递归程序k一定不能写成0，必须写成等于low
            if(arr_clone[i]<arr_clone[j]) {
                arr[k] = arr_clone[i];
                i++;
            }
            else {
                arr[k] = arr_clone[j];
                j++;
            }

            while (i<=mid) arr[k++]=arr_clone[i++];
            while (j<=high) arr[k++]=arr_clone[j++];
    }
    //归并排序需要辅助数组，故空间复杂度为O(n)
    //时间复杂度，每一趟归并时间复杂度为O(n),完成排序需要进行O(logn)趟归并，故时间平均最好最坏时间复杂度为O(nlogn)
    //2-路归并排序是稳定的排序
    /*
     **非比较类排序
     */
    //9.基数排序
    public  static  int [] baseNumSort(int [] arr) {
        return arr;
    }
//打印数组方法
    public  static  void printArr(int [] arr){
        for (int x:arr
             ) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr;
        arr=init_arr.clone();
        System.out.print("原无序序列：");
        printArr(arr);
        System.out.print("直接插入排序：");
        printArr(directInsertSort(arr));
        System.out.print("折半插入排序：");
        arr=init_arr.clone();
        printArr(halfInsertSort(arr));
        System.out.print("Shell插入排序：");
        printArr(shellInsertSort(arr));
        arr=init_arr.clone();
        System.out.print("冒泡排序：");
        printArr(maopaoSort(arr));
        arr=init_arr.clone();
        System.out.print("快速排序：");
        fastSort(arr,0,arr.length-1);
        printArr(arr);
        arr=init_arr.clone();
        System.out.print("简单选择排序：");
        printArr(simpleSelectSort(arr));
        int [] heap_arr={0,5,3,1,4,2,10,7,9,12,11};//heap_arr[0]是辅助位
        System.out.print("堆选择排序：");
        printArr(heapSelectSort(heap_arr,1,10));
        arr=init_arr.clone();
        System.out.print("归并排序：");
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
