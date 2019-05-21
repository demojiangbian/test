package xiancheng;

//创建线程
public class demo1 {

    public static void main(String[] args){

        Thread thread = new Thread(){
          @Override
          public void run(){
              System.out.println("继承thread，重写run()");
              super.run();
          }
        };
        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("实现runnable接口");
            }
        });
        thread1.start();
    }
}
