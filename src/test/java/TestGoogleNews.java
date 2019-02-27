import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestGoogleNews extends TestBase{
    @Test
    public void shouldSearchPoland(){
        googleMainPage.searchForText("Polska");
        googleSearchResults.goToNews();
        String secondHeaderText = googleNewsSearchResultsPage.getHeaderText(1); //stworzenie zmiennej i przypisania metody która pobiera daną o indeksie 1
        assertThat(secondHeaderText, containsString("Pracują w Polsce"));
    }

    @Test
    public void shouldSearchElephants(){
        googleMainPage.searchForText("Słonie");
        googleSearchResults.goToNews();
        String firstHeaderText = googleNewsSearchResultsPage.getHeaderText(2);
        assertThat(firstHeaderText, equalTo("Rząd Botswany pozwoli znowu zabijać słonie?"));
    }
}
