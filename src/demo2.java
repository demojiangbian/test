import java.util.HashSet;
import java.util.Iterator;

public class demo2 {
    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add(new Per("String1",18));
        hs.add(new Per("String2",20));
        hs.add(new Per("String1",11));
        hs.add(new Per("String3",24));
        hs.add(new Per("String4",25));
        hs.add(new Per("String1",18));
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
    static class Per {
        private String name;
        private int age;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        Per(){

        }
        public Per(String name,int age){
            this.age = age;
            this.name = name;
        }
        @Override
        public int hashCode(){
            System.out.println("hashCode:" + this.name);
            return this.name.hashCode() + age*37;
        }
        @Override
        public boolean equals(Object obj){
            System.out.println(this + "----equals----" + obj);
            if (obj instanceof Per){
                Per p = (Per) obj;
                return this.name.equals(p.name) && this.age == p.age;
            }else {
                return false;
            }
        }
        @Override
        public String toString(){
            return "Per@name:" + this.name + "\n" + "age11:" + this.age;
        }
    }
}
