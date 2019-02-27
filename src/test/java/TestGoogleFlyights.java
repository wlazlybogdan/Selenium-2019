import org.junit.Test;


public class TestGoogleFlyights extends TestBase{
    @Test
    public void shouldSearchForFlights(){
        googleMainPage.searchForText("Kraków - Maroko");
        googleSearchResults.goToFlights();
    }
}
