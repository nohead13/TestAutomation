package co.uk.Be2.ui.tests.userSignUp;

import co.uk.Be2.ui.tests.BaseTest;
import com.codeborne.selenide.Selectors;
import org.junit.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SignUpAsFemaleMaleTest extends BaseTest {

    @Test
    public void signUpAsNewUser() throws Throwable{
        //MainPage
        open("/");
        $("h1").should(appear);
        $("#regButton").should(appear).click();
        $("#be2_mygender_f").shouldNotBe(selected);
        //under investigation why cant click on #be2_mygender_f
        $("label.ellipsis[for='be2_mygender_f']").click();
        $("#be2_mygender_f").shouldBe(selected);
        $("#be2_email").should(appear).setValue("test+"+ System.currentTimeMillis() +"@maildrop.cc");
        $("#be2_password").should(appear).setValue("qqww1122");
        $("#regButton").should(appear).click();

        //Step1
        $("h1").should(appear).shouldHave(text("Nice to meet you"));
        $("#qval_10000_1").should(appear).click();
        $("#qval_10001_1").should(appear).click();
        $("#qval_10002_1").should(appear).click();
        $("#qval_10003_1").should(appear).click();
        $("#qval_10004_2").should(appear).click();
        $("#qval_10005_1").should(appear).click();
        $("#qval_10006_3").should(appear).click();
        $("#qval_10007_4").should(appear).click();
        $("#step1 button.next").should(appear).click();

        //Step2
        $("h1").should(appear).shouldHave(text("You’re doing well!"));
        $(new Selectors.ByText("20%")).should(appear).should(visible);
        $("#qval_10008_4").should(appear).click();
        $("#qval_10009_4").should(appear).click();
        $("#qval_10010_3").should(appear).click();
        $("#qval_10011_5").should(appear).click();
        $("#qval_10012_3").should(appear).click();

        $("#qval_10013_2").should(appear).click();
        $("#qval_10014_3").should(appear).click();
        $("#qval_10015_4").should(appear).click();
        $("#qval_10016_3").should(appear).click();
        $("#qval_10017_4").should(appear).click();
        $("#step2 button.next").should(appear).click();

        //Step3
        $("h1").should(appear).shouldHave(text("Nice, keep going!"));
        $(new Selectors.ByText("40%")).should(appear).should(visible);
        $("#qval_10018_4").should(appear).click();
        $("#qval_10019_4").should(appear).click();
        $("#qval_10020_4").should(appear).click();
        $("#qval_10021_4").should(appear).click();
        $("#qval_10022_4").should(appear).click();
        $("#qval_10023_4").should(appear).click();
        $("#qval_10024_4").should(appear).click();
        $("#qval_10025_4").should(appear).click();
        $("#qval_10026_4").should(appear).click();
        $("#step3 button.next").should(appear).click();

        //Step4
        $("h1").should(appear).shouldHave(text("Great job."));
        $(new Selectors.ByText("60%")).should(appear).should(visible);
        $("#qval_10027_2").should(appear).click();
        $("#qval_10028_3").should(appear).click();
        $("#qval_10029_4").should(appear).click();
        $("#qval_10030_1").should(appear).click();
        $("#qval_10031_2").should(appear).click();
        $("#qval_10032_4").should(appear).click();

        $("#aboutUs_1").should(appear).click();
        $("#aboutUs").should(appear).click();
        $("#step4 button.next").should(appear).click();

        //Step5
        $("h1").should(appear).shouldHave(text("Finally,"));
        $("h2").should(appear).shouldHave(text("We already have"));
        $(new Selectors.ByText("80%")).should(appear).should(visible);
        $("#nickname").should(appear).setValue("mrtester");
        $("#birthday").should(appear).setValue("12-12-1985");
        $("#size1").should(appear).selectOptionByValue("42");
        $("#eyesColor1").should(appear).selectOptionByValue("4");
        $("#hairColor1").should(appear).selectOptionByValue("4");
        $("#hairLength1").should(appear).selectOptionByValue("1");
        $("#ethnicity1").should(appear).selectOptionByValue("1");
        $("#shape1").should(appear).selectOptionByValue("2");
        $("#profession").should(appear).setValue("Engineer");
        $("#education").should(appear).selectOptionByValue("4");
        $("#drinkingHabits").should(appear).selectOptionByValue("1");
        $("#smokingHabits").should(appear).selectOptionByValue("2");
        $("#qval_10033_2").should(appear).click();
        $("#qval_10034_7").should(appear).click();
        $("#qval_10035_2").should(appear).click();
        $("#step5 button.submit").should(appear).click();

        //WelcomePage
        $("h1").should(appear).shouldHave(text("Your registration was successful"));
        $("#reg-wrapper button").should(appear).click();
        //AppPage
        $("#popup-overlay-popup h3").should(appear).shouldHave(text("Only 3%"));










    }

}
