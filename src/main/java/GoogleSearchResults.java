import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResults {
    WebDriver driver;

    @FindBy(linkText = "Loty")
    WebElement flightButton;

    @FindBy(linkText = "Wiadomości")
    WebElement newsButton;

    @FindBy(linkText = "Grafika")
    WebElement imagesButton;

    @FindBy(linkText = "Więcej")
    WebElement moreButton;

    @FindBy(linkText = "Filmy")
    WebElement moviesButton;


    public GoogleSearchResults(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void goToFlights(){
        try {
            flightButton.click();

        } catch(NoSuchElementException myExeption){   //trzeba zaimportowac odpowiednia metodę Selenium
            moreButton.click();
            flightButton.click();
        }
    }

    public void goToImages(){ imagesButton.click(); }

    public void goToNews(){
        newsButton.click();
    }

    public void goToMovies(){
        moviesButton.click();
    }

}
