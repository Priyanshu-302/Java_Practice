package nested_class;

// Create a class Company with a static nested class Employee that prints a message.
class Company {
    static class Employee {
        void show() {
            System.out.println("Employee working");
        }
    }
}

public class static_nested_classes {
    public static void main(String[] args) {
        Company.Employee emp = new Company.Employee();
        emp.show();
    }
}
