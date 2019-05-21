import java.util.*;

public class demo7 {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("String",23);
        map.put("String1",25);
        map.put("",24);
        map.put("",243);
        System.out.println(map);
        int i = map.get("String");
        System.out.println(i);
        Map<String,Integer> map1 = new TreeMap<>();
        map1.put("String",23);
        map1.put("String1",25);
        map1.put("",24);
        System.out.println(map1);
        Map<String,Integer> map2 = new Hashtable<>();
        map2.put("String",23);
        map2.put("String1",25);
        map2.put("",24);
        System.out.println(map2);
        Map<String,Integer> map3 = new LinkedHashMap<>();
        map3.put("String",23);
        map3.put("String1",25);
        map3.put("",24);
        System.out.println(map3);
        for (String key : map.keySet()){
            System.out.println(key + ":" + map.get(key));
        }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }
        Iterator<Map.Entry<String,Integer>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<String,Integer> entry = iterator1.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
