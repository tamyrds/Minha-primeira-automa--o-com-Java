package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class abrirNavegador {

    public void youtubeabrir() {
        browser.navigate().to("https://www.youtube.com/");
    }

    private WebDriver browser;

    public void abrirSiteYouTube() {
        System.setProperty("webdriver.chrome.driver", "C:\\Windows/chromedriver.exe");
        this.browser = new ChromeDriver();
        this.browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browser.manage().window().maximize();

    }


    public void realizarPesquisa(){ browser.findElement(By.name("search_query")).click(); }

    public void fazAPesquisa(){
        browser.findElement(By.name("search_query")).sendKeys("Curso Selenium com java");

    }
    public void fechar()  {

        this.browser.quit();
    }

   }
