import model.Model;
import model.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        ArrayList<User> users = new ArrayList<User>();
        users = model.getSelectUser("SELECT * FROM users");
        System.out.println(users.toString());
    }

}
