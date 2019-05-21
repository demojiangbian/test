package Paixusuanfa;

//直接选择排序
public class demo4 {
    public static void main(String[] args){
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        System.out.println("排序之前" + "");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + "");
        }

        //for (int i = 0; i <= a.length; i++){   //报错ArrayIndexOutOfBoundsException，i不能等于a.length
        for (int i = 0; i < a.length; i++){
            int main = a[i];
            int n = i;
            //for (int j = i + 1; j <= a.length; j++){
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < main){
                    main = a[j];
                    n = j;
                }
                a[n] = a[i];
                a[i] = main;
            }
        }
        System.out.println();
        System.out.println("排序之后" + "");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + "");
        }
    }


    //自己理解的
   /* public static void main(String[] args){
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1};
        System.out.println("排序之前" + "");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + "");
        }

        for (int i = 0; i < a.length; i++){
            int temp;
            for (int j = i + 1;j < a.length;j++){
                if (a[j] < a[i]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序之后" + "");
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i] + "");
        }
    }*/
}
