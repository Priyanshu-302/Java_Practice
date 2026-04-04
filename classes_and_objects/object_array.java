package classes_and_objects;

class Student6 {
    int id;
    String name;

    Student6(int i, String n) {
        id = i;
        name = n;
    }
}


public class object_array {
    public static void main(String[] args) {
        Student6[] arr = new Student6[3];

        arr[0] = new Student6(1, "Priyanshu");
        arr[1] = new Student6(2, "Rahul");
        arr[2] = new Student6(3, "Rohit");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].id + " " + arr[i].name);
        }
    }
}
