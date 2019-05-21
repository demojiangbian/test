import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public class demo4 {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Per("String5",18,"男"));
        treeSet.add(new Per("String1",18,"女"));
        treeSet.add(new Per("String4",17,"女"));
        treeSet.add(new Per("String2",10,"女"));
        treeSet.add(new Per("String3",28,"男"));
        System.out.println(treeSet);
        System.out.println(treeSet.size());
    }
    static class Per implements Comparable{
        @Override
        public int compareTo(Object obj) {
            Per p = (Per)obj;
            System.out.println(this + "compareTo" + p);
            if (this.age > p.age){
                return 1;
            }if (this.age < p.age){
                return -1;
            }
            return this.name.compareTo(p.name);
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
            return "Per[name=" + name + ", age=" + age + ",gender" + gender + "]";
        }
        public Per(){

        }
        public Per(String name,int age,String gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        private String name;
        private int age;
        private String gender;

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

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

    }
}
