import java.util.TreeSet;

public class demo3 {
    public static void  main(String[] args){
        TreeSet tr = new TreeSet();
        tr.add("String6");
        tr.add("String2");
        tr.add("String3");
        tr.add("String4");
        tr.add("String5");
        System.out.println(tr);//输出[String2, String3, String4, String5, String6]
        boolean ts = tr.add("String15");
        System.out.println(ts);
        System.out.println(tr);
    }
}
