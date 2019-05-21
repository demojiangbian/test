package Paixusuanfa;

//直接插入排序
public class demo1 {

    public static void main(String[] args){
        int[] a = {98,34,56,30,66,33,75,24,65,93,53,54,13,32,52};
        System.out.println("排序之前");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] + "");
        }
        for (int i = 1; i < a.length; i++){

            int temp = a[i];
            int j;
            for(j = i - 1; j >= 0; j--){
                if (a[j] > temp){
                    a[j + 1] = a[j];
                }else{
                    break;
                }
            }
            a[j + 1] = temp;
        }
        System.out.println();
        System.out.println("排序之后" + "");
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] + "");
        }
    }
}
