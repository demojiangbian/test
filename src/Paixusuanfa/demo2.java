package Paixusuanfa;

//二分排序法，从左到右排起
public class demo2 {
    public static void main(String[] args){

        int a[] = {21,12,32,55,44,66,77,8,88,98,99,76,45,37,27,31,74,35};
        System.out.println("排序之前" + "");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + "");
        }
        sort(a);
        System.out.println();
        System.out.println("排序之后" + "");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] + "");
        }

    }
    private static void sort(int[] a){

        for (int i = 0; i < a.length; i++){
            int temp = a[i];
            int left = 0;
            int right = i - 1;
            int mid = 0;
            while (left <= right){
                mid = (left + right)/2;
                if (temp < a[mid]){
                    right = mid - 1;//比中间值小，重新确定right
                }else {
                    left = mid + 1;//比中间值大，重新确定left
                }
            }
            for (int j = i - 1; j >= left; j--){
                a[j+1] = a[j];
            }
            if (left != i){
                a[left] = temp;//a[i]比前面的数都大，不用动位置
            }
        }
    }
}
