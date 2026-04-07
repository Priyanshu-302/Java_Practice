package exception_handling;

public class throws_keyword {
    static void test() throws Exception {
        throw new Exception("Something went wrong");
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
