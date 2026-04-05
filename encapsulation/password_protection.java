package encapsulation;

class Account {
    private String password = "1234";

    public void setPassword(String newPass, String oldPass) {
        if (password.equals(oldPass)) {
            password = newPass;
        } else {
            System.out.println("Incorrect old password.");
        }
    }
}

public class password_protection {
    public static void main(String[] args) {
        Account account = new Account();
        account.setPassword("5678", "1234");
    }
}
