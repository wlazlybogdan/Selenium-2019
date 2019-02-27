import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestGoogleMovies extends TestBase{
    @Test
    public void shouldSearchForTrains() {
        googleMainPage.searchForText("Pociągi");
        googleSearchResults.goToMovies();
        googleMoviesSearchResultsPage.clickOnMovies(3);
        boolean isTheYoutubeInUrl = driver.getPageSource().contains("youtube");
        assertTrue(isTheYoutubeInUrl);
    }
}
