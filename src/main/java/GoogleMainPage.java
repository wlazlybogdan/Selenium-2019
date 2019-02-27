import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage  {
    WebDriver driver;

    @FindBy(name="q")
    WebElement searchInput;

    public GoogleMainPage(WebDriver driver){
        this.driver=driver; //ten driver to jest driver z linii 6
        PageFactory.initElements(driver, this);
    }

    public void searchForText(String text){
        searchInput.sendKeys(text);
        searchInput.submit();
    }

    public void clearSearch(){
        searchInput.clear();
    }
}
