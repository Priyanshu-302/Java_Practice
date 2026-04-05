package encapsulation;

class C {
    private int age;

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be greater than or equal to 18.");
        }
    }

    public int getAge() {
        return age;
    }
}

public class validation_setter {
    public static void main(String[] args) {
        C person = new C();
        person.setAge(20);
        System.out.println("Age: " + person.getAge());
    }
}
