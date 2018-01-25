package co.uk.Be2.ui.tests;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DemoFirstTest extends BaseTest {
    /**
     * Test created to check framework.
     */
    @Ignore
    @Test
    public void userCanSearchKeywordWithGoogle(){
        open("/");
        $("#regButton").click();
    }

    @After
    public void cleanUp(){};

}
