import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Methods {
        private WebDriver driver;
        public Methods(WebDriver driver) {
            this.driver = driver;
        }

        private By chapter1Button = By.xpath("/html/body/div[2]/ul/li[1]/a");
        private By homePageButton = By.xpath("/html/body/div[2]/p[4]/a");

        public Methods chapter1Button(){
            driver.findElement(chapter1Button).click();
            return new Methods(driver);
        }
        public Methods homePageButton(){
            driver.findElement(homePageButton).click();
            return new Methods(driver);
        }

}


