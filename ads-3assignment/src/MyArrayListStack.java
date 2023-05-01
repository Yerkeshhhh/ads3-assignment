import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyArrayListStack<E> implements MyStack<E> {

    private MyArrayList<E> myArrayList;


    public MyArrayListStack(){
        myArrayList = new MyArrayList<>();
    }

    @Override
    public void push(E element) {
        myArrayList.add(element);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return myArrayList.remove(myArrayList.size()-1);
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
