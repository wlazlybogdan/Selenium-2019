import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    WebDriver driver;
    GoogleMainPage googleMainPage; //to co jest w komentarzu niżej musimy zrobić tak jak w tej linice czyli tworzymy googleMainPage a inicjalizujemy i przypisujemy drivera w linijce 20
    GoogleSearchResults googleSearchResults;
    GoogleNewsSearchResultsPage googleNewsSearchResultsPage;
    GoogleFlightsSearchResultsPage googleFlightsSearchResultsPage;
    GoogleImagesSearchResultsPage googleImagesSearchResultsPage;
    GoogleMoviesSearchResultsPage googleMoviesSearchResultsPage;


       // GoogleMainPage googleMainPage=new GoogleMainPage()// nie możemy tak zrobić bo konstruktor wymaga podania drivera
    @Before
    //before tworzymy po to żeby przed każdym testem były wykonane te czynności które są dziedziczone do każdego napisanego testu
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bogdan\\Documents\\selenium2019\\chromedriver.exe");//przyjmuje 2 argumenty. Jaka ma być nazwa właściwości systemowej i jej wartość
        driver =new ChromeDriver(); // gdybyśmy wykorzystwali firefox to musileibyśmy odwoąłać sie do new FirefoxDriver
        driver.manage().window().maximize();

        googleMainPage = new GoogleMainPage(driver); //inicjalizujemy tutaj. Móiwmy od po znaku + od teraz będziesz dla klasy GoogleMainPage przypisywał drivera
        googleSearchResults = new GoogleSearchResults(driver);
        googleNewsSearchResultsPage = new GoogleNewsSearchResultsPage(driver); // inicjalizacja strony
        googleFlightsSearchResultsPage = new GoogleFlightsSearchResultsPage(driver);
        googleImagesSearchResultsPage = new GoogleImagesSearchResultsPage(driver);
        googleMoviesSearchResultsPage = new GoogleMoviesSearchResultsPage(driver);


        driver.get("https://google.pl");  //metoda ta otwiera stronę w nowej zakałdce
    }
    @After
    //w after definiujemy co ma się wykonać po zakończonym teście, czyli w tym przypadku zamknięcie przeglądarki
    public void tearDown(){
        //Thread.sleep(3000); //robi sleep przeglądarki na 3 s. pojawi sie na czerwono, trzeba najechac na sleep i alt+enter żeby dodać wyjątek
        driver.quit(); //zamyka przeglądrake
    }


}
