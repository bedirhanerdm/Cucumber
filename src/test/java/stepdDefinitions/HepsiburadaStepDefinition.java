package stepdDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class HepsiburadaStepDefinition {

    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String istenenUrl) {

        Driver.getDriver().get(istenenUrl);
    }
}
