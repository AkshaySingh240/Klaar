package logo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editlogo {

	public static void main(String[] args) {
	 
		String baseURL = "https://dev.klaarhq.com";
        WebDriver driver = new ChromeDriver();
        
        WebElement usernameInput = driver.findElement(By.id("username-field")).sendKeys("deepa.nayak@gamma.klaar.team");
        WebElement passwordInput = driver.findElement(By.id("password-field")).sendKeys("Klaar2021"); 
        WebElement loginButton = driver.findElement(By.id("loginButton")).loginButton.click();
        
        
        driver.findElement(By.xpath("//button[@data-cy='profile-nav-menu-button']"))
        driver.findElement(By.xpath("//a[@href='/settings/workspace/details']")).click(); 
        
        WebElement chooseFilesButton = driver.findElement(By.xpath("//input[@type='file']")); 
        chooseFilesButton.sendKeys("C:\\Users\\hp\\Desktop\\Solar.png");        
        
        WebElement saveButton = driver.findElement(By.xpath("//button[@data-cy='settings-workspace-logo-save-upload-button']"));
        saveButton.click();
        
        WebElement editButton = driver.findElement(By.xpath("//button[@data-cy='settings-workspace-logo-edit-button']"));
        editButton.click();
        editButton.sendKeys("C:\\Users\\hp\\Desktop\\Solar.png");
                
        
        WebElement deleteButton = driver.findElement(By.xpath("//button[@data-cy='settings-workspace-logo-delete-button']"));
        deleteButton.click();
        
        WebElement deleteButton = driver.findElement(By.xpath("//button[@data-cy='settings-workspace-logo-confirm-delete-button']"));
        deleteButton.click();
        
        driver.quit();
        
        
        
      
		// TODO Auto-generated method stub

	}

}