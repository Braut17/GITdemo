package programs111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class casting1 {

	
public void m1()
{
	System.setProperty("webdriver.edge.driver","C:\\Users\\BHAGYASHREE RAUT\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
    driver.switchTo().frame("iframeResult");
    driver.findElement(By.xpath("//button[@type='button']")).click();
}

}
