import java.io.Serializable;
import java.util.EmptyStackException;
import java.util.Stack;

//顺序栈，入栈，出栈。
//pop()与peek()的区别
public class demo8<T> extends Stack<T> implements Serializable {

    private static final long serialVersionUID = -5413303117698554397L;

    private int top = -1;

    private int capacity = 10;

    private T[] array;

    private int size;

    public demo8(int capacity){
        array = (T[]) new Object[capacity];
    }
    public demo8(){
        array = (T[]) new Object[capacity];
    }
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty(){
        return this.top == -1;
    }
    @Override
    public T push(T data){
        if (array.length == size){
            ensureCapacity(size*2 + 1);
        }
        array[++top] =data;

        size++;
        return data;
    }
    @Override
    public T peek(){
        if (isEmpty()){
            new EmptyStackException();
        }
        return array[top];
    }
    @Override
    public T pop(){
        if (isEmpty()){
            new EmptyStackException();
        }
        size--;
        return array[top--];
    }
    @Override
    public void ensureCapacity(int capacity){
        if (capacity < size){
            return;
        }
        T[] old = array;
        array = (T[]) new Object[capacity];

        for(int i = 0;i < size;i++){
            array[i] = old[i];
        };
    }
    public static void main(String[] args){
        demo8<String> d = new demo8<>();
        d.push("A");
        d.push("B");
        d.push("C");
        d.push("A");
        int s1 = d.search("A");
        System.out.println(s1);
        System.out.println("size->" + d.size);
        System.out.println("peek->" + d.peek());
        System.out.println("pop->" + d.pop());
        System.out.println(1);
        int l = d.size;
        for (int i = 0;i < l; i++){
            System.out.println("pop->" + d.pop());
        }
    }
}
