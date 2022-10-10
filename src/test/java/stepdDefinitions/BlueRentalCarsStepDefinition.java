package stepdDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentalCarsStepDefinition {


    BlueRentalCarsPage blueRentalCarsPage = new BlueRentalCarsPage();


    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {

        Driver.getDriver().get((ConfigReader.getProperty("bluerentalcars")));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {

        blueRentalCarsPage.logInButton.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {

        blueRentalCarsPage.email.sendKeys("asjcdhasasf@gmail.com");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {

        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.TAB).sendKeys("jasdlvjjad").perform();
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {

        blueRentalCarsPage.logInButton2.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {

        Assert.assertTrue(blueRentalCarsPage.invalidInfo.isDisplayed());
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {

        Driver.closeDriver();
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
