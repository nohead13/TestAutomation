package co.uk.Be2.ui.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.TextReport;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;

/**
 * Base class for all UI tests.
 */

public abstract class BaseTest {

    @Rule
    public TestRule report = new TextReport();
    //public TestRule prettyReportCreator = new PrettyReportCreator();

    @BeforeClass
    public static void setUp(){
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.be2.co.uk";
    }
}
