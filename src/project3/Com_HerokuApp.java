package project3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Com_HerokuApp {
    public static void main(String[] args) throws InterruptedException {
        //Step:1 Setup Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        // step :2 open the url into browser
        String baseUrl = "http://the-internet.herokuapp.com/login";
        driver.get(baseUrl);
        Thread.sleep(5000);
        //Step:3 Print the title of the page.
        System.out.println("Title of the page:" + driver.getTitle());
        // Step:4 Get Current Url
        System.out.println("The Current Url:" + driver.getCurrentUrl());
        // Step:5 Get page Source
        System.out.println("Page Source:" + driver.getPageSource());
        // Step:6 Find username field  element and type the email
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("Amruta");
        // Step:7 Find password field element and type password
        WebElement passwordFieldLink = driver.findElement(By.name("password"));
        passwordFieldLink.sendKeys("1234");
        // Step:8 Find login link element and click on it
        WebElement loginButton = driver.findElement(By.className("radius"));
        loginButton.click();
        Thread.sleep(5000);
        //Step:9 Print the current url.
        String currentUrl ="http://the-internet.herokuapp.com/login" ;
        System.out.println("Get current Url" + driver.getCurrentUrl());
        //Step:10 refresh the page
        driver.navigate().refresh();
        // Step:11 close the browser
        driver.quit();











    }
}
