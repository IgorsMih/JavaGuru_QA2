package lecture9;

import lecture9.models.User;
import lecture9.models.UserStatic;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestForModels {

    static User user = new User();

    UserStatic userStatic = new UserStatic();

    @BeforeClass
    public static void setupUser() {
        user.setUserName("userName");
        user.setPassword("password");
    }

    @Test
    public void loginToJanisRozeDynamic() {
// ...
        loginToWebPage(user.getUserName(), user.getPassword());
    }

    @Test
    public void loginToJanisRozeStatic() {
// ...
      loginToWebPage(userStatic.getUserName(), userStatic.getPassword());

    }

    private void loginToWebPage(String userName, String password) {

    }

}
