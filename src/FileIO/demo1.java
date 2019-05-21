package FileIO;

import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String args[]) throws IOException{
        String s = "测试IO";
       /* byte[] bytes = s.getBytes();
        for (byte b:bytes) {
            System.out.println(Integer.toHexString(b & 0xff) + " ");
        }*/
     /*   byte[] bytes1 = s.getBytes("gbk");
        for (byte b:bytes1) {
            System.out.println(Integer.toHexString(b & 0xff) + " ");
        }*/
        File file1 = new File("c:\\file\\联.txt");

        File file2 = new File("c:\\file","联合.txt");

        File file3 = new File("c:" + File.separator + "file");

        File file4 = new File(file3,"联通.txt");

        System.out.print(file1);

        if (!file1.exists())
            file1.createNewFile();
        else
            file1.delete();
        System.out.println(" ");
        System.out.print(file1.exists() + " ");
        System.out.println(" ");
        System.out.print(file4.getName());
        System.out.println(" ");
        System.out.print(file1.isFile());
        System.out.println(" ");
        System.out.print(file1.isDirectory());
        System.out.println(" ");
        System.out.print(file2.length());
    }
}
