public class MyArrayListStack<E> implements MyStack<E> {

    private MyArrayListStack<E> myArrayListStack;

    public MyArrayListStack(){
        myArrayListStack = new MyArrayListStack<>();
    }

    @Override
    public void push(E element) {

    }

    @Override
    public E pop() {
        return null;
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
