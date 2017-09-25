package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;

    }

    @Before
    public void InitializeTest(Scenario scenario)
    {
        System.out.println("opening the browser   :  MOCK");

        System.setProperty("webdriver.gecko.driver","C:\\Users\\cejas\\Documents\\selenium\\Firefox\\geckodriver.exe");
        base.Driver = new FirefoxDriver();
        //Passing a dummy WebDriver instance

    }

    @After
    public void TearDownTest(Scenario scenario)
    {

        if (scenario.isFailed()) {

            //take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println( "Closing the browser : MOCK");
    }


}
