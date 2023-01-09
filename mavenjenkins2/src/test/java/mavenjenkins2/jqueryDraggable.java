package mavenjenkins2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class jqueryDraggable {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"D:\\\\ExcelR_OnlineClasses\\\\Tools\\\\Browser_EXE\\\\edgedriver_win64_108.0.1462.54\\\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement draggable = driver.findElement(By.xpath("//a[normalize-space() = 'Draggable']"));
		draggable.click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement start = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(start, 100, 20).build().perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
	}
}
