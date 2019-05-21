package FileIO;


public class demo2 {

    public static String company = "china soft";
    private String name;
    private String phone = "15211076877";

    static {
        System.out.println("Static Block");
        System.out.println("Employee Company:" + company);
    }
    {
        System.out.println("Non-Static Block");
        System.out.println("Employee phone:" + phone);
    }
    public demo2(){
        this("Unknown");
        System.out.println("demo2()");
    }
    public demo2(String name){
        System.out.println("demo2(String)");
        this.name = name;
    }

    public static void main(String args[]){
        new demo2();
    }
}
