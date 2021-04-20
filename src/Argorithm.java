import java.util.Arrays;

/**
 * 选择排序、冒泡排序、插入排序，时间复杂度为O(N*N)
 * 并且写了一个对数器
 */
public class Argorithm {
    /**
     * 选择排序，每次选择最小的值，交换
     * @param arr
     */
       public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) min = j;
            }
            swap(arr, min, i);
        }
    }

    /**
     * 冒泡排序，相邻的两个进行顺序排列，每循环一次就有一个数归位，注意内循环的越界
     * @param arr
     */
        public static void bubble(int[] arr)
        {
            for (int i=0;i<arr.length;i++)
            {
                for(int j=0;j< arr.length-i-1;j++)
                {
                    if(arr[j]>arr[j+1]) {
                        swap(arr, j, j + 1);
                    }
                }
            }
        }

    /**
     * 插入排序指的是i位置上的数每次与i位置之前的数相比，如果小于就交换，一直向前看与前面的比较
     * @param arr
     */
    public static void insertSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
            for (int j=i-1;j>=0&&arr[j]>arr[j+1];j--)
            {
                swap(arr,j,j+1);
            }
    }


    public static void swap(int[] arrays, int i, int j) {
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;

    }
        //利用库函数排序
    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }
    public static int[] generateRandomArray(int maxSize, int maxValue)
    {
        int length=(int)( maxSize*(Math.random()));
        int []array=new int[length];
        for(int i=0;i<array.length;i++)
        {
            array[i]=(int)(maxValue*(Math.random()));
        }
        return array;
    }
    //判断两个数组是否相同
    public static boolean isTrue(int[]arr,int []arr1)
    {
        for(int i =0;i<arr.length;i++){
            if(arr[i]!= arr1[i]){
                return false;
            }
        }return true;
    }
    public static void print(int []arr)
    {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arrays = new int[]{6, 2, 4, 52, 2};

        int maxSize=50;
        int maxValue=50;
        boolean flag=true;
        for(int j=0;j<5000000;j++){
            int []arr=generateRandomArray(maxSize,maxValue);
            int []arr1=Arrays.copyOf(arr,arr.length);
            sort(arr1);
            insertSort(arr);
            if(!isTrue(arr,arr1)){
                flag=false;
                print(arr);
                print(arr1);
                break;
            }
        }
        System.out.println(flag ? "Nice!" : "Fucking fucked!");
    }

}
