package encapsulation;

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class string_encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        System.out.println("Name: " + person.getName());
    }
}
