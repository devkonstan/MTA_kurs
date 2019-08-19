package others;

public class UserNameInOs {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("witaj, " + username);
    }
}
