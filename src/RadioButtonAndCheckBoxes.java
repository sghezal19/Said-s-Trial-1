
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class RadioButtonAndCheckBoxes {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Register.html");

        Thread.sleep(2000);
        System.out.println("The title of the page is: " + driver.getTitle());

        WebElement maleRadioOption = driver.findElement(By.xpath("//*[@value='Male']"));
        maleRadioOption.click();
        Thread.sleep(2000);

        List<WebElement> hobbies = driver.findElements(By.xpath("//*[text()='Hobbies']/..//input"));
        hobbies.get(0).click();
        Thread.sleep(2000);
        hobbies.get(2).click();
    }
}
