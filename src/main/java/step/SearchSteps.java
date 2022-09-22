package step;

import automationbase.Base;
import page.SearchPage;

public class SearchSteps  extends Base {
    SearchPage searchPage = new SearchPage();
    public void performASearch(){
        driver.findElement(searchPage.searchTextField).sendKeys("Shirt");
        driver.findElement(searchPage.searchButton).click();
    }
    public boolean searchIconIsDisplay(){

        return  driver.findElement(searchPage.searchHomeButton).isDisplayed();
    }
}
