public class MyLinkedList<E> implements MyList<E> {

    private Node<E> head;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public boolean add(E e) {
        add(size, e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> prev = null, curr = head; curr != null; prev = curr, curr = curr.next) {
                if (curr.data == null) {
                    unlink(prev, curr);
                    return true;
                }
            }
        } else {
            for (Node<E> prev = null, curr = head; curr != null; prev = curr, curr = curr.next) {
                if (o.equals(curr.data)) {
                    unlink(prev, curr);
                    return true;
                }
            }
        }
        return false;
    }

    private void unlink(Node<E> prev, Node<E> curr) {
        if (prev == null) {
            head = curr.next;
        } else {
            prev.next = curr.next;
        }
        size--;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        Node<E> node = getNode(index);
        return node.data;
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        Node<E> node = getNode(index);
        E oldData = node.data;
        node.data = element;
        return oldData;
    }

    @Override
    public void add(int index, E element) {
        checkIndexForAdd(index);
        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        Node<E> prev = null, curr = head;
        for (int i = 0; i < index; i++) {
            prev = curr;
            curr = curr.next;
        }
        unlink(prev, curr);
        return curr.data;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> curr = head; curr != null; curr = curr.next) {
                if (curr.data == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> curr = head; curr != null; curr = curr.next) {
                if (o.equals(curr.data)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = size - 1;
        int lastIndex = 0;
        if (o == null) {
            for (Node<E> curr = head; curr != null; curr = curr.next) {
                if (o.equals(curr.data)) {
                    lastIndex = index;
                }
                index--;
            }
        }
        return lastIndex;
    }
    private Node<E> getNode(int index) {
        Node<E> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}