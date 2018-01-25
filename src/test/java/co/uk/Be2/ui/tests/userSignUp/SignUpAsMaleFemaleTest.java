package co.uk.Be2.ui.tests.userSignUp;

import co.uk.Be2.ui.pages.MainPage;
import co.uk.Be2.ui.tests.BaseTest;
import com.google.inject.Inject;
import org.junit.Ignore;
import org.junit.Test;
import com.codeborne.selenide.Selectors;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SignUpAsMaleFemaleTest extends BaseTest{

    @Inject
    MainPage mainPage;

    @Ignore

    @Test
    public void signUpAsNewManUser() throws Throwable{
        open("/");
        //mainPage.checkSignUpTopic();
        mainPage.clickStartRegisterBtn();
    }

}
