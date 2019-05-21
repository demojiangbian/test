package Paixusuanfa;

import java.util.Arrays;

public class demo8 {

    public static void main(String[] args){
        int[] a = {490, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        stor(a,0,a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static int[] stor(int[] nums,int low,int high){

        int mid = (low + high)/2;
        if (low < high){
            stor(nums,low,mid);
            stor(nums,mid + 1,high);
            merge(nums,low,mid,high);
        }
        return nums;
    }

    public static void merge(int[] nums,int low,int mid,int high){

        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high){
            if (nums[i] < nums[j]){
                temp[k++] = nums[i++];
            }else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid){
            temp[k++] = nums[i++];
        }
        for (int k2 = 0; k2 <= temp.length;k2++){
            nums[k2 + low] = temp[k2];
        }
    }
}
