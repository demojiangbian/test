import java.util.Comparator;
import java.util.TreeSet;

public class demo5 {
    public static void main(String[] agrs){
        TreeSet treeSet = new TreeSet(new pre());
        treeSet.add(new book("think in java",58));
        treeSet.add(new book("java编程思想",78));
        treeSet.add(new book("java核心技术",108));
        treeSet.add(new book("数据结构",45));
        treeSet.add(new book("mysql简要教材",58));
        treeSet.add(new book("think in java",58));
        System.out.println(treeSet);
    }
    static class pre implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            book b1 = (book)o1;
            book b2 = (book) o2;
            System.out.println(b1 + "comparaTor" + b2);
            if (b1.getPrice() > b2.getPrice()){
                return 1;
            }if (b1.getPrice() < b2.getPrice()){
                return -1;
            }
            return b1.getName().compareTo(b2.getName());
        }
    }
    static class book{
        private String name;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public book(){

        }

        public book(String name,double price){
            this.name = name;
            this.price = price;
        }
        @Override
        public String toString(){
            return "Book[name = " + name + ",price = " + price + "]";
        }
    }
}
