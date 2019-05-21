package erfenchazhao;

//二分查找
public class demo1 {

    public static void main(String[] args){
        int[] array = {3,4,4,6,8,7,9,12,21,32,43,56,76,86,97,99};
        int mid = sort(array,111,0,array.length);
        System.out.println(mid);

        int[][] jaggedArray = { new int[] { 1, 2 }, new int[] { 3, 4 } };
        System.out.println(jaggedArray.length);

        int[] arr = { 1, 2, 3 };
        int i = 1;
        arr[i++] = arr[i] +  10;
        System.out.println(arr[2]);

        /*int[] arr = new int[2];
        arr[1] = 10;
        Object o = arr;
        int[] arr1 =(int[])o;
        arr1[1] = 100;
        System.out.println(arr[1]);
        ((int[])o)[1] = 1000;
        System.out.println(arr[1]);*/
    }

    public static int sort(int[] array,int a,int low,int high){
        if (low < high){
            int mid = (low + high)/2;
            if (a == array[mid]){
                return  mid + 1;
            }else if (a < array[mid]){
                return sort(array,a,low,mid - 1);
            }else {
                return sort(array,a,mid + 1,high);
            }
        }
        return -1;
    }
}
