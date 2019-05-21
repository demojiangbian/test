package Paixusuanfa;

//快速排序
public class demo7 {
    public static void main(String[] args){

        int[] a = {490, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        System.out.println("排序之前" + "");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + "");
        }
        quick(a);
        System.out.println("排序之后" + a.length + "");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + "");
        }
    }

    private static void quick(int[] a){
        if (a.length > 0){
            quickSort(a,0,a.length - 1);
        }
    }

    private static void quickSort(int[] a,int low,int hight){

        if (low < hight){
            int middle = getMiddle(a,low,hight);
            quickSort(a,0,middle-1);
            quickSort(a,middle+1,hight);
        }
    }

    private static int getMiddle(int[] a, int low,int hight){

        int temp = a[low];
        while (low < hight){
            while (low < hight && a[hight] >= temp){
                hight--;
            }
            a[low] = a[hight];
            while (low < hight && a[low] <= temp){
                low++;
            }
            a[hight] = a[low];
        }
        a[low] = temp;
        return low;
    }
}
