import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleNewsSearchResultsPage {
    WebDriver driver;


    public GoogleNewsSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getAllHeaders(){  //metoda wyszukuje liste elementów
        return driver.findElements(By.className("l"));
    }

    public String getHeaderText(int index){ //wyciaga text z jakiegos nagłówka z danym indeksem
        List<WebElement> allHeaders=getAllHeaders();
        return allHeaders.get(index).getText();
    }
}
