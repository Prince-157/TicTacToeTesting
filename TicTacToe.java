package Project;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TicTacToe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\princ\\eclipse-MobileTesting\\TicTocGame\\src\\apps");
		File fs = new File(f,"tic tac toe.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities(); 
		
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Small Phone API 35");
	      cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	      cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	      
	      AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),cap);
	      
	      
	      Thread.sleep(8000);
	      
	      System.out.println("Application Started");
	      
	      Thread.sleep(5000);
	      
	      WebElement twoplayer = driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\"com.optimesoftware.tictactoe.free:id/twoplayer\"]"));
	      twoplayer.click();
	      
	      Thread.sleep(2000);
	      
	      WebElement firstPlayer1 = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.optimesoftware.tictactoe.free:id/firstPlayer1\"]"));
	      firstPlayer1.click();
	      firstPlayer1.sendKeys("Ram");
	      
	      Thread.sleep(2000);
	      
	      WebElement secondPlayer1 = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.optimesoftware.tictactoe.free:id/secondPlayer1\"]"));
	      secondPlayer1.click();
	      secondPlayer1.sendKeys("Lakhan");
	      
	      Thread.sleep(2000);
	      
	      WebElement start = driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\"com.optimesoftware.tictactoe.free:id/imgstart1\"]"));
	      start.click();
	      
	      Thread.sleep(2000);
	      
	      // First chance to ram 
	      WebElement firstRam1 = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.optimesoftware.tictactoe.free:id/imgview1\"]"));
	      firstRam1.click();
	      
	      Thread.sleep(2000);
	      
	      WebElement secondLakhan1 = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.optimesoftware.tictactoe.free:id/imgview7\"]"));
	      secondLakhan1.click();
	      
	      Thread.sleep(2000);
	      
	      WebElement firstRam2 = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.optimesoftware.tictactoe.free:id/imgview2\"]"));
	      firstRam2.click();
	      
	      Thread.sleep(2000);
	      
	      WebElement secondLakhan2 = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.optimesoftware.tictactoe.free:id/imgview8\"]"));
	      secondLakhan2.click();
	      
	      Thread.sleep(2000);
	      
	      WebElement firstRam3 = driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.optimesoftware.tictactoe.free:id/imgview3\"]"));
	      firstRam3.click();
	      
	      Thread.sleep(2000);
	      
	      System.out.println("Every thing is fine");
	      driver.quit();
	}
}

