package co.uk.Be2.ui.tests.userLogin;


import co.uk.Be2.ui.pages.MainPage;
import co.uk.Be2.ui.tests.BaseTest;
import com.google.inject.Inject;
import org.junit.Ignore;
import org.junit.Test;

public class LoginTest extends BaseTest {
    @Inject
    MainPage mainPage;

    @Ignore
        /**
         *  User factory not ready yet to use this test. Could be created account on normal email service.
         */
    @Test
    public void useLoginWithExistAccount(){
        String email, passwrd;
        email = "test001@maildrop.cc";
        passwrd = "qqww1122";
        mainPage.doLogin(email,passwrd);
    }
}
