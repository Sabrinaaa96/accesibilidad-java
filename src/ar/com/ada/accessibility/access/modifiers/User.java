package ar.com.ada.accessibility.access.modifiers;

public class User {
    protected String nickname;
    protected String password;

    protected void showAttributtesValues() {
        System.out.println("nickname = " + nickname);
        System.out.println("password = " + password);
    }
}
