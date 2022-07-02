import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement campoUsuario = driver.findElement(By.id("user-name"));
        campoUsuario.sendKeys("standard_user");

        WebElement campoSenha = driver.findElement(By.id("password"));
        campoSenha.sendKeys("secret_sauce");

        WebElement botaoLogin = driver.findElement(By.id("login-button"));
        botaoLogin.click();

        WebElement selecionarItem = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        selecionarItem.click();
    }
}
