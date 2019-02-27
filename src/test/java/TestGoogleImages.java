import org.junit.Test;

public class TestGoogleImages extends TestBase{  //dopisek słowa extends TestBase sprawia że ta klasa dzieczicy rzeczy z TestBase. TestBase jest taka "formatką"


    @Test
    public void shouldSearchForCatsImages() throws InterruptedException {
        googleMainPage.searchForText("Smieszne koty");
        googleSearchResults.goToImages();
        googleImagesSearchResultsPage.clickOnImage(3); //metoda po wyszukaniu kotów klika w kota z indeksek 2
        Thread.sleep(3000);
    }
}




//WebElement searchInput = driver.findElement(By.name("q")); //definiujemy nazwe zmiennej w tym wypadku "searchInput" (to może być dowolna wymyślona nazwa) i przypisujemy co ma zrobić
//searchInput.sendKeys("śmieszne koty"); // odwołujemy się do wyżej utworzonej zminnej searchInput a po kropce wpisujemy zadanie sendkeys które ma wpisać słwo "śmieszne koty"
// driver.findElement(By.name("q")).sendKeys("śmieszne koty"); //ten sam zapis co powyżej tylko w 1 linijce
//searchInput.submit(); //konstrukcja która odpowiada za wydanie polecenia "wyszukaj" czli submit, ale wczęśniej trzeba się odwołać do zmiennej która wczesniej zdefiniowaliśmy