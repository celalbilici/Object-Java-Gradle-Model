package Steps;

import Base.BaseStep;
import cucumber.api.java.tr.Diyelimki;
import cucumber.api.java.tr.Ve;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterStep extends BaseStep {

    @Diyelimki("^Hepsiburada sayfasini \"([^\"]*)\" acalim$")
    public void hepsiburadaSayfasiniAcalim(String webLink) throws Throwable {
        geturl(webLink);
    }

    @Ve("^\"([^\"]*)\" secenegine tiklanir$")
    public void secenegineTiklanir(String linkName) throws Throwable {
        findElementClick("div#MyAccount.widget.MyAccount", Pather.cssSelector);
        switch (linkName) {

            case "Giriş Yap":

                findElementClick("a#login", Pather.cssSelector);
                break;

            case "Üye Ol":
                findElementClick(linkName, Pather.linkText);
                break;
        }

        Thread.sleep(3000);
    }


    @Ve("^\"([^\"]*)\" alanına \"([^\"]*)\" yazılır$")
    public void alanınaYazılır(String label, String data) throws Throwable {
        findElementSendKeys(label, Pather.id, data);

    }


    @Ve("^giriş butonuna tıklanır$")
    public void girişButonunaTıklanır() throws Throwable {
        findElementClick("button.btn.full.btn-login-submit", Pather.cssSelector);
    }

    @Ve("^kullanıcı ikonun yanında ad soyad kısmının \"([^\"]*)\" olduğu görülür$")
    public void kullanıcıIkonunYanındaAdSoyadKısmınınOlduğunuGörülür(String userName) throws Throwable {
        String name;
        name = findElement("div.usersProsess", Pather.cssSelector, TimeOut.LOW).findElement(By.cssSelector("a.login.user-name")).getText();
        Assert.assertEquals(userName, name);

    }

    @Ve("^arama bölümüne \"([^\"]*)\" yazılıp ara butonuna basılır$")
    public void aramaBölümüneYazılıpAraButonunaBasılır(String product) throws Throwable {
        findElementSendKeys("productSearch", Pather.id, product);
        findElementClick("buttonProductSearch", Pather.id);

    }

    @Ve("^\"([^\"]*)\" adlı ürün seçilir$")
    public void adlıÜrünSeçilir(String arg0) throws Throwable {
        driver.findElements(By.cssSelector("h3.product-title.title")).get(0).click();

    }


    @Ve("^sepete iki adet ürün atılır$")
    public void sepeteIkiAdetÜrünAtılır() throws Throwable {
        findElementClick("div[class='variant-info'][title='Gold']", Pather.cssSelector);
        findElementClick("button#addToCart.button.big.with-icon", Pather.cssSelector);
        Thread.sleep(5000);
        findElementClick("Alışverişe Devam Et", Pather.linkText);
        PageScrolldown();
        findElementClick("div[class='variant-info'][title='Gold']", Pather.cssSelector);
        PageScrolldown();
        Thread.sleep(1000);
        driver.findElements(By.cssSelector("button.add-to-basket.button.small")).get(0).click();
        findElementClick("Sepete devam et", Pather.linkText);
        // findElementClick("//*[@id=\"merchant-list\"]/tbody/tr[2]/td[4]/form/button",Pather.xPath);
        Thread.sleep(1000);
    }

    @Ve("^atılan ürünlerin \"([^\"]*)\" olduğu görülür$")
    public void atılanÜrünlerinOlduğuGörülür(String productName) throws Throwable {
        String product1;
        String product2;
        Thread.sleep(3000);
        product1 = driver.findElements(By.cssSelector("div.product-detail")).get(0).findElement(By.cssSelector("h4.product-name")).getText();
        product2 = driver.findElements(By.cssSelector("div.product-detail")).get(1).findElement(By.cssSelector("h4.product-name")).getText();
        Assert.assertEquals(product1, productName);
        Assert.assertEquals(product2, productName);

    }


}
