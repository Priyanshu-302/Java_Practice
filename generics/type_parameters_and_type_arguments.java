// Create a generic class Pair<T, U> that stores two values and prints them.

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void print() {
        System.out.println(first + " " + second);
    }
}

public class type_parameters_and_type_arguments {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 21);
        pair.print();
    }
}
