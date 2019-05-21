import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo1 {
    public static void main(String[] args){
        Set hs = new HashSet();
        hs.add("String1");
        hs.add("String2");
        hs.add("String3");
        hs.add("String4");
        System.out.println(hs.size());
        boolean hs1 = hs.add("String4");
        System.out.println(hs1);
        System.out.println(hs.size());
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
