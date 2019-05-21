import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

public class demo6 {
    public static void main(String[] args){
        List list = new ArrayList();
        list.add("String1");
        list.add("String2");
        list.add(null);
        list.add("String3");
        list.add(null);
        list.add("String1");
        int i = list.indexOf("String1");
        System.out.println(list);
        System.out.println(i);
        System.out.println(list.indexOf(null));
    }
}
