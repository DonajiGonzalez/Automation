package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando el path 
        System.setProperty("webdriver.chrome.driver" , exePath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();//Inicializando el exe
        driver.get("https://www.mercadolibre.com.mx/");//Iniciar chrome en la url especificada
       
        
    }
}
