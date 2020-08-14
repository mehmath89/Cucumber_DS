package runnerTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BasePage;

import java.util.List;

public class MainPage extends  ElementUtil{



    private By today = By.xpath("(//*[@class='toggle'])[1]/span[1]");
    private By searchBox = By.xpath("(//input[@type='text' and @value])[1]");
    private By searchButton = By.cssSelector(".searchButton");
    private By currentTemp = By.cssSelector(".summary.swap");
    private By allTemps = By.xpath("((//*[@class='temps'])[2]/span)/span[contains(text(), '°')]");
    private By firstTemp = By.xpath("((//*[@class='temps'])[2]/span)/span[contains(text(), '°')][1]");

    public void sendKeysIntoSearchBox() {
        clear(searchBox);
        sendValue(searchBox, "Dayton");
    }
    public void clickOnSearchBtn(){
        clickOn(searchButton);
    }
    public String getCurrentTemp(){
        return  getTextFromElement(currentTemp);

    }
    public void clickOnToday() throws InterruptedException {
        scrollByPixel("0", "600");
        Thread.sleep(1500);
        clickOn(today);

    }
    public void getHighestAndLowestTempANdVerify(){
        String stringFirstTemp = getTextFromElement(firstTemp);
        String text = stringFirstTemp.replaceAll("°", "");
        int intFirstTemp = Integer.parseInt(text);
        int lowest = intFirstTemp;
        int highest = intFirstTemp;
        List<WebElement> allDHourlyTemps = BasePage.get().findElements(allTemps);
        for (int i = 0; i < allDHourlyTemps.size(); i++) {
            String stringTemps = allDHourlyTemps.get(i).getText();
            String text1 = stringTemps.replaceAll("°", "");
            int intTemp = Integer.parseInt(text1);
            if (lowest > intTemp) {
                lowest = intTemp;
            }
            if (highest < intTemp) {
                highest = intTemp;
            }

        }
        System.out.println("Lowest " + lowest + "°");
        System.out.println("Highest " + highest + "°");

    }
}
