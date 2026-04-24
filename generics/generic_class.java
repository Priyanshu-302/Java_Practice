
// Create a generic stack class with push and pop operations.
import java.util.ArrayList;

class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if (list.isEmpty())
            return null;
        return list.remove(list.size() - 1);
    }
}

public class generic_class {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
