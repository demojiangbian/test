package Paixusuanfa;

//冒泡排序
public class demo6 {

    public static void main(String[] args){
        int[] a = {490, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        System.out.println("排序之前" + "");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + "");
        }

        //最大数下沉
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length - i - 1; j++){
                if (a[j] > a[j + 1]){
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("最大数下沉");
        System.out.println("排序之后" + a.length + "");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + "");
        }

        //最小数上浮
        for (int i = 0; i < a.length; i++){
            for (int j = a.length - 1; j > i; j--){
                if (a[j - 1] > a[j]){
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

        System.out.println("最小数上浮");
        System.out.println("排序之后" + a.length + "");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + "");
        }
    }
}
