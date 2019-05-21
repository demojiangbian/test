package newProject;

public class demo1 {

    private int i = 1;
    private int j = i + 1;
    public demo1(int var){
        System.out.println(i);
        System.out.println(j);
        this.i = var;
        System.out.println(i);
        System.out.println(j);
    }
    {
        j += 5;
    }
    public static void main(String args[]){
        new demo1(8);
    }
}
