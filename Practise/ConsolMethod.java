import java.io.Console;

public class ConsolMethod {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("enter the user name");
        String userName = console.readLine();
        System.out.println("Enter the password");
        char[] password = console.readPassword();
        String visualPassword = String.valueOf(password);

        if(console!= null){
            System.out.println("userName " + userName);
            System.out.println("password " + visualPassword);
        }
    }
}
