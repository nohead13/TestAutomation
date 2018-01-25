package co.uk.Be2.ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage{

    //Login Btn
    private SelenideElement loginBtnField = $("#login-access-btn");
    private SelenideElement loginUsernameField = $("be2_login_username");
    private SelenideElement loginPasswordField = $("#be2_login_password");
    private SelenideElement loginSubmitBtn = $("#be2_loginButton");

    public void doLogin(String email,String password) {
        email = "qq";
        password = "qq";
        loginBtnField.should(appear).click();
        loginUsernameField.should(appear).setValue(email);
        loginPasswordField.should(appear).setValue(password);
        loginSubmitBtn.should(appear).click();
    }

    //SignUp form
    private SelenideElement signUpTopic = $("h1");
    private SelenideElement inputMyGenderWoman = $("#be2_mygender_f");
    private SelenideElement inputMyGenderMan = $("be2_mygender_m");
    private SelenideElement inputLookinForWoman = $("be2_lookingfor_f");
    private SelenideElement inputLookinForMan = $("be2_lookingfor_m");
    private SelenideElement startRegBtn = $("#regButton");

    private SelenideElement emailField = $("#be2_email");
    private SelenideElement passwordField = $("#be2_password");

    public MainPage clickStartRegisterBtn() {
        startRegBtn.should(appear).click();
        return this;
    }
    public MainPage checkSignUpTopic(){
        signUpTopic.should(appear).shouldHave(text("Meet authentic people with serious intentions"));
        return this;
    }
    public MainPage selectMyGenderWoman(){
        inputMyGenderWoman.should(appear).click();
        inputLookinForMan.shouldHave(cssClass("fs-checkbox-checked"));
        return this;
    }


}
