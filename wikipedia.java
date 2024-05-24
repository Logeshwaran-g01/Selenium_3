package Project_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class wikipedia {
    WebDriver driver;
    String url = "https://www.wikipedia.org/";

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test1() throws InterruptedException {
        //Navigate to Artificial intelligence
        driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence");
        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
        driver.findElement(By.xpath("//*[@id=\"toc-History\"]/a/div")).click();
        //print the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);
        Thread.sleep(3000);
    }
}
