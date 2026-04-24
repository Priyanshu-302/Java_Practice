// Create a generic repository class that can store any type of object with add and getAll methods.
import java.util.*;

class Repository<T> {
    private List<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public List<T> getAll() {
        return data;
    }
}

public class generic_repositoty_pattern {
    public static void main(String[] args) {
        Repository<String> repo = new Repository<>();
        repo.add("Hello");
        repo.add("World");
        System.out.println(repo.getAll());
    }
}
