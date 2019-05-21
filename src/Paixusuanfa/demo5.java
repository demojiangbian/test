package Paixusuanfa;

import java.util.Arrays;

//直接选择排序
public class demo5 {

    public static void main(String[] args){

        int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64 };
        int arrayLength = a.length;
        for (int i = 0; i < arrayLength - 1; i++){
            buildMaxHead(a,arrayLength - 1 - i);

            swap(a,0,arrayLength - 1 - i);

            System.out.println(i);
            System.out.println(Arrays.toString(a));
        }
    }

    //建堆
    public static void buildMaxHead(int[] data,int lastindex){
        for (int i = (lastindex - 1)/2;i >= 0;i--){
            int k = i;

            while (k * 2 + 1 <= lastindex){

                int biggerIndex = 2 * k + 1;

                if (biggerIndex < lastindex){
                    if (data[biggerIndex] < data[biggerIndex + 1]){
                        biggerIndex++;
                    }
                }

                if (data[k] < data[biggerIndex]){
                    swap(data,k,biggerIndex);
                }else {
                    break;
                }
            }
        }
    }

    //交换方法
    private static void swap(int[] a, int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
